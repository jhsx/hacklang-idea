package io.github.josehsantos.hack.lang;


import com.intellij.lexer.FlexLexer;
import java.util.ArrayList;
import java.util.List;
import static io.github.josehsantos.hack.lang.NextTokenType.getNextTokenType;
import static io.github.josehsantos.hack.lang.HackTypes.*;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

%%
// Options adn declarations section

%class HackLexer
%implements FlexLexer
%public
%unicode


%type IElementType
%eof{  return;
%eof}

%function advance
%public

%caseless


%{



    private StateStack stack = new StateStack();
    private char yy_old_buffer[] = new char[ZZ_BUFFERSIZE];
    private int yy_old_pushbackPos;
    protected int commentStartPosition;
    private int whitespaceEndPosition;

    private boolean isEndedPhp;

    private IElementType lastToken = null;


    public void BEGIN(int state) {
        yybegin(state);
    }


    private void pushState(int state) {
        stack.pushStack(yystate());
        yybegin(state);
    }

    private void popState() {
        yybegin(stack.popStack());
    }

   private IElementType RETTOKEN(IElementType token){
        lastToken = token;

        return token;
    }
     private IElementType RETSTEP(IElementType token){
        lastToken = token;
        return token;
    }
    private IElementType SETTOKEN(IElementType token){
        lastToken = token;
        return token;
    }

   private IElementType XHP_ONLY_KEYWORD(IElementType token){
        lastToken = token;
        return token;
    }

    private void STEPPOS(IElementType elementType){

    }

   private boolean isHHSyntaxEnabled(){
        return true;
   }


   private boolean isXHPSyntaxEnabled(){
        return true;
   }

   private boolean shortTags(){
        return true;
   }
   private boolean isHHFile(){
        return true;
   }

    private IElementType HH_ONLY_KEYWORD(IElementType token){
        lastToken = token;
        return token;
    }


	@NotNull
	public final CharSequence getBuffer(){
		return zzBuffer;
	}

%}



%x ST_IN_HTML
%x ST_IN_SCRIPTING
%x ST_AFTER_HASHBANG
%x ST_DOUBLE_QUOTES
%x ST_BACKQUOTE
%x ST_HEREDOC
%x ST_NOWDOC
%x ST_END_HEREDOC
%x ST_LOOKING_FOR_PROPERTY
%x ST_LOOKING_FOR_VARNAME
%x ST_LOOKING_FOR_COLON
%x ST_VAR_OFFSET
%x ST_LT_CHECK
%x ST_COMMENT
%x ST_DOC_COMMENT
%x ST_ONE_LINE_COMMENT
%x ST_IN_PHP_OPEN_TAG

%x ST_XHP_IN_TAG
%x ST_XHP_END_SINGLETON_TAG
%x ST_XHP_END_CLOSE_TAG
%x ST_XHP_CHILD
%x ST_XHP_COMMENT



/* to get a Flex debug trace, uncomment %option debug, and uncomment
 * 'yy_flex_debug = 1;' in Scanner::init() below.
 *
 * %option debug
 */


LNUM  =  [0-9]+
DNUM  =  ([0-9]*[\.][0-9]+)|([0-9]+[\.][0-9]*)
BNUM  =  "0b"[01]+
EXPONENT_DNUM =  (({LNUM}|{DNUM})[eE][+-]?{LNUM})
HNUM =   "0x"[0-9a-fA-F]+
LABEL  = [a-zA-Z_\x7f-\xff][a-zA-Z0-9_\x7f-\xff]*
WHITESPACE = [ \n\r\t]+
TABS_AND_SPACES = [ \t]*
TOKENS = [;:,.\[\])|\^&+\-*/=%!~$<>?@]
ANY_CHAR = (.|[\n])
NEWLINE = ("\r"|"\n"|"\r\n")
XHPLABEL = {LABEL}([:-]{LABEL})*
COMMENT_REGEX = ("/*"([^\*]|("*"[^/]))*"*/"|("//"|"#")[^\r\n]*{NEWLINE})
WHITESPACE_AND_COMMENTS = ([ \n\r\t]|({COMMENT_REGEX}))+

/*
 * LITERAL_DOLLAR matches unescaped $ that aren't followed by a label character
 * or a { and therefore will be taken literally. The case of literal $ before
 * a variable or "${" is handled in a rule for each string type
 */
