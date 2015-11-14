<?php
echo "GENERATING HACK PARSER TEST SPEC\n";

foreach (glob('./testData/parser/*', GLOB_ONLYDIR) as $dir) {
    $className = end(explode("/", $dir));
    if (ctype_upper($className{0})) {
        generateTest($className, $dir);
    }
}


function generateTest($className, $dir)
{
    $class = <<<JAVA
package io.github.josehsantos.hack.parser;

import io.github.josehsantos.hack.HackBaseParserTest;

/**
 * Created by josesantos on 01/11/14.
 */
public class {$className}Test extends HackBaseParserTest {

JAVA;

    echo "Generating Spec $className\n";
    foreach (glob("$dir/*") as $test) {
        if (is_dir($test)) {
            print "Directory $test\n";
            continue;
        }
        if (!preg_match('/\.(php|hh)$/', $test)) {
            if (!preg_match('/\.(txt)$/', $test)) {
                print "Not Hack File\n";
                unlink($test);
            }
            continue;
        }
        $parts = explode("/", $test);
        $last = count($parts) - 1;
        $testCase = explode(".", $parts[$last])[0];
        $testCase{0} = strtoupper($testCase{0});
        $testCase = str_replace("-", "_", $testCase);
        $parts[$last] = "$testCase.hh";
        rename($test, implode("/", $parts));
        $parts[$last] = "$testCase.txt";
        $textFile = implode("/", $parts);
        if (file_exists($textFile) == false) {
            print "Creating Txt File $textFile\n";
            fclose(fopen($textFile, "w+"));
        }
        echo "Generating $testCase test case\n";
        $class .= <<<JAVA

    public void test$testCase() {
        doTest(true);
    }

JAVA;

    }

    $class .= "\n}\n";
    file_put_contents("tests/io/github/josehsantos/hack/parser/{$className}Test.java", $class);
}