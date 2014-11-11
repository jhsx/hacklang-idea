package io.github.josehsantos.hack.lang.parser;


import com.intellij.lexer.FlexLexer;
import java.util.ArrayList;
import java.util.List;
import static io.github.josehsantos.hack.lang.parser.NextTokenType.getNextTokenType;
import static io.github.josehsantos.hack.lang.HackTypes.*;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import io.github.josehsantos.hack.lang.parser.managers.*;

%%
// Options adn declarations section

%class _HackLexer
%abstract
%implements FlexLexer
%public
%unicode


%type IElementType
%eof{  return;
%eof}

%function next_token
%public

%caseless


%{



   private StateStack stack = new StateStack();

   protected IElementType lastToken = null;

   private void pushState(int state) {
        stack.pushStack(yystate());
        yybegin(state);
   }

   private int popState() {
       int st= stack.popStack();
       yybegin(st);
       return st;
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

    /*
        TODO: STRING, HEREDOC
     */
   	//	private StatesManager sManager = new StatesManager(this);
    //	private HeredocManager hdManager = new HeredocManager(this, sManager);
   	private LineCommentManager lcManager = new LineCommentManager(this);

   	@NotNull
   	public final CharSequence getBuffer(){
   		return zzBuffer;
   	}

    public final LexerState getLexerState(){
        return new LexerState(zzCurrentPos, zzMarkedPos, zzStartRead, zzPushbackPos);
    }

    public final void setLexerState(LexerState state){
        zzCurrentPos = state.zzCurrentPos;
         zzMarkedPos = state.zzMarkedPos;
         zzStartRead = state.zzStartRead;
        zzPushbackPos= state.zzPushbackPos;
    }


   	protected void onReset(){
//   		opManager.reset();
            stack.reset();
       		lcManager.reset();
//   		sManager.reset();
//   		hdManager.reset();
//   		brcManager = null;
//
//   		sManager.toState(initialState);
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
COMMENT_REGEX = "/*"([^\*]|("*"[^/]))*"*/"
DOC_COMMENT_REGEX = "/**"([^\*]|("*"[^/]))*"*/"
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



<ST_IN_SCRIPTING>"exit"                 { return T_EXIT;}
<ST_IN_SCRIPTING>"die"                  { return T_EXIT;}
<ST_IN_SCRIPTING>"function"             { return T_FUNCTION;}
<ST_IN_SCRIPTING>"const"                { return T_CONST;}
<ST_IN_SCRIPTING>"return"               { return T_RETURN; }
<ST_IN_SCRIPTING>"yield"                { return T_YIELD;}
<ST_IN_SCRIPTING>"try"                  { return T_TRY;}
<ST_IN_SCRIPTING>"catch"                { return T_CATCH;}
<ST_IN_SCRIPTING>"finally"              { return T_FINALLY;}
<ST_IN_SCRIPTING>"throw"                { return T_THROW;}
<ST_IN_SCRIPTING>"if"                   { return T_IF;}
<ST_IN_SCRIPTING>"elseif"               { return T_ELSEIF;}
<ST_IN_SCRIPTING>"endif"                { return T_ENDIF;}
<ST_IN_SCRIPTING>"else"                 { return T_ELSE;}
<ST_IN_SCRIPTING>"while"                { return T_WHILE;}
<ST_IN_SCRIPTING>"endwhile"             { return T_ENDWHILE;}
<ST_IN_SCRIPTING>"do"                   { return T_DO;}
<ST_IN_SCRIPTING>"for"                  { return T_FOR;}
<ST_IN_SCRIPTING>"endfor"               { return T_ENDFOR;}
<ST_IN_SCRIPTING>"foreach"              { return T_FOREACH;}
<ST_IN_SCRIPTING>"endforeach"           { return T_ENDFOREACH;}
<ST_IN_SCRIPTING>"declare"              { return T_DECLARE;}
<ST_IN_SCRIPTING>"enddeclare"           { return T_ENDDECLARE;}
<ST_IN_SCRIPTING>"instanceof"           { return T_INSTANCEOF;}
<ST_IN_SCRIPTING>"as"                   { return T_AS;}
<ST_IN_SCRIPTING>"switch"               { return T_SWITCH;}
<ST_IN_SCRIPTING>"endswitch"            { return T_ENDSWITCH;}
<ST_IN_SCRIPTING>"case"                 { return T_CASE;}
<ST_IN_SCRIPTING>"default"              { return T_DEFAULT;}
<ST_IN_SCRIPTING>"break"                { return T_BREAK;}
<ST_IN_SCRIPTING>"continue"             { return T_CONTINUE;}
<ST_IN_SCRIPTING>"goto"                 { return T_GOTO;}
<ST_IN_SCRIPTING>"echo"                 { return T_ECHO;}
<ST_IN_SCRIPTING>"print"                { return T_PRINT;}
<ST_IN_SCRIPTING>"class"                { return T_CLASS;}
<ST_IN_SCRIPTING>"interface"            { return T_INTERFACE;}
<ST_IN_SCRIPTING>"trait"                { return T_TRAIT;}
<ST_IN_SCRIPTING>"..."                  { return T_ELLIPSIS;}
<ST_IN_SCRIPTING>"insteadof"            { return T_INSTEADOF;}
<ST_IN_SCRIPTING>"extends"              { return T_EXTENDS;}
<ST_IN_SCRIPTING>"implements"           { return T_IMPLEMENTS;}
<ST_IN_SCRIPTING>"enum"                 { return T_ENUM; }
<ST_IN_SCRIPTING>"attribute"            { return T_XHP_ATTRIBUTE; }
<ST_IN_SCRIPTING>"category"             { return T_XHP_CATEGORY; }
<ST_IN_SCRIPTING>"children"             { return T_XHP_CHILDREN; }
<ST_IN_SCRIPTING>"required"             { return T_XHP_REQUIRED; }



<ST_IN_SCRIPTING>"->" {
        pushState(ST_LOOKING_FOR_PROPERTY);
        return T_OBJECT_OPERATOR;
}

//<ST_LOOKING_FOR_PROPERTY>"->" {
//        return T_OBJECT_OPERATOR;
//}

<ST_LOOKING_FOR_PROPERTY>{LABEL} {
        popState();
        return T_STRING;
}

<ST_LOOKING_FOR_PROPERTY>{WHITESPACE} {
        return T_WHITESPACE;
}

<ST_LOOKING_FOR_PROPERTY>{ANY_CHAR} {
        popState();
        yypushback(1);
}


<ST_IN_SCRIPTING>"::"                { return T_DOUBLE_COLON;}
<ST_IN_SCRIPTING>"\\"                { return T_NS_SEPARATOR;}
<ST_IN_SCRIPTING>"new"               { return T_NEW;}
<ST_IN_SCRIPTING>"clone"             { return T_CLONE;}
<ST_IN_SCRIPTING>"var"               { return T_VAR;}

//Casts

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}("int"|"integer"){TABS_AND_SPACES}")" {
  if (lastToken != T_FUNCTION) {
    return T_INT_CAST;
  }
  yypushback(yylength()-1);
  return T_LPAREN;
}

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}("real"|"double"|"float"){TABS_AND_SPACES}")" {
  if (lastToken != T_FUNCTION) {
    return T_DOUBLE_CAST;
  }
  yypushback(yylength()-1);
  return T_LPAREN;
}

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}("string"|"binary"){TABS_AND_SPACES}")" {
  if (lastToken != T_FUNCTION) {
    return T_STRING_CAST;
  }
  yypushback(yylength()-1);
  return T_LPAREN;
}

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}"array"{TABS_AND_SPACES}")" {
  if (lastToken != T_FUNCTION) {
    return T_ARRAY_CAST;
  }
  yypushback(yylength()-1);
  return T_LPAREN;
}

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}"object"{TABS_AND_SPACES}")" {
  if (lastToken != T_FUNCTION) {
    return T_OBJECT_CAST;
  }
  yypushback(yylength()-1);
  return T_LPAREN;
}

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}("bool"|"boolean"){TABS_AND_SPACES}")" {
  if (lastToken != T_FUNCTION) {
    return T_BOOL_CAST;
  }
  yypushback(yylength()-1);
  return T_LPAREN;
}

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}("unset"){TABS_AND_SPACES}")" {
  if (lastToken != T_FUNCTION) {
    return T_UNSET_CAST;
  }
  yypushback(yylength()-1);
  return T_LPAREN;
}


