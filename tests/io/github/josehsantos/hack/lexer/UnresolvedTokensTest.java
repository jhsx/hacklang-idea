package io.github.josehsantos.hack.lexer;

import io.github.josehsantos.hack.HackBaseLexerTest;

/**
 * Created by josesantos on 08/11/14.
 */
public class UnresolvedTokensTest extends HackBaseLexerTest {

    public void testTypeList() {
        doTest("<?hh\n" +
                "class myTypeList<T> extends Other<T> implements mYclass<T>{\n" +
                " use Traits<T>;\n" +
                " function myNameWith<T>(Typepara<T> $p):typess<T> {\n" +
                " \treturn new MyNewType<T>();\n" +
                " }function test(){\n" +
                "    $this->myNameWith();\n" +
                "    justAnFunctionTypeList();\n" +
                " }}\n" +
                "\n", "HackTokenType.T_OPEN_TAG ('<?hh\\n')\n" +
                "HackTokenType.T_WHITESPACE ('\\n')\n" +
                "HackTokenType.T_CLASS ('class')\n" +
                "HackTokenType.T_WHITESPACE (' ')\n" +
                "HackTokenType.T_STRING ('myTypeList')\n" +
                "HackTokenType.T_TYPELIST_LT ('<')\n" +
                "HackTokenType.T_STRING ('T')\n" +
                "HackTokenType.T_TYPELIST_GT ('>')\n" +
                "HackTokenType.T_WHITESPACE (' ')\n" +
                "HackTokenType.T_EXTENDS ('extends')\n" +
                "HackTokenType.T_WHITESPACE (' ')\n" +
                "HackTokenType.T_STRING ('Other')\n" +
                "HackTokenType.T_TYPELIST_LT ('<')\n" +
                "HackTokenType.T_STRING ('T')\n" +
                "HackTokenType.T_TYPELIST_GT ('>')\n" +
                "HackTokenType.T_WHITESPACE (' ')\n" +
                "HackTokenType.T_IMPLEMENTS ('implements')\n" +
                "HackTokenType.T_WHITESPACE (' ')\n" +
                "HackTokenType.T_STRING ('mYclass')\n" +
                "HackTokenType.T_TYPELIST_LT ('<')\n" +
                "HackTokenType.T_STRING ('T')\n" +
                "HackTokenType.T_TYPELIST_GT ('>')\n" +
                "HackTokenType.{ ('{')\n" +
                "HackTokenType.T_WHITESPACE ('\\n ')\n" +
                "HackTokenType.T_USE ('use')\n" +
                "HackTokenType.T_WHITESPACE (' ')\n" +
                "HackTokenType.T_STRING ('Traits')\n" +
                "HackTokenType.T_TYPELIST_LT ('<')\n" +
                "HackTokenType.T_STRING ('T')\n" +
                "HackTokenType.T_TYPELIST_GT ('>')\n" +
                "HackTokenType.; (';')\n" +
                "HackTokenType.T_WHITESPACE ('\\n \\n ')\n" +
                "HackTokenType.T_FUNCTION ('function')\n" +
                "HackTokenType.T_WHITESPACE (' ')\n" +
                "HackTokenType.T_STRING ('myNameWith')\n" +
                "HackTokenType.T_TYPELIST_LT ('<')\n" +
                "HackTokenType.T_STRING ('T')\n" +
                "HackTokenType.T_TYPELIST_GT ('>')\n" +
                "HackTokenType.( ('(')\n" +
                "HackTokenType.T_STRING ('Typepara')\n" +
                "HackTokenType.T_TYPELIST_LT ('<')\n" +
                "HackTokenType.T_STRING ('T')\n" +
                "HackTokenType.T_TYPELIST_GT ('>')\n" +
                "HackTokenType.T_WHITESPACE (' ')\n" +
                "HackTokenType.T_VARIABLE ('$p')\n" +
                "HackTokenType.) (')')\n" +
                "HackTokenType.: (':')\n" +
                "HackTokenType.T_STRING ('typess')\n" +
                "HackTokenType.T_TYPELIST_LT ('<')\n" +
                "HackTokenType.T_STRING ('T')\n" +
                "HackTokenType.T_TYPELIST_GT ('>')\n" +
                "HackTokenType.T_WHITESPACE (' ')\n" +
                "HackTokenType.{ ('{')\n" +
                "HackTokenType.T_WHITESPACE ('\\n \t')\n" +
                "HackTokenType.T_RETURN ('return')\n" +
                "HackTokenType.T_WHITESPACE (' ')\n" +
                "HackTokenType.T_NEW ('new')\n" +
                "HackTokenType.T_WHITESPACE (' ')\n" +
                "HackTokenType.T_STRING ('MyNewType')\n" +
                "HackTokenType.T_TYPELIST_LT ('<')\n" +
                "HackTokenType.T_STRING ('T')\n" +
                "HackTokenType.T_TYPELIST_GT ('>')\n" +
                "HackTokenType.( ('(')\n" +
                "HackTokenType.) (')')\n" +
                "HackTokenType.; (';')\n" +
                "HackTokenType.T_WHITESPACE ('\\n ')\n" +
                "HackTokenType.} ('}')\n" +
                "HackTokenType.T_WHITESPACE ('\\n')\n" +
                "HackTokenType.} ('}')\n" +
                "HackTokenType.T_WHITESPACE ('\\n')");
    }

