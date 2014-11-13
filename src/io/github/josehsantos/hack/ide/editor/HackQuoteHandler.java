package io.github.josehsantos.hack.ide.editor;

import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler;
import com.intellij.openapi.editor.highlighter.HighlighterIterator;
import com.intellij.psi.tree.IElementType;
import io.github.josehsantos.hack.lang.HackTypes;

/**
 * Created by josesantos on 13/11/14.
 */
public class HackQuoteHandler extends SimpleTokenSetQuoteHandler {

    //TODO: i really don't know what exactly it does, but dart plugin has this, so i think we need...
    public HackQuoteHandler() {
        super(HackTypes.tsStrings);
    }

    public boolean isOpeningQuote(final HighlighterIterator iterator, final int offset) {
        IElementType tokenType = iterator.getTokenType();
        return tokenType == HackTypes.T_DOUBLE_QUOTE || tokenType == HackTypes.T_SINGLE_QUOTE;
    }

    public boolean isClosingQuote(final HighlighterIterator iterator, final int offset) {
        IElementType tokenType = iterator.getTokenType();
        return tokenType == HackTypes.T_DOUBLE_QUOTE || tokenType == HackTypes.T_SINGLE_QUOTE || tokenType == HackTypes.T_CONSTANT_ENCAPSED_STRING;
    }
}