DOUBLE_QUOTES_LITERAL_DOLLAR = ("$"+([^a-zA-Z_\x7f-\xff$\"\\{]|("\\"{ANY_CHAR})))
BACKQUOTE_LITERAL_DOLLAR   =  ("$"+([^a-zA-Z_\x7f-\xff$`\\{]|("\\"{ANY_CHAR})))

/*
 * CHARS matches everything up to a variable or "{$"
 * {'s are matched as long as they aren't followed by a $
 * The case of { before "{$" is handled in a rule for each string type
 *
 * For heredocs, matching continues across/after newlines if/when it's known
 * that the next line doesn't contain a possible ending label
 */
DOUBLE_QUOTES_CHARS = ("{"*([^$\"\\{]|("\\"{ANY_CHAR}))|{DOUBLE_QUOTES_LITERAL_DOLLAR})
BACKQUOTE_CHARS  =   ("{"*([^$`\\{]|("\\"{ANY_CHAR}))|{BACKQUOTE_LITERAL_DOLLAR})


%%



<ST_IN_SCRIPTING>"exit"                 { return RETTOKEN(T_EXIT);}
<ST_IN_SCRIPTING>"die"                  { return RETTOKEN(T_EXIT);}
<ST_IN_SCRIPTING>"function"             { return RETTOKEN(T_FUNCTION);}
<ST_IN_SCRIPTING>"const"                { return RETTOKEN(T_CONST);}
<ST_IN_SCRIPTING>"return"               { return RETTOKEN(T_RETURN); }
<ST_IN_SCRIPTING>"yield"                { return RETTOKEN(T_YIELD);}
<ST_IN_SCRIPTING>"try"                  { return RETTOKEN(T_TRY);}
<ST_IN_SCRIPTING>"catch"                { return RETTOKEN(T_CATCH);}
<ST_IN_SCRIPTING>"finally"              { return RETTOKEN(T_FINALLY);}
<ST_IN_SCRIPTING>"throw"                { return RETTOKEN(T_THROW);}
<ST_IN_SCRIPTING>"if"                   { return RETTOKEN(T_IF);}
<ST_IN_SCRIPTING>"elseif"               { return RETTOKEN(T_ELSEIF);}
<ST_IN_SCRIPTING>"endif"                { return RETTOKEN(T_ENDIF);}
<ST_IN_SCRIPTING>"else"                 { return RETTOKEN(T_ELSE);}
<ST_IN_SCRIPTING>"while"                { return RETTOKEN(T_WHILE);}
<ST_IN_SCRIPTING>"endwhile"             { return RETTOKEN(T_ENDWHILE);}
<ST_IN_SCRIPTING>"do"                   { return RETTOKEN(T_DO);}
<ST_IN_SCRIPTING>"for"                  { return RETTOKEN(T_FOR);}
<ST_IN_SCRIPTING>"endfor"               { return RETTOKEN(T_ENDFOR);}
<ST_IN_SCRIPTING>"foreach"              { return RETTOKEN(T_FOREACH);}
<ST_IN_SCRIPTING>"endforeach"           { return RETTOKEN(T_ENDFOREACH);}
<ST_IN_SCRIPTING>"declare"              { return RETTOKEN(T_DECLARE);}
<ST_IN_SCRIPTING>"enddeclare"           { return RETTOKEN(T_ENDDECLARE);}
<ST_IN_SCRIPTING>"instanceof"           { return RETTOKEN(T_INSTANCEOF);}
<ST_IN_SCRIPTING>"as"                   { return RETTOKEN(T_AS);}
<ST_IN_SCRIPTING>"switch"               { return RETTOKEN(T_SWITCH);}
<ST_IN_SCRIPTING>"endswitch"            { return RETTOKEN(T_ENDSWITCH);}
<ST_IN_SCRIPTING>"case"                 { return RETTOKEN(T_CASE);}
<ST_IN_SCRIPTING>"default"              { return RETTOKEN(T_DEFAULT);}
<ST_IN_SCRIPTING>"break"                { return RETTOKEN(T_BREAK);}
<ST_IN_SCRIPTING>"continue"             { return RETTOKEN(T_CONTINUE);}
<ST_IN_SCRIPTING>"goto"                 { return RETTOKEN(T_GOTO);}
<ST_IN_SCRIPTING>"echo"                 { return RETTOKEN(T_ECHO);}
<ST_IN_SCRIPTING>"print"                { return RETTOKEN(T_PRINT);}
<ST_IN_SCRIPTING>"class"                { return RETTOKEN(T_CLASS);}
<ST_IN_SCRIPTING>"interface"            { return RETTOKEN(T_INTERFACE);}
<ST_IN_SCRIPTING>"trait"                { return RETTOKEN(T_TRAIT);}
<ST_IN_SCRIPTING>"..."                  { return RETTOKEN(T_ELLIPSIS);}
<ST_IN_SCRIPTING>"insteadof"            { return RETTOKEN(T_INSTEADOF);}
<ST_IN_SCRIPTING>"extends"              { return RETTOKEN(T_EXTENDS);}
<ST_IN_SCRIPTING>"implements"           { return RETTOKEN(T_IMPLEMENTS);}
<ST_IN_SCRIPTING>"enum"                 { return XHP_ONLY_KEYWORD(T_ENUM); }
<ST_IN_SCRIPTING>"attribute"            { return XHP_ONLY_KEYWORD(T_XHP_ATTRIBUTE); }
<ST_IN_SCRIPTING>"category"             { return XHP_ONLY_KEYWORD(T_XHP_CATEGORY); }
<ST_IN_SCRIPTING>"children"             { return XHP_ONLY_KEYWORD(T_XHP_CHILDREN); }
<ST_IN_SCRIPTING>"required"             { return XHP_ONLY_KEYWORD(T_XHP_REQUIRED); }



<ST_IN_SCRIPTING>"->" {
        pushState(ST_LOOKING_FOR_PROPERTY);
        return T_OBJECT_OPERATOR;
}

//<ST_LOOKING_FOR_PROPERTY>"->" {
//        return RETTOKEN(T_OBJECT_OPERATOR);
//}

<ST_LOOKING_FOR_PROPERTY>{LABEL} {
        popState();
        return RETTOKEN(T_STRING);
}

<ST_LOOKING_FOR_PROPERTY>{WHITESPACE} {
        return RETTOKEN(T_WHITESPACE);
}

<ST_LOOKING_FOR_PROPERTY>{ANY_CHAR} {
        popState();
}


<ST_IN_SCRIPTING>"::"                { return RETTOKEN(T_DOUBLE_COLON);}
<ST_IN_SCRIPTING>"\\"                { return RETTOKEN(T_NS_SEPARATOR);}
<ST_IN_SCRIPTING>"new"               { return RETTOKEN(T_NEW);}
<ST_IN_SCRIPTING>"clone"             { return RETTOKEN(T_CLONE);}
<ST_IN_SCRIPTING>"var"               { return RETTOKEN(T_VAR);}

//Casts

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}("int"|"integer"){TABS_AND_SPACES}")" {
  if (lastToken != T_FUNCTION) {
    return RETTOKEN(T_INT_CAST);
  }
  yypushback(1);
  return RETTOKEN(T_LPAREN);
}

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}("real"|"double"|"float"){TABS_AND_SPACES}")" {
  if (lastToken != T_FUNCTION) {
    return RETTOKEN(T_DOUBLE_CAST);
  }
  yypushback(1);
  return RETTOKEN(T_LPAREN);
}

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}("string"|"binary"){TABS_AND_SPACES}")" {
  if (lastToken != T_FUNCTION) {
    return RETTOKEN(T_STRING_CAST);
  }
  yypushback(1);
  return RETTOKEN(T_LPAREN);
}

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}"array"{TABS_AND_SPACES}")" {
  if (lastToken != T_FUNCTION) {
    return RETTOKEN(T_ARRAY_CAST);
  }
  yypushback(1);
  return RETTOKEN(T_LPAREN);
}

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}"object"{TABS_AND_SPACES}")" {
  if (lastToken != T_FUNCTION) {
    return RETTOKEN(T_OBJECT_CAST);
  }
  yypushback(1);
  return RETTOKEN(T_LPAREN);
}

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}("bool"|"boolean"){TABS_AND_SPACES}")" {
  if (lastToken != T_FUNCTION) {
    return RETTOKEN(T_BOOL_CAST);
  }
  yypushback(1);
  return RETTOKEN(T_LPAREN);
}

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}("unset"){TABS_AND_SPACES}")" {
  if (lastToken != T_FUNCTION) {
    return RETTOKEN(T_UNSET_CAST);
  }
  yypushback(1);
  return RETTOKEN(T_LPAREN);
}


