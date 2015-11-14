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
    private boolean isRecording = false;
    private int lexerStackPtr = -1;
    private IElementType lastToken4Resolver = null;

    private int parensBalance = 0;

    @Override
    public void reset(CharSequence buffer, int start, int end, int initialState) {
        super.reset(buffer, start, end, initialState);
        lexerStateStack.clear();
        isRecording = false;
        lexerStackPtr = -1;
        parensBalance = 0;
        isTypeListAvailable = false;
        onReset();
    }

    public HackLexer(Reader in) {
        super(in);
    }

    public IElementType advance_layer1() throws IOException {

        LexerState saved;


        if (lexerStateStack.size() > 0) {

            if (!isRecording) {
                saved = lexerStateStack.firstElement();
                lexerStateStack.removeElementAt(0);
                setLexerState(saved);

                if (isValidToken(saved.currentElement)) {

//                    if (saved.currentElement.equals(HackTypes.T_UNRESOLVED_OP) || saved.currentElement.equals(HackTypes.T_LPAREN))
//                        parensBalance++;
//
//                    if (saved.currentElement.equals(HackTypes.T_RPAREN))
//                        parensBalance--;

                    lastToken = saved.currentElement;
                }
                return saved.currentElement;
            } else if (lexerStackPtr > -1 && lexerStateStack.size() > (lexerStackPtr + 1)) {
                lexerStackPtr++;
                saved = lexerStateStack.get(lexerStackPtr);
                setLexerState(saved);
                if (isValidToken(saved.currentElement)) {

//                    if (saved.currentElement.equals(HackTypes.T_UNRESOLVED_OP) || saved.currentElement.equals(HackTypes.T_LPAREN))
//                        parensBalance++;
//
//                    if (saved.currentElement.equals(HackTypes.T_RPAREN))
//                        parensBalance--;
                    lastToken = saved.currentElement;
                }
                return saved.currentElement;
            } else {
                lexerStackPtr++;
            }
        } else if (isRecording) {
            lexerStackPtr++;
        }

        IElementType iElementType = next_token();


        if (isValidToken(iElementType)) {

            if (iElementType.equals(HackTypes.T_UNRESOLVED_OP) || iElementType.equals(HackTypes.T_LPAREN))
                parensBalance++;

            if (iElementType.equals(HackTypes.T_RPAREN))
                parensBalance--;

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
                } else if (iElementType.equals(HackTypes.T_EQUAL) || iElementType.equals(HackTypes.T_UNRESOLVED_OP) || iElementType.equals(HackTypes.T_LBRACE) || iElementType.equals(HackTypes.T_RBRACE) || iElementType.equals(HackTypes.T_SEMICOLON)) {
                    isTypeListAvailable = false;
                }
            }

            if (HackTypes.tsInTypeListActivate.contains(iElementType)) {
                isTypeListAvailable = true;
            }

        }

        if (isRecording) {
            LexerState lexerState = getLexerState();
            lexerState.currentElement = iElementType;
            lexerStateStack.add(lexerState);
        }

        if (isValidToken(iElementType)) {
            lastToken = iElementType;
        }

        return iElementType;
    }

    private boolean tokenReturned(LexerState lexerState) {
        for (LexerState state : lexerStateStack) {

            if (lexerState.zzCurrentPos == state.zzCurrentPos &&
                    lexerState.zzMarkedPos == state.zzMarkedPos &&
                    lexerState.zzStartRead == state.zzStartRead &&
                    lexerState.zzPushbackPos == state.zzPushbackPos)
                return true;

        }
        return false;
    }


    public IElementType advance_layer2(boolean fromAdapter) throws IOException {


        if (fromAdapter) {
            isRecording = false;
            lexerStackPtr = -1;
        }

        lastToken4Resolver = lastToken;
        IElementType iElementType = advance_layer1();

        if (isValidToken(iElementType)) {


            if (iElementType.equals(HackTypes.T_UNRESOLVED_OP)) {
                return resolveLParen();
            } else if (iElementType.equals(HackTypes.T_UNRESOLVED_LT)) {
                return HackTypes.T_LESS;
            } else if (iElementType.equals(HackTypes.T_UNRESOLVED_TYPE) || iElementType.equals(HackTypes.T_UNRESOLVED_NEWTYPE)) {

                LexerState saved = getLexerState();
                int myIdx = lexerStackPtr;
                isRecording = true;

                if (!HackTypes.tsIdent.contains(getNextValidToken())) {
                    setLexerState(saved);
                    if (myIdx > -1) {
                        lexerStateStack.get(myIdx).currentElement = HackTypes.T_STRING;
                        lexerStackPtr = myIdx;
                    }
                    return HackTypes.T_STRING;
                }
                setLexerState(saved);
                if (myIdx > -1) {
                    lexerStateStack.get(myIdx).currentElement = iElementType.equals(HackTypes.T_UNRESOLVED_NEWTYPE) ? HackTypes.T_NEWTYPE : HackTypes.T_TYPE;
                    lexerStackPtr = myIdx;
                }

                return iElementType.equals(HackTypes.T_UNRESOLVED_NEWTYPE) ? HackTypes.T_NEWTYPE : HackTypes.T_TYPE;
            }


        }

        return iElementType;

    }

