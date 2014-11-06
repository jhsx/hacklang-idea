package io.github.josehsantos.hack.lang.parser;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * Created by josesantos on 31/10/14.
 */
public class HackLexerAdapter extends FlexAdapter {
    public HackLexerAdapter() {
        super(new HackLexer((Reader) null));
    }
}