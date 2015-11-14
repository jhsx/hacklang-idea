package io.github.josehsantos.hack.parser;

import io.github.josehsantos.hack.HackBaseParserTest;

/**
 * Created by josesantos on 01/11/14.
 */
public class Additive_OperatorsTest extends HackBaseParserTest {

    public void testAddition_subtraction_concatenation() {
        doTest(true);
    }

    public void testArray_concatenation() {
        doTest(true);
    }

}