<ST_IN_SCRIPTING>"callable"           { return RETTOKEN(T_CALLABLE);}
<ST_IN_SCRIPTING>"eval"               { return RETTOKEN(T_EVAL);}
<ST_IN_SCRIPTING>"include"            { return RETTOKEN(T_INCLUDE);}
<ST_IN_SCRIPTING>"include_once"       { return RETTOKEN(T_INCLUDE_ONCE);}
<ST_IN_SCRIPTING>"require"            { return RETTOKEN(T_REQUIRE);}
<ST_IN_SCRIPTING>"require_once"       { return RETTOKEN(T_REQUIRE_ONCE);}
<ST_IN_SCRIPTING>"namespace"          { return RETTOKEN(T_NAMESPACE);}
<ST_IN_SCRIPTING>"use"                { return RETTOKEN(T_USE);}
<ST_IN_SCRIPTING>"global"             { return RETTOKEN(T_GLOBAL);}
<ST_IN_SCRIPTING>"isset"              { return RETTOKEN(T_ISSET);}
<ST_IN_SCRIPTING>"empty"              { return RETTOKEN(T_EMPTY);}
<ST_IN_SCRIPTING>"__halt_compiler"    { return RETTOKEN(T_HALT_COMPILER);}
<ST_IN_SCRIPTING>"__compiler_halt_offset__" { return RETTOKEN(T_COMPILER_HALT_OFFSET);}
<ST_IN_SCRIPTING>"static"             { return RETTOKEN(T_STATIC);}
<ST_IN_SCRIPTING>"abstract"           { return RETTOKEN(T_ABSTRACT);}
<ST_IN_SCRIPTING>"final"              { return RETTOKEN(T_FINAL);}
<ST_IN_SCRIPTING>"private"            { return RETTOKEN(T_PRIVATE);}
<ST_IN_SCRIPTING>"protected"          { return RETTOKEN(T_PROTECTED);}
<ST_IN_SCRIPTING>"public"             { return RETTOKEN(T_PUBLIC);}
<ST_IN_SCRIPTING>"unset"              { return RETTOKEN(T_UNSET);}
<ST_IN_SCRIPTING>"==>"                { return RETTOKEN(T_LAMBDA_ARROW);}
<ST_IN_SCRIPTING>"=>"                 { return RETSTEP(T_DOUBLE_ARROW);}
<ST_IN_SCRIPTING>"list"               { return RETTOKEN(T_LIST);}
<ST_IN_SCRIPTING>"array"              { return RETTOKEN(T_ARRAY);}
<ST_IN_SCRIPTING>"++"                 { return RETSTEP(T_INC);}
<ST_IN_SCRIPTING>"--"                 { return RETSTEP(T_DEC);}
<ST_IN_SCRIPTING>"==="                { return RETSTEP(T_IS_IDENTICAL);}
<ST_IN_SCRIPTING>"!=="                { return RETSTEP(T_IS_NOT_IDENTICAL);}
<ST_IN_SCRIPTING>"=="                 { return RETSTEP(T_IS_EQUAL);}
<ST_IN_SCRIPTING>"!="|"<>"            { return RETSTEP(T_IS_NOT_EQUAL);}
<ST_IN_SCRIPTING>"<="                 { return RETSTEP(T_IS_SMALLER_OR_EQUAL);}
<ST_IN_SCRIPTING>">="                 { return RETSTEP(T_IS_GREATER_OR_EQUAL);}
<ST_IN_SCRIPTING>"+="                 { return RETSTEP(T_PLUS_EQUAL);}
<ST_IN_SCRIPTING>"-="                 { return RETSTEP(T_MINUS_EQUAL);}
<ST_IN_SCRIPTING>"*="                 { return RETSTEP(T_MUL_EQUAL);}
<ST_IN_SCRIPTING>"/="                 { return RETSTEP(T_DIV_EQUAL);}
<ST_IN_SCRIPTING>"**"                 { return RETSTEP(T_POW);}
<ST_IN_SCRIPTING>"**="                { return RETSTEP(T_POW_EQUAL);}
<ST_IN_SCRIPTING>".="                 { return RETSTEP(T_CONCAT_EQUAL);}
<ST_IN_SCRIPTING>"%="                 { return RETSTEP(T_MOD_EQUAL);}
<ST_IN_SCRIPTING>"<<="                { return RETSTEP(T_SL_EQUAL);}
<ST_IN_SCRIPTING>">>="                { return RETSTEP(T_SR_EQUAL);}
<ST_IN_SCRIPTING>"&="                 { return RETSTEP(T_AND_EQUAL);}
<ST_IN_SCRIPTING>"|="                 { return RETSTEP(T_OR_EQUAL);}
<ST_IN_SCRIPTING>"^="                 { return RETSTEP(T_XOR_EQUAL);}
<ST_IN_SCRIPTING>"||"                 { return RETSTEP(T_BOOLEAN_OR);}
<ST_IN_SCRIPTING>"&&"                 { return RETSTEP(T_BOOLEAN_AND);}
<ST_IN_SCRIPTING>"OR"                 { return RETTOKEN(T_LOGICAL_OR);}
<ST_IN_SCRIPTING>"AND"                { return RETTOKEN(T_LOGICAL_AND);}
<ST_IN_SCRIPTING>"XOR"                { return RETTOKEN(T_LOGICAL_XOR);}
<ST_IN_SCRIPTING>"<<"                 { return RETSTEP(T_SL);}