<ST_IN_SCRIPTING>"callable"           { return T_CALLABLE;}
<ST_IN_SCRIPTING>"eval"               { return T_EVAL;}
<ST_IN_SCRIPTING>"include"            { return T_INCLUDE;}
<ST_IN_SCRIPTING>"include_once"       { return T_INCLUDE_ONCE;}
<ST_IN_SCRIPTING>"require"            { return T_REQUIRE;}
<ST_IN_SCRIPTING>"require_once"       { return T_REQUIRE_ONCE;}
<ST_IN_SCRIPTING>"namespace"          { return T_NAMESPACE;}
<ST_IN_SCRIPTING>"use"                { return T_USE;}
<ST_IN_SCRIPTING>"global"             { return T_GLOBAL;}
<ST_IN_SCRIPTING>"isset"              { return T_ISSET;}
<ST_IN_SCRIPTING>"empty"              { return T_EMPTY;}
<ST_IN_SCRIPTING>"__halt_compiler"    { return T_HALT_COMPILER;}
<ST_IN_SCRIPTING>"__compiler_halt_offset__" { return T_COMPILER_HALT_OFFSET;}
<ST_IN_SCRIPTING>"static"             { return T_STATIC;}
<ST_IN_SCRIPTING>"abstract"           { return T_ABSTRACT;}
<ST_IN_SCRIPTING>"final"              { return T_FINAL;}
<ST_IN_SCRIPTING>"private"            { return T_PRIVATE;}
<ST_IN_SCRIPTING>"protected"          { return T_PROTECTED;}
<ST_IN_SCRIPTING>"public"             { return T_PUBLIC;}
<ST_IN_SCRIPTING>"unset"              { return T_UNSET;}
<ST_IN_SCRIPTING>"list"               { return T_LIST;}
<ST_IN_SCRIPTING>"array"              { return T_ARRAY;}
<ST_IN_SCRIPTING>"==>"                { return T_LAMBDA_ARROW;}
<ST_IN_SCRIPTING>"=>"                 { return T_DOUBLE_ARROW;}
<ST_IN_SCRIPTING>"++"                 { return T_INC;}
<ST_IN_SCRIPTING>"--"                 { return T_DEC;}
<ST_IN_SCRIPTING>"==="                { return T_IS_IDENTICAL;}
<ST_IN_SCRIPTING>"!=="                { return T_IS_NOT_IDENTICAL;}
<ST_IN_SCRIPTING>"=="                 { return T_IS_EQUAL;}
<ST_IN_SCRIPTING>"!="|"<>"            { return T_IS_NOT_EQUAL;}
<ST_IN_SCRIPTING>"<="                 { return T_IS_SMALLER_OR_EQUAL;}
<ST_IN_SCRIPTING>">="                 { return T_IS_GREATER_OR_EQUAL;}
<ST_IN_SCRIPTING>"+="                 { return T_PLUS_EQUAL;}
<ST_IN_SCRIPTING>"-="                 { return T_MINUS_EQUAL;}
<ST_IN_SCRIPTING>"*="                 { return T_MUL_EQUAL;}
<ST_IN_SCRIPTING>"/="                 { return T_DIV_EQUAL;}
<ST_IN_SCRIPTING>"**"                 { return T_POW;}
<ST_IN_SCRIPTING>"**="                { return T_POW_EQUAL;}
<ST_IN_SCRIPTING>".="                 { return T_CONCAT_EQUAL;}
<ST_IN_SCRIPTING>"%="                 { return T_MOD_EQUAL;}
<ST_IN_SCRIPTING>"<<="                { return T_SL_EQUAL;}
<ST_IN_SCRIPTING>">>="                { return T_SR_EQUAL;}
<ST_IN_SCRIPTING>"&="                 { return T_AND_EQUAL;}
<ST_IN_SCRIPTING>"|="                 { return T_OR_EQUAL;}
<ST_IN_SCRIPTING>"^="                 { return T_XOR_EQUAL;}
<ST_IN_SCRIPTING>"||"                 { return T_BOOLEAN_OR;}
<ST_IN_SCRIPTING>"&&"                 { return T_BOOLEAN_AND;}
<ST_IN_SCRIPTING>"OR"                 { return T_LOGICAL_OR;}
<ST_IN_SCRIPTING>"AND"                { return T_LOGICAL_AND;}
<ST_IN_SCRIPTING>"XOR"                { return T_LOGICAL_XOR;}
<ST_IN_SCRIPTING>"<<"                 { return T_SL;}

