package io.github.josehsantos.hack;

import com.intellij.testFramework.ParsingTestCase;
import io.github.josehsantos.hack.ide.HackParserDefinition;

/**
 * Created by josesantos on 01/11/14.
 */

abstract public class HackBaseParserTest extends ParsingTestCase {
    public HackBaseParserTest() {
        super("", "hh", new HackParserDefinition());
    }


    @Override
    protected String getTestDataPath() {
        String name = getClass().getSimpleName();
        return "./testData/parser/" + name.substring(0, name.length() - 4);
    }

}