<ST_IN_SCRIPTING>"shape"              { return HH_ONLY_KEYWORD(T_SHAPE); }
<ST_IN_SCRIPTING>"varray"             { return HH_ONLY_KEYWORD(T_VARRAY); }
<ST_IN_SCRIPTING>"miarray"            { return HH_ONLY_KEYWORD(T_MIARRAY); }
<ST_IN_SCRIPTING>"msarray"            { return HH_ONLY_KEYWORD(T_MSARRAY); }
<ST_IN_SCRIPTING>"type"               { return HH_ONLY_KEYWORD(T_UNRESOLVED_TYPE); }
<ST_IN_SCRIPTING>"newtype"            { return HH_ONLY_KEYWORD(T_UNRESOLVED_NEWTYPE); }
<ST_IN_SCRIPTING>"await"              { return HH_ONLY_KEYWORD(T_AWAIT);}
<ST_IN_SCRIPTING>"from"/{WHITESPACE_AND_COMMENTS}\$[a-zA-Z0-9_\x7f-\xff] {
  return HH_ONLY_KEYWORD(T_FROM);
}
<ST_IN_SCRIPTING>"where"              { return HH_ONLY_KEYWORD(T_WHERE); }
<ST_IN_SCRIPTING>"join"               { return HH_ONLY_KEYWORD(T_JOIN); }
<ST_IN_SCRIPTING>"in"                 { return HH_ONLY_KEYWORD(T_IN); }
<ST_IN_SCRIPTING>"on"                 { return HH_ONLY_KEYWORD(T_ON); }
<ST_IN_SCRIPTING>"equals"             { return HH_ONLY_KEYWORD(T_EQUALS); }
<ST_IN_SCRIPTING>"into"               { return HH_ONLY_KEYWORD(T_INTO); }
<ST_IN_SCRIPTING>"let"                { return HH_ONLY_KEYWORD(T_LET); }
<ST_IN_SCRIPTING>"orderby"            { return HH_ONLY_KEYWORD(T_ORDERBY); }
<ST_IN_SCRIPTING>"ascending"          { return HH_ONLY_KEYWORD(T_ASCENDING); }
<ST_IN_SCRIPTING>"descending"         { return HH_ONLY_KEYWORD(T_DESCENDING); }
<ST_IN_SCRIPTING>"select"             { return HH_ONLY_KEYWORD(T_SELECT); }
<ST_IN_SCRIPTING>"group"              { return HH_ONLY_KEYWORD(T_GROUP); }
<ST_IN_SCRIPTING>"by"                 { return HH_ONLY_KEYWORD(T_BY); }
<ST_IN_SCRIPTING>"async"/{WHITESPACE_AND_COMMENTS}[a-zA-Z0-9_\x7f-\xff($] {
  return HH_ONLY_KEYWORD(T_ASYNC);
}

<ST_IN_SCRIPTING>"tuple"/("("|{WHITESPACE_AND_COMMENTS}"(") {
  return HH_ONLY_KEYWORD(T_ARRAY);
}


<ST_IN_SCRIPTING>"?"/":"[a-zA-Z_\x7f-\xff] {
  int ntt = getNextTokenType(lastToken);
  if (!isXHPSyntaxEnabled() ||
      (((ntt & NextTokenType.XhpClassName) > 0) && lastToken != T_RBRACE)) {
    return RETTOKEN(T_QUEST);
  }

  BEGIN(ST_LOOKING_FOR_COLON);
  return RETTOKEN(T_QUEST);
}

<ST_LOOKING_FOR_COLON>":" {
  BEGIN(ST_IN_SCRIPTING);
  return RETTOKEN(T_COLON);
}

<ST_IN_SCRIPTING>">>" {
//  if (getLookaheadLtDepth() < 2) {
//    return RETTOKEN(T_SR);
//  }
  yypushback(1);
  return RETTOKEN(T_GREATER);
}

<ST_IN_SCRIPTING>"<"[a-zA-Z_\x7f-\xff] {

  int ntt = getNextTokenType(lastToken);
  if ((ntt & NextTokenType.XhpTag) > 0) {
    yypushback(1);
    STEPPOS(T_XHP_TAG_LT);
    pushState(ST_XHP_IN_TAG);
    return T_XHP_TAG_LT;
  }
  if ((ntt & NextTokenType.XhpTagMaybe) > 0) {
    // Shift to state state ST_LT_CHECK to do a more extensive check to
    // determine if this is the beginning of an XHP tag.
    BEGIN(ST_LT_CHECK);
    break;
  }
  yypushback(1);
  if (isHHSyntaxEnabled() && ((ntt & NextTokenType.TypeListMaybe) > 0)) {
    // Return T_UNRESOLVED_LT; the scanner will inspect subseqent tokens
    // to resolve this.
    return RETTOKEN(T_UNRESOLVED_LT);
  }
  return RETTOKEN(T_LESS);
}

<ST_IN_SCRIPTING>"<" {
  if (isHHSyntaxEnabled()) {
    int ntt = getNextTokenType(lastToken);
    if ((ntt & NextTokenType.TypeListMaybe) > 0) {
      // Return T_UNRESOLVED_LT; the scanner will inspect subseqent tokens
      // to resolve this.
      return RETTOKEN(T_UNRESOLVED_LT);
    }
  }
  return RETTOKEN(T_LESS);
}

<ST_LT_CHECK>"<"{XHPLABEL}(">"|"/>"|{WHITESPACE_AND_COMMENTS}(">"|"/>"|[a-zA-Z_\x7f-\xff])) {
  BEGIN(ST_IN_SCRIPTING);
  yypushback(1);
  STEPPOS(T_XHP_TAG_LT);
  pushState(ST_XHP_IN_TAG);
  return T_XHP_TAG_LT;
}

<ST_LT_CHECK>"<" {
  BEGIN(ST_IN_SCRIPTING);
  return RETTOKEN(T_LESS);
}

<ST_IN_SCRIPTING>":"{XHPLABEL}  {
  if (isXHPSyntaxEnabled()) {
    int ntt = getNextTokenType(lastToken);
    if ((ntt & NextTokenType.XhpClassName) > 0) {
      RETTOKEN(T_XHP_LABEL);
    }
  }
  yypushback(1);
  return RETTOKEN(T_COLON);
}

<ST_IN_SCRIPTING>"%"{XHPLABEL}  {
  if (isXHPSyntaxEnabled()) {
    int ntt = getNextTokenType(lastToken);
    if ((ntt & NextTokenType.XhpCategoryName) > 0) {
      RETTOKEN(T_XHP_CATEGORY_LABEL);
    }
  }
  yypushback(1);
  return RETTOKEN(T_MOD);
}

<ST_IN_SCRIPTING>"("            {
  if (isHHSyntaxEnabled()) {
    int ntt = getNextTokenType(lastToken);
    if ((ntt & NextTokenType.LambdaMaybe) > 0) {
      return RETTOKEN(T_UNRESOLVED_OP);
    }
  }
  return RETTOKEN(T_LPAREN);
}

//TOKENS = [;:,.\[\])|^&+\-*/=%!~$<>?@]
<ST_IN_SCRIPTING>    ";" {return RETTOKEN(T_SEMICOLON);}
<ST_IN_SCRIPTING>    ":" {return RETTOKEN(T_COLON);}
<ST_IN_SCRIPTING>    "," {return RETTOKEN(T_COMMA);}
<ST_IN_SCRIPTING>    "." {return RETTOKEN(T_DOT);}
<ST_IN_SCRIPTING>    "[" {return RETTOKEN(T_LBRACKET);}
<ST_IN_SCRIPTING>    "]" {return RETTOKEN(T_RBRACKET);}
<ST_IN_SCRIPTING>    ")" {return RETTOKEN(T_RPAREN);}
<ST_IN_SCRIPTING>    "|" {return RETTOKEN(T_OR);}
<ST_IN_SCRIPTING>    "^" {return RETTOKEN(T_XOR);}
<ST_IN_SCRIPTING>    "&" {return RETTOKEN(T_AND);}
<ST_IN_SCRIPTING>    "+" {return RETTOKEN(T_PLUS);}
<ST_IN_SCRIPTING>    "-" {return RETTOKEN(T_MINUS);}
<ST_IN_SCRIPTING>    "*" {return RETTOKEN(T_MUL);}
<ST_IN_SCRIPTING>    "/" {return RETTOKEN(T_DIV);}
<ST_IN_SCRIPTING>    "=" {return RETTOKEN(T_EQUAL);}
<ST_IN_SCRIPTING>    "%" {return RETTOKEN(T_MOD);}
<ST_IN_SCRIPTING>    "!" {return RETTOKEN(T_NEGATE);}
<ST_IN_SCRIPTING>    "~" {return RETTOKEN(T_NOT);}
<ST_IN_SCRIPTING>    "<" {return RETTOKEN(T_LESS);}
<ST_IN_SCRIPTING>    ">" {return RETTOKEN(T_GREATER);}
<ST_IN_SCRIPTING>    "?" {return RETTOKEN(T_QUEST);}
<ST_IN_SCRIPTING>    "@" {return RETTOKEN(T_SILENCE);}
<ST_IN_SCRIPTING>    "$" {return RETTOKEN(T_DOLLAR_SIGN);}



<ST_IN_SCRIPTING>"{" {
        STEPPOS(T_LBRACE);
        pushState(ST_IN_SCRIPTING);
        return RETTOKEN(T_LBRACE);
}

<ST_DOUBLE_QUOTES,ST_BACKQUOTE,ST_HEREDOC>"${" {
        STEPPOS(T_DOLLAR_OPEN_CURLY_BRACES);
        pushState(ST_LOOKING_FOR_VARNAME);
        return RETTOKEN(T_DOLLAR_OPEN_CURLY_BRACES);
}

<ST_IN_SCRIPTING>"}"/":"[a-zA-Z_\x7f-\xff] {
        STEPPOS(T_RBRACE);
        if (stack.size() > 1) {
          int yyS = popState();
          if (yyS == ST_IN_SCRIPTING) {
            BEGIN(ST_LOOKING_FOR_COLON);
          }
        }
        return T_RBRACE;
}

<ST_IN_SCRIPTING>"}" {
        STEPPOS(T_RBRACE);
        if (stack.size()>1) popState();
        return T_RBRACE;
}

<ST_LOOKING_FOR_VARNAME>{LABEL} {
        BEGIN(ST_IN_SCRIPTING);
        return T_STRING_VARNAME;
}

<ST_LOOKING_FOR_VARNAME>{ANY_CHAR} {
        BEGIN(ST_IN_SCRIPTING);
}

<ST_IN_SCRIPTING,ST_XHP_IN_TAG>{LNUM} {
        // Hex literals shouldn't match.
       return RETTOKEN(T_LNUMBER);
}

<ST_IN_SCRIPTING,ST_XHP_IN_TAG>{HNUM} {
        // Check for literals that don't fit in 64-bits.
             return   RETTOKEN(T_ONUMBER);
}

<ST_IN_SCRIPTING,ST_XHP_IN_TAG>{BNUM} {
              return  RETTOKEN(T_LNUMBER);
}


<ST_VAR_OFFSET>0|([1-9][0-9]*) { /* Offset could be treated as a long */
     return  RETTOKEN(T_NUM_STRING);
}

<ST_VAR_OFFSET>{LNUM}|{HNUM}|{BNUM} { /* Offset must be treated as a string */
       return RETTOKEN(T_NUM_STRING);
}

<ST_IN_SCRIPTING,ST_XHP_IN_TAG>{DNUM}|{EXPONENT_DNUM} {
      return  RETTOKEN(T_DNUMBER);
}

<ST_IN_SCRIPTING>"__CLASS__"            { return RETTOKEN(T_CLASS_C); }
<ST_IN_SCRIPTING>"__TRAIT__"            { return RETTOKEN(T_TRAIT_C); }
<ST_IN_SCRIPTING>"__FUNCTION__"         { return RETTOKEN(T_FUNC_C); }
<ST_IN_SCRIPTING>"__METHOD__"           { return RETTOKEN(T_METHOD_C);}
<ST_IN_SCRIPTING>"__LINE__"             { return RETTOKEN(T_LINE); }
<ST_IN_SCRIPTING>"__FILE__"             { return RETTOKEN(T_FILE); }
<ST_IN_SCRIPTING>"__DIR__"              { return RETTOKEN(T_DIR); }
<ST_IN_SCRIPTING>"__NAMESPACE__"        { return RETTOKEN(T_NS_C); }

<YYINITIAL> "#!"[^\n]*"\n" {
        BEGIN(ST_IN_SCRIPTING);
        pushState(ST_AFTER_HASHBANG);
        return T_INLINE_HTML;
}

<YYINITIAL>(([^<#]|"<"[^?%s<]|"#"[^!]){1,400})|"<s"|"<" {
        BEGIN(ST_IN_SCRIPTING);
        pushState(ST_IN_HTML);
        return T_INLINE_HTML;
}

<ST_IN_HTML,ST_AFTER_HASHBANG>(([^<]|"<"[^?%s<]){1,400})|"<s"|"<" {
        BEGIN(ST_IN_HTML);
        return T_INLINE_HTML;
}
//
<YYINITIAL,ST_IN_HTML,ST_AFTER_HASHBANG>"<?"|("<?php"([ \t]|{NEWLINE}))|"<script"{WHITESPACE}+"language"{WHITESPACE}*"="{WHITESPACE}*("php"|"\"php\""|"\'php\'"){WHITESPACE}*">" {
        if (shortTags() ||yylength() > 2) {
          SETTOKEN(T_OPEN_TAG);
          if (yystate() == YYINITIAL) {
            BEGIN(ST_IN_SCRIPTING);
          } else {
            popState();
          }
          return T_OPEN_TAG;
        } else {
          SETTOKEN(T_INLINE_HTML);
          if (yystate() == YYINITIAL) {
            BEGIN(ST_IN_SCRIPTING);
            pushState(ST_IN_HTML);
          } else if (yystate() == ST_AFTER_HASHBANG) {
            BEGIN(ST_IN_HTML);
          }
          return T_INLINE_HTML;
        }
}

  /* this rule, and ST_IN_PHP_OPEN_TAG are specifically for the case where a file */
  /* contains the <?php directive followed directly by an EOF: */
<YYINITIAL>"<?php" {
        BEGIN(ST_IN_PHP_OPEN_TAG);
        return T_OPEN_TAG;
}

<ST_IN_PHP_OPEN_TAG>. {
        return T_HH_ERROR;
}

<YYINITIAL,ST_IN_HTML,ST_AFTER_HASHBANG>"<?=" {
          if (yystate() == YYINITIAL) {
            BEGIN(ST_IN_SCRIPTING);
          } else {
            popState();
          }
          RETTOKEN(T_ECHO); //return T_OPEN_TAG_WITH_ECHO;
}


<YYINITIAL,ST_IN_HTML,ST_AFTER_HASHBANG>"<?hh"([ \t]|{NEWLINE}) {
        if (yystate() == YYINITIAL) {
          BEGIN(ST_IN_SCRIPTING);
        } else if (yystate() == ST_AFTER_HASHBANG) {
          popState();
        } else {
          return T_HH_ERROR;
        }
        STEPPOS(T_OPEN_TAG);
        return T_OPEN_TAG;
}

<ST_IN_SCRIPTING,ST_DOUBLE_QUOTES,ST_HEREDOC,ST_BACKQUOTE,ST_VAR_OFFSET>"$"{LABEL} {
        return T_VARIABLE;
}

<ST_DOUBLE_QUOTES,ST_HEREDOC,ST_BACKQUOTE>"$"{LABEL}"->"[a-zA-Z_\x7f-\xff] {
        yypushback(yylength() - 3);
        pushState(ST_LOOKING_FOR_PROPERTY);
        //setToken(yytext, yylength(), yytext+1, yylength()-1, T_VARIABLE);
        return T_VARIABLE;
}

<ST_DOUBLE_QUOTES,ST_HEREDOC,ST_BACKQUOTE>"$"{LABEL}"[" {
        yypushback(yylength() - 1);
        pushState(ST_VAR_OFFSET);
       // setToken(yytext, yylength(), yytext+1, yylength()-1, T_VARIABLE);
        return T_VARIABLE;
}

<ST_VAR_OFFSET>"]" {
        popState();
        return T_RBRACKET;
}

//<ST_VAR_OFFSET>{TOKENS}|[({}\"`] {
//        /* Only '[' can be valid, but returning other tokens will allow
//           a more explicit parse error */
//        return yytext[0];
//}

<ST_VAR_OFFSET>[ \n\r\t\\\'#] {

        yypushback(0);
        popState();
        return RETTOKEN(T_ENCAPSED_AND_WHITESPACE);
}

<ST_IN_SCRIPTING,ST_VAR_OFFSET>{LABEL} {
       return RETTOKEN(T_STRING);
}

<ST_IN_SCRIPTING,ST_XHP_IN_TAG>{WHITESPACE} {
        return RETTOKEN(T_WHITESPACE);
}

<ST_IN_SCRIPTING,ST_XHP_IN_TAG>"#"|"//" {
        pushState(ST_ONE_LINE_COMMENT);

}

<ST_ONE_LINE_COMMENT>"?"|"%"|">" {

}

//
//<ST_ONE_LINE_COMMENT>[^\n\r?%>]*{ANY_CHAR} {
//        switch (yytext[yylength()-1]) {
//        case '?':
//        case '%':
//        case '>':
//                yypushback(yylength()-1);
//                more();
//                break;
//        default:
//                STEPPOS(T_COMMENT);
//                popState();
//                return T_COMMENT;
//        }
//}

<ST_ONE_LINE_COMMENT>{NEWLINE} {
        STEPPOS(T_COMMENT);
        popState();
        return T_COMMENT;
}

<ST_ONE_LINE_COMMENT>"?>" {

        if (isHHFile()) {
          return T_HH_ERROR;
        }
}

<ST_IN_SCRIPTING,ST_XHP_IN_TAG>"/**"{WHITESPACE} {
        pushState(ST_DOC_COMMENT);

}

<ST_IN_SCRIPTING,ST_XHP_IN_TAG>"/*" {
        pushState(ST_COMMENT);

}

<ST_COMMENT,ST_DOC_COMMENT>[^*]+ {

}

<ST_DOC_COMMENT>"*/" {
        SETTOKEN(T_DOC_COMMENT);
        popState();
        return T_DOC_COMMENT;
}

<ST_COMMENT>"*/" {
        STEPPOS(T_COMMENT);
        popState();
        return T_COMMENT;
}

<ST_COMMENT,ST_DOC_COMMENT>"*" {

}

<ST_XHP_COMMENT>[^-]+ {

}

<ST_XHP_COMMENT>"-->" {
        STEPPOS(T_COMMENT);
        popState();
        return T_COMMENT;
}

<ST_XHP_COMMENT>"-" {

}

<ST_IN_SCRIPTING>"?>"{NEWLINE}? {
        if (isHHFile()) {
          return T_HH_ERROR;
        }
        pushState(ST_IN_HTML);
        if (zzAtEOF) {
          return RETTOKEN(T_CLOSE_TAG);
        } else {
          return RETTOKEN(T_SEMICOLON);
        }
}

<ST_IN_SCRIPTING>"</script"{WHITESPACE}*">"{NEWLINE}? {
        pushState(ST_IN_HTML);
        if (zzAtEOF) {
          return RETTOKEN(T_CLOSE_TAG);
        } else {
          return RETTOKEN(T_SEMICOLON);
        }
}


<ST_IN_SCRIPTING>(b?[\"]{DOUBLE_QUOTES_CHARS}*("{"*|"$"*)[\"]) {
        return T_CONSTANT_ENCAPSED_STRING;
}

<ST_IN_SCRIPTING>(b?[\']([^\'\\]|("\\"{ANY_CHAR}))*[\']?) {
        boolean closed = true;
       // (yytext[yylength() - 1] == '\'');

        return closed ? T_CONSTANT_ENCAPSED_STRING : T_ENCAPSED_AND_WHITESPACE;
}

<ST_IN_SCRIPTING>b?[\"] {
        BEGIN(ST_DOUBLE_QUOTES);
        return T_DOUBLE_QUOTE;
}

//<ST_IN_SCRIPTING>b?"<<<"{TABS_AND_SPACES}({LABEL}|[']{LABEL}[']|["]{LABEL}["]){NEWLINE} {
//        int bprefix = (yytext[0] != '<') ? 1 : 0;
//        int label_len = yylength()-bprefix-3-1-(yytext[yylength()-2]=='\r'?1:0);
//        char *s = yytext+bprefix+3;
//        while ((*s == ' ') || (*s == '\t')) {
//                s++;
//                label_len--;
//        }
//        if (*s == '\'') {
//                s++;
//                label_len -= 2;
//                BEGIN(ST_NOWDOC);
//        } else {
//                if (*s == '"') {
//                       s++;
//                       label_len -= 2;
//                }
//                BEGIN(ST_HEREDOC);
//        }
//        setHeredocLabel(s, label_len);
//        setToken(yytext, yylength(), s, label_len);
//        return T_START_HEREDOC;
//}

<ST_IN_SCRIPTING>[`] {
        STEPPOS(T_BACK_QUOTE);
        BEGIN(ST_BACKQUOTE);
        return T_BACK;
}

<ST_XHP_IN_TAG>{XHPLABEL} {
        RETTOKEN(T_XHP_LABEL);
}

<ST_XHP_IN_TAG>"=" {
  return RETTOKEN(T_EQUAL);
}

<ST_XHP_IN_TAG>[\"][^\"]*[\"] {
 // setToken(yytext, yylength(), yytext+1, yylength()-2);
  return T_XHP_TEXT;
}

<ST_XHP_IN_TAG>[{] {
  STEPPOS(T_LBRACE);
  pushState(ST_IN_SCRIPTING);
  return T_LBRACE;
}

<ST_XHP_IN_TAG>">" {
  STEPPOS(T_XHP_TAG_GT);
  BEGIN(ST_XHP_CHILD);
  return T_XHP_TAG_GT;
}

<ST_XHP_IN_TAG>"/>" {
  BEGIN(ST_XHP_END_SINGLETON_TAG);
  yypushback(1);
  return T_DIV;
}

<ST_XHP_END_SINGLETON_TAG>">" {
  STEPPOS(T_XHP_TAG_GT);
  popState();
  return T_XHP_TAG_GT;
}

<ST_XHP_CHILD>"<!--" {
  pushState(ST_XHP_COMMENT);

}

<ST_XHP_CHILD>[^{<]+ {
  RETTOKEN(T_XHP_TEXT);
}

<ST_XHP_CHILD>"{" {
  STEPPOS(T_LBRACE);
  pushState(ST_IN_SCRIPTING);
  return T_LBRACE;
}

<ST_XHP_CHILD>"</" {
  BEGIN(ST_XHP_END_CLOSE_TAG);
  yypushback(1);
  return RETTOKEN(T_XHP_TAG_LT);
}

<ST_XHP_END_CLOSE_TAG>"/" {
  return RETTOKEN(T_DIV);
}

<ST_XHP_END_CLOSE_TAG>{XHPLABEL} {
  RETTOKEN(T_XHP_LABEL);
}

<ST_XHP_END_CLOSE_TAG>">" {
  STEPPOS(T_XHP_TAG_GT);
  popState();
  return T_XHP_TAG_GT;
}

<ST_XHP_CHILD>"<" {
  STEPPOS(T_XHP_TAG_LT);
  pushState(ST_XHP_IN_TAG);
  return T_XHP_TAG_LT;
}

//<ST_HEREDOC,ST_NOWDOC>{ANY_CHAR} {
//  int refillResult = EOB_ACT_CONTINUE_SCAN;
//  std::vector<std::string> docPieces;
//  size_t totalDocSize = 0;
//  std::string entireDoc;
//  int docLabelLen = getHeredocLabelLen();
//  bool isHeredoc = (YYSTATE == ST_HEREDOC);
//  DECLARE_YYCURSOR;
//  DECLARE_YYLIMIT;
//
//  YYCURSOR--;
//
//  The rules that lead to this state all consume an end-of-line.
//  bool lookingForEndLabel = true;
//
//  while (refillResult == EOB_ACT_CONTINUE_SCAN) {
//    while (YYCURSOR < YYLIMIT) {
//      switch (*YYCURSOR++) {
//        case '\r':
//          lookingForEndLabel = true;
//          continue;
//        case '\n':
//          lookingForEndLabel = true;
//          continue;
//        case '$':
//          lookingForEndLabel = false;
//          if (isHeredoc) {
//            if (YYCURSOR == YYLIMIT) {
//              --YYCURSOR;
//              goto doc_scan_get_more_buffer;
//            }
//            if (IS_LABEL_START(*YYCURSOR) || *YYCURSOR == T_LBRACE) {
//              --YYCURSOR;
//              goto doc_scan_done;
//            }
//          }
//          continue;
//        case T_LBRACE:
//          lookingForEndLabel = false;
//          if (isHeredoc) {
//            if (YYCURSOR == YYLIMIT) {
//              --YYCURSOR;
//              goto doc_scan_get_more_buffer;
//            }
//            if (*YYCURSOR == '$') {
//              --YYCURSOR;
//              goto doc_scan_done;
//            }
//          }
//          continue;
//        case '\\':
//          lookingForEndLabel = false;
//          if (isHeredoc) {
//            if (YYCURSOR == YYLIMIT) {
//              --YYCURSOR;
//              goto doc_scan_get_more_buffer;
//            }
//            if (*YYCURSOR != '\n' && *YYCURSOR != '\r') {
//              YYCURSOR++;
//            }
//          }
//          continue;
//        default:
//          if (lookingForEndLabel) {
//            lookingForEndLabel = false;
//
//            Check for ending label on this line.
//            if (!IS_LABEL_START(YYCURSOR[-1])) continue;
//
//            Adjust cursor to the start of the potential label.
//            If a label is recgonized, we want the cursor pointing at it.
//            --YYCURSOR;
//
//            if ((docLabelLen + 2) > (YYLIMIT - YYCURSOR)) {
//              lookingForEndLabel = true;
//              goto doc_scan_get_more_buffer;
//            }
//
//            if (!memcmp(YYCURSOR, getHeredocLabel(), docLabelLen)) {
//              const char *end = YYCURSOR + docLabelLen;
//              if (*end == ';') {
//                end++;
//              }
//              if (*end == '\n' || *end == '\r') {
//                BEGIN(ST_END_HEREDOC);
//                goto doc_scan_done;
//              }
//            }
//            ++YYCURSOR; // No label found, consume this character.
//          }
//          continue;
//      }
//    }
//
//doc_scan_get_more_buffer:
//    We ran off the end of the buffer, but no end label has been found.
//    Save off the string we have so far, re-fill the buffer, and repeat.
//    yylength() = YYCURSOR - yytext;
//    docPieces.emplace_back(yytext, yylength());
//    if (totalDocSize >= entireDoc.max_size() - yylength()) {
//      error("%sdoc too large", isHeredoc ? "Here" : "Now");
//      return 0;
//    }
//    totalDocSize += yylength();
//
//    yy_get_next_buffer() needs the text pointing at the data we want to keep
    // in the buffer, and the cursor pointing off the end. It will move what's
    // at yytext (if anything) to the beginning of the buffer and fill the rest
    // with new data.
//    yytext = yytext + yylength();
//    yylength() = 0;
//    YYCURSOR = YYLIMIT + 1;
//    refillResult = yy_get_next_buffer(yyscanner);
//
//    Point to the beginning of the (possibly new) buffer.
//    YYCURSOR = yyg->yy_c_buf_p = yytext;
//    YYLIMIT = YY_CURRENT_BUFFER->yy_ch_buf + yyg->yy_n_chars;
//  }
//
//  return 0;
//
//doc_scan_done:
//  yylength() = YYCURSOR - yytext;
//  totalDocSize += yylength();
//  RESET_YYCURSOR;
//
//  if (totalDocSize > 0) {
//    entireDoc.reserve(totalDocSize);
//
//    for (const auto& piece: docPieces) {
//      entireDoc.append(piece);
//    }
//
//    if (yylength() > 0) {
//      entireDoc.append(yytext, yylength());
//    }
//
//    Newline before label will be subtracted from returned text, but
//    raw text will include it, for zend_highlight/strip, tokenizer, etc.
//    int newline = 0;
//    bool endLabelFound = (YYSTATE == ST_END_HEREDOC);
//    if (endLabelFound && (entireDoc.length() > 0)) {
//      auto it = entireDoc.end();
//      if (*--it == '\n') {
//        ++newline;
//        if ((entireDoc.length() > 1) && (*--it == '\r')) {
//          ++newline;
//        }
//      }
//    }
//
//    if (isHeredoc) {
//      std::string escapedDoc = escape(entireDoc.c_str(),
//                                                entireDoc.length() - newline,
//                                                0);
//      setToken(entireDoc.c_str(), entireDoc.length(),
//                         escapedDoc.c_str(), escapedDoc.length());
//    } else {
//      setToken(entireDoc.c_str(), entireDoc.length(),
//                         entireDoc.c_str(), entireDoc.length() - newline);
//    }
//    return T_ENCAPSED_AND_WHITESPACE;
//  } else {
//    No data before the label means we just go right to ST_END_HEREDOC
//    without forming a new token.
//  }
//}

<ST_END_HEREDOC>{LABEL} {
        BEGIN(ST_IN_SCRIPTING);
        return RETTOKEN(T_END_HEREDOC);
}

<ST_DOUBLE_QUOTES,ST_BACKQUOTE,ST_HEREDOC>"{$" {
        //setToken(yytext, 1, yytext, 1);
        pushState(ST_IN_SCRIPTING);
        yypushback(1);
        return T_CURLY_OPEN;
}

<ST_DOUBLE_QUOTES>{DOUBLE_QUOTES_CHARS}+ {
//        std::string strval = escape(yytext, yylength(), '"');
//        setToken(yytext, yylength(), strval.c_str(), strval.length());
        return T_ENCAPSED_AND_WHITESPACE;
}

<ST_DOUBLE_QUOTES>{DOUBLE_QUOTES_CHARS}*("{"{2,200}|"$"{2,200}|(("{"+|"$"+)[\"])) {
//        yypushback(yylength() - 1);
//        std::string strval = escape(yytext, yylength(), '"');
//        setToken(yytext, yylength(), strval.c_str(), strval.length());
        return T_ENCAPSED_AND_WHITESPACE;
}

<ST_BACKQUOTE>{BACKQUOTE_CHARS}+ {
//        std::string strval = escape(yytext, yylength(), T_BACKQUOTE);
//        setToken(yytext, yylength(), strval.c_str(), strval.length());
        return T_ENCAPSED_AND_WHITESPACE;
}

<ST_BACKQUOTE>{BACKQUOTE_CHARS}*("{"{2,5}|"$"{2,5}|(("{"+|"$"+)[`])) {
        yypushback(yylength() - 1);
//        std::string strval = escape(yytext, yylength(), T_BACKQUOTE);
//        setToken(yytext, yylength(), strval.c_str(), strval.length());
        return T_ENCAPSED_AND_WHITESPACE;
}

<ST_DOUBLE_QUOTES>[\"] {
        BEGIN(ST_IN_SCRIPTING);
        return T_DOUBLE_QUOTE;
}

<ST_BACKQUOTE>[\`] {
        BEGIN(ST_IN_SCRIPTING);
        return T_BACK_QUOTE;
}

<ST_COMMENT,ST_DOC_COMMENT><<EOF>> {
//        error("Unterminated comment at end of file");
        return T_UNRESOLVED_LT;
}

<ST_IN_HTML ,ST_IN_SCRIPTING ,ST_AFTER_HASHBANG ,ST_DOUBLE_QUOTES ,ST_BACKQUOTE ,ST_HEREDOC ,ST_NOWDOC ,ST_END_HEREDOC ,ST_LOOKING_FOR_PROPERTY ,ST_LOOKING_FOR_VARNAME ,ST_LOOKING_FOR_COLON ,ST_VAR_OFFSET ,ST_LT_CHECK ,ST_COMMENT ,ST_DOC_COMMENT ,ST_ONE_LINE_COMMENT ,ST_IN_PHP_OPEN_TAG,ST_XHP_IN_TAG ,ST_XHP_END_SINGLETON_TAG ,ST_XHP_END_CLOSE_TAG ,ST_XHP_CHILD ,ST_XHP_COMMENT>{ANY_CHAR} {
//        error("Unexpected character in input: '%c' (ASCII=%d)",
//                        yytext[0], yytext[0]);
}
