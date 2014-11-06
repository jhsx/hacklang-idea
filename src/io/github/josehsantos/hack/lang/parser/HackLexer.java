package io.github.josehsantos.hack.lang.parser;

import com.intellij.psi.tree.IElementType;
import io.github.josehsantos.hack.lang.HackTypes;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Vector;

/**
 * Created by josesantos on 01/11/14.
 */
public class HackLexer extends _HackLexer {

    private Vector<LexerState> lexerStateStack = new Vector<LexerState>();
    private boolean isTypeListAvailable = false;
    private boolean isFreeLookahead = false;

    @Override
    public void reset(CharSequence buffer, int start, int end, int initialState) {
        super.reset(buffer, start, end, initialState);
        lexerStateStack.clear();
        isFreeLookahead = false;
        isTypeListAvailable = false;
        onReset();
    }

    public HackLexer(Reader in) {
        super(in);
    }

    public HackLexer(InputStream in) {
        super(in);
    }

    public IElementType advance_layer1() throws IOException {

        LexerState saved;


        if (lexerStateStack.size() > 0) {
            saved = lexerStateStack.firstElement();
            lexerStateStack.removeElementAt(0);
            setLexerState(saved);
            return saved.currentElement;
        }

        IElementType iElementType = next_token();

        if (isValidToken(iElementType)) {

            //Type List Resolution Looking Back
            if (isTypeListAvailable) {
                if (iElementType.equals(HackTypes.T_UNRESOLVED_LT)) {
                    iElementType = HackTypes.T_TYPELIST_LT;
                } else if (iElementType.equals(HackTypes.T_IS_NOT_EQUAL) && yytext().charAt(0) == '<') {
                    yypushback(1);
                    iElementType = HackTypes.T_TYPELIST_LT;
                } else if (iElementType.equals(HackTypes.T_SR)) {
                    yypushback(1);
                    iElementType = HackTypes.T_TYPELIST_GT;
                } else if (iElementType.equals(HackTypes.T_GREATER)) {
                    iElementType = HackTypes.T_TYPELIST_GT;
                } else if (iElementType.equals(HackTypes.T_EQUAL) || iElementType.equals(HackTypes.T_LBRACE) || iElementType.equals(HackTypes.T_SEMICOLON)) {
                    isTypeListAvailable = false;
                }
            }

            if (HackTypes.tsInTypeListActivate.contains(iElementType)) {
                isTypeListAvailable = true;
            }

        }

        if (isValidToken(iElementType)) {
            lastToken = iElementType;
        }

        return iElementType;
    }


    @Override
    public IElementType advance() throws IOException {

        LexerState saved;

        Vector<LexerState> lexerStateStack = new Vector<LexerState>();

        IElementType iElementType = advance_layer1();

        if (isValidToken(iElementType)) {


            if (iElementType.equals(HackTypes.T_UNRESOLVED_OP)) {
                saved = getLexerState();
                LexerState savedLastRParen = null;

                for (IElementType iElementType1 = advance_layer1(); iElementType1 != null; iElementType1 = advance_layer1()) {


                    if (iElementType1.equals(HackTypes.T_LAMBDA_ARROW)) {

                        LexerState lexerState = getLexerState();
                        lexerState.currentElement = iElementType1;
                        lexerStateStack.add(lexerState);

                        if (savedLastRParen != null)
                            savedLastRParen.currentElement = HackTypes.T_LAMBDA_CP;

                        setLexerState(saved);
                        this.lexerStateStack = lexerStateStack;
                        return HackTypes.T_LAMBDA_OP;
                    } else {
                        LexerState lexerState = getLexerState();
                        lexerState.currentElement = iElementType1;
                        lexerStateStack.add(lexerState);
                        if (iElementType1.equals(HackTypes.T_RPAREN))
                            savedLastRParen = lexerState;
                    }
                }

                LexerState lexerState = getLexerState();
                lexerState.currentElement = null;
                lexerStateStack.add(lexerState);
                this.lexerStateStack = lexerStateStack;
                setLexerState(saved);
                return HackTypes.T_LPAREN;
            }

        }

        return iElementType;
    }

    private boolean isValidToken(IElementType iElementType) {
        return iElementType != null && !iElementType.equals(HackTypes.T_COMMENT)
                && !iElementType.equals(HackTypes.T_DOC_COMMENT)
                && !iElementType.equals(HackTypes.T_WHITESPACE)
                && !iElementType.equals(HackTypes.T_LINE_COMMENT);
    }
}
