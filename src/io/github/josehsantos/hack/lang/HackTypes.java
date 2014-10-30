package io.github.josehsantos.hack.lang;

import com.intellij.psi.tree.IElementType;

/**
 * Created by josesantos on 24/09/14.
 */
public interface HackTypes extends io.github.josehsantos.hack.lang.psi.HackTypes {
    IElementType T_UNRESOLVED_OP = new HackTokenType("T_UNRESOLVED_OP");

    IElementType T_INLINE_HTML= new HackTokenType("T_INLINE_HTML");;
    IElementType T_UNRESOLVED_LT= new HackTokenType("T_UNRESOLVED_LT");;
    IElementType T_HH_ERROR= new HackTokenType("T_HH_ERROR");;
    IElementType T_UNRESOLVED_NEWTYPE= new HackTokenType("T_UNRESOLVED_NEWTYPE");;
    IElementType T_UNRESOLVED_TYPE= new HackTokenType("T_UNRESOLVED_TYPE");;
    IElementType T_BACK_QUOTE= new HackTokenType("T_BACK_QUOTE");;
    IElementType T_CLOSE_TAG= new HackTokenType("T_CLOSE_TAG");;
    IElementType T_DOC_COMMENT= new HackTokenType("T_DOC_COMMENT");;
    IElementType T_COMMENT= new HackTokenType("T_COMMENT");;
    IElementType T_WHITESPACE= new HackTokenType("T_WHITESPACE");;
   // IElementType T_OPEN_TAG= new HackTokenType("T_OPEN_TAG");;
}
