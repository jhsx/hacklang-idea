package io.github.josehsantos.hack;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.testFramework.LexerTestCase;
import io.github.josehsantos.hack.lang.parser.HackLexer;

import java.io.Reader;

/**
 * Created by josesantos on 08/11/14.
 */
public abstract class HackBaseLexerTest extends LexerTestCase {


    @Override
    protected Lexer createLexer() {
        return new FlexAdapter(new HackLexer((Reader) null));
    }

    @Override
    protected String getDirPath() {
        String name = getClass().getSimpleName();
        return "./testData/lexer/" + name.substring(0, name.length() - 4).toLowerCase();
    }
}
