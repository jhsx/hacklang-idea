package io.github.josehsantos.hack.parser;

import io.github.josehsantos.hack.HackBaseParserTest;

/**
 * Created by josesantos on 01/11/14.
 */
public class Instanceof_OperatorTest extends HackBaseParserTest {

    public void testInstanceof() {
        doTest(true);
    }

}