    public void testLambda() {
        doTest("<?hh\n" +
                        "true?:(int $x):(function():int)==>()==>$x;" +
                        "(int $x):(int,int)==>tuple($x-1,$x+2);",
                "HackTokenType.T_OPEN_TAG ('<?hh\\n')\n" +
                        "HackTokenType.T_TRUE ('true')\n" +
                        "HackTokenType.? ('?')\n" +
                        "HackTokenType.: (':')\n" +
                        "HackTokenType.T_LAMBDA_OP ('(')\n" +
                        "HackTokenType.T_STRING ('int')\n" +
                        "HackTokenType.T_WHITESPACE (' ')\n" +
                        "HackTokenType.T_VARIABLE ('$x')\n" +
                        "HackTokenType.T_LAMBDA_CP (')')\n" +
                        "HackTokenType.: (':')\n" +
                        "HackTokenType.( ('(')\n" +
                        "HackTokenType.T_FUNCTION ('function')\n" +
                        "HackTokenType.( ('(')\n" +
                        "HackTokenType.) (')')\n" +
                        "HackTokenType.: (':')\n" +
                        "HackTokenType.T_STRING ('int')\n" +
                        "HackTokenType.) (')')\n" +
                        "HackTokenType.T_LAMBDA_ARROW ('==>')\n" +
                        "HackTokenType.T_LAMBDA_OP ('(')\n" +
                        "HackTokenType.T_LAMBDA_CP (')')\n" +
                        "HackTokenType.T_LAMBDA_ARROW ('==>')\n" +
                        "HackTokenType.T_VARIABLE ('$x')\n" +
                        "HackTokenType.; (';')\n" +
                        "HackTokenType.T_LAMBDA_OP ('(')\n" +
                        "HackTokenType.T_STRING ('int')\n" +
                        "HackTokenType.T_WHITESPACE (' ')\n" +
                        "HackTokenType.T_VARIABLE ('$x')\n" +
                        "HackTokenType.T_LAMBDA_CP (')')\n" +
                        "HackTokenType.: (':')\n" +
                        "HackTokenType.( ('(')\n" +
                        "HackTokenType.T_STRING ('int')\n" +
                        "HackTokenType., (',')\n" +
                        "HackTokenType.T_STRING ('int')\n" +
                        "HackTokenType.) (')')\n" +
                        "HackTokenType.T_LAMBDA_ARROW ('==>')\n" +
                        "HackTokenType.T_TUPLE ('tuple')\n" +
                        "HackTokenType.( ('(')\n" +
                        "HackTokenType.T_VARIABLE ('$x')\n" +
                        "HackTokenType.- ('-')\n" +
                        "HackTokenType.T_LNUMBER ('1')\n" +
                        "HackTokenType., (',')\n" +
                        "HackTokenType.T_VARIABLE ('$x')\n" +
                        "HackTokenType.+ ('+')\n" +
                        "HackTokenType.T_LNUMBER ('2')\n" +
                        "HackTokenType.) (')')\n" +
                        "HackTokenType.; (';')");
    }

}
