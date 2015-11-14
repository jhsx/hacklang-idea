package io.github.josehsantos.hack.ide.highlighter;

/**
 * Created by josesantos on 01/11/14.
 */

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.ui.JBColor;
import io.github.josehsantos.hack.lang.HackTypes;
import io.github.josehsantos.hack.lang.parser.HackLexer;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.io.Reader;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class HackSyntaxHighlighter extends SyntaxHighlighterBase {


    public static final TextAttributesKey KEYWORD = createTextAttributesKey("HACK_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey LINE_COMMENT = createTextAttributesKey("HACK_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("HACK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey DOC_COMMENT = createTextAttributesKey("HACK_DOC_COMMENT", DefaultLanguageHighlighterColors.DOC_COMMENT);
    public static final TextAttributesKey USER_ATTRIBUTE = createTextAttributesKey("HACK_USER_ATTRIBUTE", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey STRING = createTextAttributesKey("HACK_STRING", DefaultLanguageHighlighterColors.STRING);
    //
    public static final TextAttributesKey VARIABLE = createTextAttributesKey("HACK_VARIABLE", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey NUMBER = createTextAttributesKey("HACK_NUMBERS", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey HACK_XHP = createTextAttributesKey("HACK_XML", DefaultLanguageHighlighterColors.STRING);



    public static final TextAttributesKey[] HACK_KEYWORDS = new TextAttributesKey[]{KEYWORD};

    public static final TextAttributesKey[] HACK_COMMENT = new TextAttributesKey[]{COMMENT};
    public static final TextAttributesKey[] HACK_LINE_COMMENT = new TextAttributesKey[]{LINE_COMMENT};
    public static final TextAttributesKey[] HACK_DOC_COMMENT = new TextAttributesKey[]{DOC_COMMENT};

    public static final TextAttributesKey[] HACK_STRING = new TextAttributesKey[]{STRING};

    public static final TextAttributesKey[] HACK_USER_ATTRIBUTES = new TextAttributesKey[]{USER_ATTRIBUTE};
    public static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    public static final TextAttributesKey[] HACK_VARIABLE = new TextAttributesKey[]{VARIABLE};
    public static final TextAttributesKey[] HACK_NUMBERS = new TextAttributesKey[]{NUMBER};


    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new FlexAdapter(new HackLexer((Reader) null));
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(HackTypes.T_VARIABLE)) {
            return HACK_VARIABLE;
        } else if (HackTypes.tsKeywords.contains(tokenType)) {
            return HACK_KEYWORDS;
        } else if (HackTypes.tsNumbers.contains(tokenType)) {
            return HACK_NUMBERS;
        } else if (HackTypes.tsStrings.contains(tokenType)) {
            return HACK_STRING;
        } else if (tokenType.equals(HackTypes.T_COMMENT)) {
            return HACK_COMMENT;
        } else if (tokenType.equals(HackTypes.T_LINE_COMMENT)) {
            return HACK_LINE_COMMENT;
        } else if (tokenType.equals(HackTypes.T_DOC_COMMENT)) {
            return HACK_DOC_COMMENT;
        } else if (HackTypes.tsXHPTokens.contains(tokenType)) {
            return new TextAttributesKey[]{HACK_XHP};
        } else {
            return EMPTY_KEYS;
        }
    }
}