package io.github.josehsantos.hack.lang.parser;

import com.intellij.psi.tree.IElementType;
import io.github.josehsantos.hack.lang.HackTypes;

/**
 * Created by josesantos on 25/09/14.
 */
public class NextTokenType {

    final static int Normal = 0x1;
    final static int XhpTag = 0x2;
    final static int XhpTagMaybe = 0x4;
    final static int XhpClassName = 0x8;
    final static int XhpCategoryName = 0x10;
    final static int TypeListMaybe = 0x20;
    final static int LambdaMaybe = 0x40;


    public static int getNextTokenType(IElementType t) {
        if (t.equals(HackTypes.T_EQUAL) || t.equals(HackTypes.T_DOT) || t.equals(HackTypes.T_PLUS) || t.equals(HackTypes.T_MINUS) || t.equals(HackTypes.T_MUL) || t.equals(HackTypes.T_DIV) || t.equals(HackTypes.T_MOD) || t.equals(HackTypes.T_NEGATE) || t.equals(HackTypes.T_NOT) || t.equals(HackTypes.T_AND) || t.equals(HackTypes.T_XOR) || t.equals(HackTypes.T_LESS) || t.equals(HackTypes.T_GREATER) || t.equals(HackTypes.T_QUEST) || t.equals(HackTypes.T_COLON) || t.equals(HackTypes.T_LBRACKET) || t.equals(HackTypes.T_LBRACE) || t.equals(HackTypes.T_SEMICOLON) || t.equals(HackTypes.T_SILENCE) || t.equals(HackTypes.T_LOGICAL_OR) || t.equals(HackTypes.T_LOGICAL_XOR) || t.equals(HackTypes.T_LOGICAL_AND) || t.equals(HackTypes.T_SL) || t.equals(HackTypes.T_SR) || t.equals(HackTypes.T_BOOLEAN_OR) || t.equals(HackTypes.T_BOOLEAN_AND) || t.equals(HackTypes.T_IS_EQUAL) || t.equals(HackTypes.T_IS_NOT_EQUAL) || t.equals(HackTypes.T_IS_IDENTICAL) || t.equals(HackTypes.T_IS_NOT_IDENTICAL) || t.equals(HackTypes.T_IS_SMALLER_OR_EQUAL) || t.equals(HackTypes.T_IS_GREATER_OR_EQUAL) || t.equals(HackTypes.T_PLUS_EQUAL) || t.equals(HackTypes.T_MINUS_EQUAL) || t.equals(HackTypes.T_MUL_EQUAL) || t.equals(HackTypes.T_DIV_EQUAL) || t.equals(HackTypes.T_CONCAT_EQUAL) || t.equals(HackTypes.T_MOD_EQUAL) || t.equals(HackTypes.T_AND_EQUAL) || t.equals(HackTypes.T_OR_EQUAL) || t.equals(HackTypes.T_XOR_EQUAL) || t.equals(HackTypes.T_SL_EQUAL) || t.equals(HackTypes.T_SR_EQUAL) || t.equals(HackTypes.T_ECHO) || t.equals(HackTypes.T_PRINT) || t.equals(HackTypes.T_CLONE) || t.equals(HackTypes.T_EXIT) || t.equals(HackTypes.T_RETURN) || t.equals(HackTypes.T_YIELD) || t.equals(HackTypes.T_AWAIT) || t.equals(HackTypes.T_ASYNC) || t.equals(HackTypes.T_NEW) || t.equals(HackTypes.T_INSTANCEOF) || t.equals(HackTypes.T_DOUBLE_ARROW) || t.equals(HackTypes.T_LAMBDA_ARROW) || t.equals(HackTypes.T_NS_SEPARATOR) || t.equals(HackTypes.T_INLINE_HTML) || t.equals(HackTypes.T_INT_CAST) || t.equals(HackTypes.T_DOUBLE_CAST) || t.equals(HackTypes.T_STRING_CAST) || t.equals(HackTypes.T_ARRAY_CAST) || t.equals(HackTypes.T_OBJECT_CAST) || t.equals(HackTypes.T_BOOL_CAST) || t.equals(HackTypes.T_UNSET_CAST) || t.equals(HackTypes.T_UNRESOLVED_LT) || t.equals(HackTypes.T_AS)) {// case -1:


            return XhpTag |
                    XhpClassName |
                    LambdaMaybe;
        } else if (t.equals(HackTypes.T_COMMA) || t.equals(HackTypes.T_LPAREN) || t.equals(HackTypes.T_OR) || t.equals(HackTypes.T_UNRESOLVED_OP)) {
            return XhpTag |
                    XhpClassName |
                    XhpCategoryName |
                    LambdaMaybe;
        } else if (t.equals(HackTypes.T_RBRACE)) {
            return XhpTagMaybe |
                    XhpClassName |
                    LambdaMaybe;
        } else if (t.equals(HackTypes.T_INC) || t.equals(HackTypes.T_DEC)) {
            return XhpTagMaybe;
        } else if (t.equals(HackTypes.T_EXTENDS) || t.equals(HackTypes.T_CLASS) || t.equals(HackTypes.T_PRIVATE) || t.equals(HackTypes.T_PROTECTED) || t.equals(HackTypes.T_PUBLIC) || t.equals(HackTypes.T_STATIC)) {
            return XhpClassName;
        } else if (t.equals(HackTypes.T_STRING) || t.equals(HackTypes.T_XHP_CHILDREN) || t.equals(HackTypes.T_XHP_REQUIRED) || t.equals(HackTypes.T_ENUM) || t.equals(HackTypes.T_ARRAY) || t.equals(HackTypes.T_FROM) || t.equals(HackTypes.T_IN) || t.equals(HackTypes.T_WHERE) || t.equals(HackTypes.T_JOIN) || t.equals(HackTypes.T_ON) || t.equals(HackTypes.T_EQUALS) || t.equals(HackTypes.T_INTO) || t.equals(HackTypes.T_LET) || t.equals(HackTypes.T_ORDERBY) || t.equals(HackTypes.T_ASCENDING) || t.equals(HackTypes.T_DESCENDING) || t.equals(HackTypes.T_SELECT) || t.equals(HackTypes.T_GROUP) || t.equals(HackTypes.T_BY)) {
            return TypeListMaybe;
        } else if (t.equals(HackTypes.T_XHP_ATTRIBUTE)) {
            return XhpClassName |
                    TypeListMaybe;
        } else if (t.equals(HackTypes.T_XHP_CATEGORY)) {
            return XhpCategoryName |
                    TypeListMaybe;
        } else {
            return Normal;
        }
    }
}
