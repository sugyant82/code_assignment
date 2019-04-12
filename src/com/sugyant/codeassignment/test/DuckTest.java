package com.sugyant.codeassignment.test;

import com.sugyant.codeassignment.base.Bird;
import com.sugyant.codeassignment.base.birds.Duck;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class DuckTest {

    @Rule
    public Printer sysOut = new Printer();
    Duck duck;

    @Before
    public void setUp() {
        this.duck=  new Duck();
    }


    @Test
    public void testSing() {
        duck.sing();
        assertThat(sysOut.asString(), containsString("Quack,quack"));
    }

    @Test
    public void testSwim() {
        duck.swim();
        assertThat(sysOut.asString(), containsString("I am swimming"));
    }


}