<ST_IN_SCRIPTING>"shape"              { return T_SHAPE; }
<ST_IN_SCRIPTING>"varray"             { return T_VARRAY; }
<ST_IN_SCRIPTING>"miarray"            { return T_MIARRAY; }
<ST_IN_SCRIPTING>"msarray"            { return T_MSARRAY; }
<ST_IN_SCRIPTING>"type"               { return T_UNRESOLVED_TYPE; }
<ST_IN_SCRIPTING>"newtype"            { return T_UNRESOLVED_NEWTYPE; }
<ST_IN_SCRIPTING>"await"              { return T_AWAIT;}
<ST_IN_SCRIPTING>"from"/{WHITESPACE_AND_COMMENTS}\$[a-zA-Z0-9_\x7f-\xff] {
  return T_FROM;
}
<ST_IN_SCRIPTING>"where"              { return T_WHERE; }
<ST_IN_SCRIPTING>"join"               { return T_JOIN; }
<ST_IN_SCRIPTING>"in"                 { return T_IN; }
<ST_IN_SCRIPTING>"on"                 { return T_ON; }
<ST_IN_SCRIPTING>"equals"             { return T_EQUALS; }
<ST_IN_SCRIPTING>"into"               { return T_INTO; }
<ST_IN_SCRIPTING>"let"                { return T_LET; }
<ST_IN_SCRIPTING>"orderby"            { return T_ORDERBY; }
<ST_IN_SCRIPTING>"ascending"          { return T_ASCENDING; }
<ST_IN_SCRIPTING>"descending"         { return T_DESCENDING; }
<ST_IN_SCRIPTING>"select"             { return T_SELECT; }
<ST_IN_SCRIPTING>"group"              { return T_GROUP; }
<ST_IN_SCRIPTING>"by"                 { return T_BY; }
<ST_IN_SCRIPTING>"async"/{WHITESPACE_AND_COMMENTS}[a-zA-Z0-9_\x7f-\xff($] {
  return T_ASYNC;
}

<ST_IN_SCRIPTING>"tuple"/("("|{WHITESPACE_AND_COMMENTS}"(") {
  return T_TUPLE;
}


<ST_IN_SCRIPTING>"?"/":"[a-zA-Z_\x7f-\xff] {
  int ntt = getNextTokenType(lastToken);
  if (!isXHPSyntaxEnabled() ||
      (((ntt & NextTokenType.XhpClassName) > 0) && lastToken != T_RBRACE)) {
    return T_QUEST;
  }

  yybegin(ST_LOOKING_FOR_COLON);
  return T_QUEST;
}

<ST_LOOKING_FOR_COLON>":" {
  yybegin(ST_IN_SCRIPTING);
  return T_COLON;
}

<ST_IN_SCRIPTING>">>" {
  return T_SR;
}

<ST_IN_SCRIPTING>"<"[a-zA-Z_\x7f-\xff] {

  int ntt = getNextTokenType(lastToken);
  yypushback(1);

  if ((ntt & NextTokenType.XhpTag) > 0) {
    pushState(ST_XHP_IN_TAG);
    return T_XHP_TAG_LT;
  }
  if ((ntt & NextTokenType.XhpTagMaybe) > 0) {
    // Shift to state state ST_LT_CHECK to do a more extensive check to
    // determine if this is the beginning of an XHP tag.
    yybegin(ST_LT_CHECK);
    break;
  }
  if (isHHSyntaxEnabled() && ((ntt & NextTokenType.TypeListMaybe) > 0)) {
    // Return T_UNRESOLVED_LT; the scanner will inspect subseqent tokens
    // to resolve this.
    return T_UNRESOLVED_LT;
  }
  return T_LESS;
}

<ST_IN_SCRIPTING>"<" {
  if (isHHSyntaxEnabled()) {
    int ntt = getNextTokenType(lastToken);
    if ((ntt & NextTokenType.TypeListMaybe) > 0) {
      // Return T_UNRESOLVED_LT; the scanner will inspect subseqent tokens
      // to resolve this.
      return T_UNRESOLVED_LT;
    }
  }
  return T_LESS;
}

<ST_LT_CHECK>"<"{XHPLABEL}(">"|"/>"|{WHITESPACE_AND_COMMENTS}(">"|"/>"|[a-zA-Z_\x7f-\xff])) {
  yypushback(yylength()-1);
  yybegin(ST_IN_SCRIPTING);
  pushState(ST_XHP_IN_TAG);
  return T_XHP_TAG_LT;
}

<ST_LT_CHECK>"<" {
  yybegin(ST_IN_SCRIPTING);
  return T_LESS;
}

<ST_IN_SCRIPTING>":"{XHPLABEL}  {
  if (isXHPSyntaxEnabled()) {
    int ntt = getNextTokenType(lastToken);
    if ((ntt & NextTokenType.XhpClassName) > 0) {
      return T_XHP_LABEL;
    }
  }
  yypushback(yylength()-1);
  return T_COLON;
}

<ST_IN_SCRIPTING>"%"{XHPLABEL}  {
  if (isXHPSyntaxEnabled()) {
    int ntt = getNextTokenType(lastToken);
    if ((ntt & NextTokenType.XhpCategoryName) > 0) {
      return T_XHP_CATEGORY_LABEL;
    }
  }
  yypushback(yylength()-1);
  return T_MOD;
}

<ST_IN_SCRIPTING>"("            {
  if (isHHSyntaxEnabled()) {
    int ntt = getNextTokenType(lastToken);
    if ((ntt & NextTokenType.LambdaMaybe) > 0) {
      return T_UNRESOLVED_OP;
    }
  }
  return T_LPAREN;
}

//TOKENS = [;:,.\[\])|^&+\-*/=%!~$<>?@]
<ST_IN_SCRIPTING>    ";" {return T_SEMICOLON;}
<ST_IN_SCRIPTING>    ":" {return T_COLON;}
<ST_IN_SCRIPTING>    "," {return T_COMMA;}
<ST_IN_SCRIPTING>    "." {return T_DOT;}
<ST_IN_SCRIPTING>    "[" {return T_LBRACKET;}
<ST_IN_SCRIPTING>    "]" {return T_RBRACKET;}
<ST_IN_SCRIPTING>    ")" {return T_RPAREN;}
<ST_IN_SCRIPTING>    "|" {return T_OR;}
<ST_IN_SCRIPTING>    "^" {return T_XOR;}
<ST_IN_SCRIPTING>    "&" {return T_AND;}
<ST_IN_SCRIPTING>    "+" {return T_PLUS;}
<ST_IN_SCRIPTING>    "-" {return T_MINUS;}
<ST_IN_SCRIPTING>    "*" {return T_MUL;}
<ST_IN_SCRIPTING>    "/" {return T_DIV;}
<ST_IN_SCRIPTING>    "=" {return T_EQUAL;}
<ST_IN_SCRIPTING>    "%" {return T_MOD;}
<ST_IN_SCRIPTING>    "!" {return T_NEGATE;}
<ST_IN_SCRIPTING>    "~" {return T_NOT;}
<ST_IN_SCRIPTING>    "<" {return T_LESS;}
<ST_IN_SCRIPTING>    ">" {return T_GREATER;}
<ST_IN_SCRIPTING>    "?" {return T_QUEST;}
<ST_IN_SCRIPTING>    "@" {return T_SILENCE;}
<ST_IN_SCRIPTING>    "$" {return T_DOLLAR_SIGN;}



<ST_IN_SCRIPTING>"{" {
        pushState(ST_IN_SCRIPTING);
        return T_LBRACE;
}

<ST_DOUBLE_QUOTES,ST_BACKQUOTE,ST_HEREDOC>"${" {
        pushState(ST_LOOKING_FOR_VARNAME);
        return T_DOLLAR_OPEN_CURLY_BRACES;
}

<ST_IN_SCRIPTING>"}"/":"[a-zA-Z_\x7f-\xff] {
        
        if (stack.size() > 1) {
          int yyS = popState();
          if (yyS == ST_IN_SCRIPTING) {
            yybegin(ST_LOOKING_FOR_COLON);
          }
        }
        return T_RBRACE;
}

<ST_IN_SCRIPTING>"}" {
        
        if (stack.size()>1) popState();
        return T_RBRACE;
}

<ST_LOOKING_FOR_VARNAME>{LABEL} {
        yybegin(ST_IN_SCRIPTING);
        return T_STRING_VARNAME;
}

<ST_LOOKING_FOR_VARNAME>{ANY_CHAR} {
        yybegin(ST_IN_SCRIPTING);
}

<ST_IN_SCRIPTING,ST_XHP_IN_TAG>{LNUM} {
        // Hex literals shouldn't match.
       return T_LNUMBER;
}

<ST_IN_SCRIPTING,ST_XHP_IN_TAG>{HNUM} {
        // Check for literals that don't fit in 64-bits.
             return   T_ONUMBER;
}

<ST_IN_SCRIPTING,ST_XHP_IN_TAG>{BNUM} {
              return  T_LNUMBER;
}


<ST_VAR_OFFSET>0|([1-9][0-9]*) { /* Offset could be treated as a long */
     return  T_NUM_STRING;
}

<ST_VAR_OFFSET>{LNUM}|{HNUM}|{BNUM} { /* Offset must be treated as a string */
       return T_NUM_STRING;
}

<ST_IN_SCRIPTING,ST_XHP_IN_TAG>{DNUM}|{EXPONENT_DNUM} {
      return  T_DNUMBER;
}

<ST_IN_SCRIPTING>"__CLASS__"            { return T_CLASS_C; }
<ST_IN_SCRIPTING>"__TRAIT__"            { return T_TRAIT_C; }
<ST_IN_SCRIPTING>"__FUNCTION__"         { return T_FUNC_C; }
<ST_IN_SCRIPTING>"__METHOD__"           { return T_METHOD_C;}
<ST_IN_SCRIPTING>"__LINE__"             { return T_LINE; }
<ST_IN_SCRIPTING>"__FILE__"             { return T_FILE; }
<ST_IN_SCRIPTING>"__DIR__"              { return T_DIR; }
<ST_IN_SCRIPTING>"__NAMESPACE__"        { return T_NS_C; }
<ST_IN_SCRIPTING>"true"                 { return T_TRUE; }
<ST_IN_SCRIPTING>"false"                { return T_FALSE; }

<YYINITIAL> "#!"[^\n]*"\n" {
        yybegin(ST_IN_SCRIPTING);
        pushState(ST_AFTER_HASHBANG);
        return T_INLINE_HTML;
}

<YYINITIAL>(([^<#]|"<"[^?%s<]|"#"[^!]){1,400})|"<s"|"<" {
        yybegin(ST_IN_SCRIPTING);
        pushState(ST_IN_HTML);
        return T_INLINE_HTML;
}

<ST_IN_HTML,ST_AFTER_HASHBANG>(([^<]|"<"[^?%s<]){1,400})|"<s"|"<" {
        yybegin(ST_IN_HTML);
        return T_INLINE_HTML;
}
//
<YYINITIAL,ST_IN_HTML,ST_AFTER_HASHBANG>"<?"|("<?php"([ \t]|{NEWLINE}))|"<script"{WHITESPACE}+"language"{WHITESPACE}*"="{WHITESPACE}*("php"|"\"php\""|"\'php\'"){WHITESPACE}*">" {
        if (shortTags() ||yylength() > 2) {
          
          if (yystate() == YYINITIAL) {
            yybegin(ST_IN_SCRIPTING);
          } else {
            popState();
          }
          return T_OPEN_TAG;
        } else {
          
          if (yystate() == YYINITIAL) {
            yybegin(ST_IN_SCRIPTING);
            pushState(ST_IN_HTML);
          } else if (yystate() == ST_AFTER_HASHBANG) {
            yybegin(ST_IN_HTML);
          }
          return T_INLINE_HTML;
        }
}

  /* this rule, and ST_IN_PHP_OPEN_TAG are specifically for the case where a file */
  /* contains the <?php directive followed directly by an EOF: */
<YYINITIAL>"<?php" {
        yybegin(ST_IN_PHP_OPEN_TAG);
        return T_OPEN_TAG;
}

<ST_IN_PHP_OPEN_TAG>. {
        return T_HH_ERROR;
}

<YYINITIAL,ST_IN_HTML,ST_AFTER_HASHBANG>"<?=" {
          if (yystate() == YYINITIAL) {
            yybegin(ST_IN_SCRIPTING);
          } else {
            popState();
          }
          return T_ECHO; //return T_OPEN_TAG_WITH_ECHO;
}


<YYINITIAL,ST_IN_HTML,ST_AFTER_HASHBANG>"<?hh"([ \t]|{NEWLINE}) {
        if (yystate() == YYINITIAL) {
          yybegin(ST_IN_SCRIPTING);
        } else if (yystate() == ST_AFTER_HASHBANG) {
          popState();
        } else {
          return T_HH_ERROR;
        }
        
        return T_OPEN_TAG;
}

<ST_IN_SCRIPTING,ST_DOUBLE_QUOTES,ST_HEREDOC,ST_BACKQUOTE,ST_VAR_OFFSET>"$"{LABEL} {
        return T_VARIABLE;
}

<ST_DOUBLE_QUOTES,ST_HEREDOC,ST_BACKQUOTE>"$"{LABEL}"->"[a-zA-Z_\x7f-\xff] {
        yypushback(3);
        pushState(ST_LOOKING_FOR_PROPERTY);
        //setToken(yytext, yylength(), yytext+1, yylength()-1, T_VARIABLE);
        return T_VARIABLE;
}

<ST_DOUBLE_QUOTES,ST_HEREDOC,ST_BACKQUOTE>"$"{LABEL}"[" {
        yypushback(1);
        pushState(ST_VAR_OFFSET);
       // setToken(yytext, yylength(), yytext+1, yylength()-1, T_VARIABLE);
        return T_VARIABLE;
}

<ST_VAR_OFFSET>"]" {
        popState();
        return T_RBRACKET;
}

<ST_VAR_OFFSET>"[" {
        return T_LBRACKET;
}

<ST_VAR_OFFSET>[ \n\r\t\\\'#] {
        popState();
        return T_ENCAPSED_AND_WHITESPACE;
}

<ST_IN_SCRIPTING,ST_VAR_OFFSET>{LABEL} {
       return T_STRING;
}

<ST_IN_SCRIPTING,ST_XHP_IN_TAG>{WHITESPACE} {
        return T_WHITESPACE;
}


<ST_IN_SCRIPTING,ST_XHP_IN_TAG>"#" {

	int eatResult = lcManager.eat();
	zzMarkedPos += eatResult;
	return T_LINE_COMMENT;
}

<ST_IN_SCRIPTING,ST_XHP_IN_TAG>"//" {
	int eatResult = lcManager.eat();
    zzMarkedPos += eatResult;
	return T_LINE_COMMENT;
}


<ST_IN_SCRIPTING,ST_XHP_IN_TAG>{DOC_COMMENT_REGEX} {
    return T_DOC_COMMENT;
}

<ST_IN_SCRIPTING,ST_XHP_IN_TAG>{COMMENT_REGEX} {
    return T_COMMENT;
}


<ST_XHP_COMMENT>[^-]+ {

}

<ST_XHP_COMMENT>"-->" {
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
          return T_CLOSE_TAG;
        } else {
          return T_SEMICOLON;
        }
}

<ST_IN_SCRIPTING>"</script"{WHITESPACE}*">"{NEWLINE}? {
        pushState(ST_IN_HTML);
        if (zzAtEOF) {
          return T_CLOSE_TAG;
        } else {
          return T_SEMICOLON;
        }
}


<ST_IN_SCRIPTING>(b?[\"]{DOUBLE_QUOTES_CHARS}*("{"*|"$"*)[\"]) {
        return T_CONSTANT_ENCAPSED_STRING;
}

<ST_IN_SCRIPTING>(b?[\']([^\'\\]|("\\"{ANY_CHAR}))*[\']?) {
        return yycharat(yylength()-1)=='\'' ? T_CONSTANT_ENCAPSED_STRING : T_ENCAPSED_AND_WHITESPACE;
}

<ST_IN_SCRIPTING>b?[\"] {
        yybegin(ST_DOUBLE_QUOTES);
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
//                yybegin(ST_NOWDOC);
//        } else {
//                if (*s == '"') {
//                       s++;
//                       label_len -= 2;
//                }
//                yybegin(ST_HEREDOC);
//        }
//        setHeredocLabel(s, label_len);
//        setToken(yytext, yylength(), s, label_len);
//        return T_START_HEREDOC;
//}

<ST_IN_SCRIPTING>[`] {
        yybegin(ST_BACKQUOTE);
        return T_BACK;
}

<ST_XHP_IN_TAG>{XHPLABEL} {
        return T_XHP_LABEL;
}

<ST_XHP_IN_TAG>"=" {
  return T_EQUAL;
}

<ST_XHP_IN_TAG>[\"][^\"]*[\"] {
  return T_XHP_TEXT;
}

<ST_XHP_IN_TAG>[{] {
  
  pushState(ST_IN_SCRIPTING);
  return T_LBRACE;
}

<ST_XHP_IN_TAG>">" {
  
  yybegin(ST_XHP_CHILD);
  return T_XHP_TAG_GT;
}

<ST_XHP_IN_TAG>"/>" {
  yybegin(ST_XHP_END_SINGLETON_TAG);
  yypushback(1);
  return T_DIV;
}

<ST_XHP_END_SINGLETON_TAG>">" {
  popState();
  return T_XHP_TAG_GT;
}

<ST_XHP_CHILD>"<!--" {
  pushState(ST_XHP_COMMENT);

}

<ST_XHP_CHILD>[^{<]+ {
  return T_XHP_TEXT;
}

<ST_XHP_CHILD>"{" {
  pushState(ST_IN_SCRIPTING);
  return T_LBRACE;
}

<ST_XHP_CHILD>"</" {
  yybegin(ST_XHP_END_CLOSE_TAG);
  yypushback(1);
  return T_XHP_TAG_LT;
}

<ST_XHP_END_CLOSE_TAG>"/" {
  return T_DIV;
}

<ST_XHP_END_CLOSE_TAG>{XHPLABEL} {
  return T_XHP_LABEL;
}

<ST_XHP_END_CLOSE_TAG>">" {
  popState();
  return T_XHP_TAG_GT;
}

<ST_XHP_CHILD>"<" {
  
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
//                yybegin(ST_END_HEREDOC);
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
        yybegin(ST_IN_SCRIPTING);
        return T_END_HEREDOC;
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
        yypushback(1);
        return T_ENCAPSED_AND_WHITESPACE;
}

<ST_BACKQUOTE>{BACKQUOTE_CHARS}+ {
//        std::string strval = escape(yytext, yylength(), T_BACKQUOTE);
//        setToken(yytext, yylength(), strval.c_str(), strval.length());
        return T_ENCAPSED_AND_WHITESPACE;
}

<ST_BACKQUOTE>{BACKQUOTE_CHARS}*("{"{2,5}|"$"{2,5}|(("{"+|"$"+)[`])) {
        yypushback(1);
//        std::string strval = escape(yytext, yylength(), T_BACKQUOTE);
//        setToken(yytext, yylength(), strval.c_str(), strval.length());
        return T_ENCAPSED_AND_WHITESPACE;
}

<ST_DOUBLE_QUOTES>[\"] {
        yybegin(ST_IN_SCRIPTING);
        return T_DOUBLE_QUOTE;
}

<ST_BACKQUOTE>[\`] {
        yybegin(ST_IN_SCRIPTING);
        return T_BACK_QUOTE;
}

<ST_COMMENT,ST_DOC_COMMENT><<EOF>> {
//        error("Unterminated comment at end of file");
        //return T_HH_ERROR;
}

<ST_IN_HTML ,ST_IN_SCRIPTING ,ST_AFTER_HASHBANG ,ST_DOUBLE_QUOTES ,ST_BACKQUOTE ,ST_HEREDOC ,ST_NOWDOC ,ST_END_HEREDOC ,ST_LOOKING_FOR_PROPERTY ,ST_LOOKING_FOR_VARNAME ,ST_LOOKING_FOR_COLON ,ST_VAR_OFFSET ,ST_LT_CHECK ,ST_COMMENT ,ST_DOC_COMMENT ,ST_ONE_LINE_COMMENT ,ST_IN_PHP_OPEN_TAG,ST_XHP_IN_TAG ,ST_XHP_END_SINGLETON_TAG ,ST_XHP_END_CLOSE_TAG ,ST_XHP_CHILD ,ST_XHP_COMMENT>{ANY_CHAR} {
//        error("Unexpected character in input: '%c' (ASCII=%d)",
//                        yytext[0], yytext[0]);
       // return T_HH_ERROR;
}
