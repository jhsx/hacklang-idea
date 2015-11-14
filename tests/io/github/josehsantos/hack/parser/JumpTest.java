package io.github.josehsantos.hack.parser;

import io.github.josehsantos.hack.HackBaseParserTest;

/**
 * Created by josesantos on 01/11/14.
 */
public class JumpTest extends HackBaseParserTest {

    public void testBreak() {
        doTest(true);
    }

    public void testContinue() {
        doTest(true);
    }

}
