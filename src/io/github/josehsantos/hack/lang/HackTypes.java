package io.github.josehsantos.hack.lang;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;

/**
 * Created by josesantos on 24/09/14.
 */
public interface HackTypes extends io.github.josehsantos.hack.lang.psi.HackTypes {

    IElementType T_UNRESOLVED_OP = new HackTokenType("T_UNRESOLVED_OP");

    IElementType T_UNRESOLVED_LT = new HackTokenType("T_UNRESOLVED_LT");
    ;
    IElementType T_HH_ERROR = new HackTokenType("T_HH_ERROR");
    ;
    IElementType T_UNRESOLVED_NEWTYPE = new HackTokenType("T_UNRESOLVED_NEWTYPE");
    ;
    IElementType T_UNRESOLVED_TYPE = new HackTokenType("T_UNRESOLVED_TYPE");
    ;
    IElementType T_BACK_QUOTE = new HackTokenType("T_BACK_QUOTE");
    ;
    IElementType T_DOC_COMMENT = new HackTokenType("T_DOC_COMMENT");
    ;
    IElementType T_COMMENT = new HackTokenType("T_COMMENT");
    IElementType T_LINE_COMMENT = new HackTokenType("T_COMMENT");
    ;
    IElementType T_WHITESPACE = new HackTokenType("T_WHITESPACE");
    ;
    // IElementType T_OPEN_TAG= new HackTokenType("T_OPEN_TAG");;
    IElementType T_BACK = new HackTokenType("T_BACK");
    ;


    TokenSet tsKeywords = TokenSet
            .create(
                    T_EXIT,
                    T_EXIT,
                    T_FUNCTION,
                    T_CONST,
                    T_RETURN,
                    T_YIELD,
                    T_TRY,
                    T_CATCH,
                    T_FINALLY,
                    T_THROW,
                    T_IF,
                    T_ELSEIF,
                    T_ENDIF,
                    T_ELSE,
                    T_WHILE,
                    T_ENDWHILE,
                    T_DO,
                    T_FOR,
                    T_ENDFOR,
                    T_FOREACH,
                    T_ENDFOREACH,
                    T_DECLARE,
                    T_ENDDECLARE,
                    T_INSTANCEOF,
                    T_AS,
                    T_SWITCH,
                    T_ENDSWITCH,
                    T_CASE,
                    T_DEFAULT,
                    T_BREAK,
                    T_CONTINUE,
                    T_GOTO,
                    T_ECHO,
                    T_PRINT,
                    T_CLASS,
                    T_INTERFACE,
                    T_TRAIT,
                    T_ELLIPSIS,
                    T_INSTEADOF,
                    T_EXTENDS,
                    T_IMPLEMENTS,
                    T_ENUM,
                    T_XHP_ATTRIBUTE,
                    T_XHP_CATEGORY,
                    T_XHP_CHILDREN,
                    T_XHP_REQUIRED,
                    T_CALLABLE,
                    T_EVAL,
                    T_INCLUDE,
                    T_INCLUDE_ONCE,
                    T_REQUIRE,
                    T_REQUIRE_ONCE,
                    T_NAMESPACE,
                    T_USE,
                    T_GLOBAL,
                    T_ISSET,
                    T_EMPTY,
                    T_HALT_COMPILER,
                    T_COMPILER_HALT_OFFSET,
                    T_STATIC,
                    T_ABSTRACT,
                    T_FINAL,
                    T_PRIVATE,
                    T_PROTECTED,
                    T_PUBLIC,
                    T_UNSET,
                    T_LIST,
                    T_ARRAY,
                    T_LOGICAL_OR,
                    T_LOGICAL_AND,
                    T_LOGICAL_XOR,
                    T_SHAPE,
                    T_VARRAY,
                    T_MIARRAY,
                    T_MSARRAY,
                    T_UNRESOLVED_TYPE,
                    T_UNRESOLVED_NEWTYPE,
                    T_TYPE,
                    T_NEWTYPE,
                    T_AWAIT,
                    T_FROM,
                    T_WHERE,
                    T_JOIN,
                    T_IN,
                    T_ON,
                    T_EQUALS,
                    T_INTO,
                    T_LET,
                    T_ORDERBY,
                    T_ASCENDING,
                    T_DESCENDING,
                    T_SELECT,
                    T_GROUP,
                    T_BY,
                    T_ASYNC,
                    T_ARRAY,
                    T_CLASS_C,
                    T_TRAIT_C,
                    T_FUNC_C,
                    T_METHOD_C,
                    T_LINE,
                    T_FILE,
                    T_DIR,
                    T_NS_C,
                    T_TRUE,
                    T_FALSE
            );

    TokenSet tsStrings = TokenSet.create(T_ENCAPSED_AND_WHITESPACE, T_CONSTANT_ENCAPSED_STRING, T_DOUBLE_QUOTE);

    TokenSet tsComments = TokenSet.create(T_COMMENT, T_DOC_COMMENT, T_LINE_COMMENT);


    //LexerHelpers
    TokenSet tsInTypeListActivate = TokenSet
            .create(T_FUNCTION
                    , T_CLASS
                    , T_TRAIT
                    , T_INTERFACE
                    , T_EXTENDS
                    , T_IMPLEMENTS
                    , T_NEW
                    , T_NEWTYPE
                    , T_ENUM
                    , T_TYPE
                    , T_USE
                    , T_OBJECT_OPERATOR
            );


    TokenSet tsNumbers = TokenSet.create(
            T_ONUMBER,
            T_DNUMBER,
            T_LNUMBER
    );

    TokenSet tsXHPTokens = TokenSet.create(T_XHP_TAG_GT, T_XHP_TAG_LT, T_XHP_LABEL);


    TokenSet tsIdent = TokenSet.create(T_STRING
            , T_XHP_ATTRIBUTE
            , T_XHP_CATEGORY
            , T_XHP_CHILDREN
            , T_XHP_REQUIRED
            , T_ENUM
            , T_WHERE
            , T_JOIN
            , T_ON
            , T_IN
            , T_EQUALS
            , T_INTO
            , T_LET
            , T_ORDERBY
            , T_ASCENDING
            , T_DESCENDING
            , T_SELECT
            , T_GROUP
            , T_BY
            , T_TRUE
            , T_FALSE);

    TokenSet tsValidInType = TokenSet.create(
            T_FUNCTION,
            T_UNRESOLVED_LT,
            T_GREATER,
            T_UNRESOLVED_OP,
            T_COMMA,
            T_LPAREN,
            T_RPAREN,
            T_COLON,
            T_SHAPE,
            T_ARRAY,
            T_TYPELIST_LT,
            T_TYPELIST_GT,
            T_XHP_LABEL,
            T_CALLABLE,
            T_NS_SEPARATOR,
            T_QUEST,
            T_AS,
            T_SILENCE,
            T_VARIABLE,
            //Idents
            T_STRING
            , T_XHP_ATTRIBUTE
            , T_XHP_CATEGORY
            , T_XHP_CHILDREN
            , T_XHP_REQUIRED
            , T_ENUM
            , T_WHERE
            , T_JOIN
            , T_ON
            , T_IN
            , T_EQUALS
            , T_INTO
            , T_LET
            , T_ORDERBY
            , T_ASCENDING
            , T_DESCENDING
            , T_SELECT
            , T_GROUP
            , T_BY
            , T_TRUE
            , T_FALSE
    );

    TokenSet tsAfterIdentReturnType = TokenSet.create(T_LBRACE, T_UNRESOLVED_LT, T_TYPELIST_GT, T_SEMICOLON);
}
