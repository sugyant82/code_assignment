package com.sugyant.codeassignment.test;



import org.junit.rules.ExternalResource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * for outputting sysout
 */
public class Printer extends ExternalResource {

    private PrintStream sysOut;
    private final ByteArrayOutputStream outPut = new ByteArrayOutputStream();

    @Override
    protected void before() throws Throwable {
        sysOut = System.out;
        System.setOut(new PrintStream(outPut));
    }

    @Override
    protected void after() {
        System.setOut(sysOut);
    }

    public String asString() {
        return outPut.toString();
    }
}