//    private IElementType resolveLT() throws IOException {

//        LexerState saved;
//        LexerState lastGT = null;

//        if (!HackTypes.T_STRING.equals(lastToken4Resolver))
//            return HackTypes.T_LESS;

//        saved = getLexerState();

//        isRecording = true;


//        int myIdx = lexerStackPtr;

//        for (IElementType iElementType1 = advance_layer2(false); iElementType1 != null; iElementType1 = advance_layer2(false)) {
//
//            if (iElementType1.equals(HackTypes.T_DOUBLE_COLON)) {
//
//                setLexerState(saved);
//
//                if (lastGT != null)
//                    lastGT.currentElement = HackTypes.T_TYPELIST_GT;
//
//                if (myIdx > -1) {
//                    lexerStateStack.get(myIdx).currentElement = HackTypes.T_TYPELIST_LT;
//                    lexerStackPtr = myIdx;
//                }

//                return HackTypes.T_TYPELIST_LT;
//
//            } else if (iElementType1.equals(HackTypes.T_GREATER)) {
//                lastGT = lexerStateStack.get(lexerStackPtr);
//            }
//
//            isRecording = true;
//        }
//
//        setLexerState(saved);
//        if (myIdx > -1) {
//            lexerStateStack.get(myIdx).currentElement = HackTypes.T_LESS;
//            lexerStackPtr = myIdx;
//        }
//        return HackTypes.T_LESS;
//    }

    private IElementType resolveLParen() throws IOException {
        LexerState saved;
        LexerState savedLastRParen = null;
        saved = getLexerState();

        int myParensBalance = parensBalance - 1;
        isRecording = true;
        int myIdx = lexerStackPtr;


        int variable = 0;

        for (IElementType iElementType1 = advance_layer2(false); iElementType1 != null; iElementType1 = advance_layer2(false)) {

            if (parensBalance < myParensBalance)
                break;

            if ((myParensBalance + 1) == parensBalance) {
                if (iElementType1.equals(HackTypes.T_VARIABLE))
                    variable++;
            }

            if (iElementType1.equals(HackTypes.T_LAMBDA_ARROW)) {

                if (parensBalance != myParensBalance) {
                    break;
                }

                if (savedLastRParen != null)
                    savedLastRParen.currentElement = HackTypes.T_LAMBDA_CP;

                setLexerState(saved);

                if (myIdx > -1) {
                    lexerStateStack.get(myIdx).currentElement = HackTypes.T_LAMBDA_OP;
                    lexerStackPtr = myIdx;
                }
                return HackTypes.T_LAMBDA_OP;

            } else if (iElementType1.equals(HackTypes.T_LAMBDA_OP)) {
                break;
            } else if (savedLastRParen == null) {
                if (iElementType1.equals(HackTypes.T_FUNCTION) && myParensBalance + 1 == parensBalance) {
                    break;
                } else if (myParensBalance == parensBalance && iElementType1.equals(HackTypes.T_RPAREN)) {

                    if (variable == 0) {
                        if (!lastToken4Resolver.equals(HackTypes.T_UNRESOLVED_OP))
                            break;
                        variable = 0;
                    }

                    savedLastRParen = lexerStateStack.get(lexerStackPtr);
                }
            }

            isRecording = true;
        }

        setLexerState(saved);
        if (myIdx > -1) {
            lexerStateStack.get(myIdx).currentElement = HackTypes.T_LPAREN;
            lexerStackPtr = myIdx;
        }
        return HackTypes.T_LPAREN;
    }


    private IElementType getNextValidToken() throws IOException {
        IElementType iElementType = advance_layer2(false);
        while (!isValidToken(iElementType) && iElementType != null)
            iElementType = advance_layer2(false);
        return iElementType;
    }


    @Override
    public IElementType advance() throws IOException {
        return advance_layer2(true);
    }

    private boolean isValidToken(IElementType iElementType) {
        return iElementType != null && !iElementType.equals(HackTypes.T_COMMENT)
                && !iElementType.equals(HackTypes.T_DOC_COMMENT)
                && !iElementType.equals(HackTypes.T_WHITESPACE)
                && !iElementType.equals(HackTypes.T_LINE_COMMENT);
    }
}
