package com.sugyant.codeassignment.test;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.sugyant.codeassignment.base.Animal;
import com.sugyant.codeassignment.base.Bird;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class BirdTest {


    @Rule
    public Printer sysOut = new Printer();
    Bird bird;

    @Before
    public void setUp() {
        this.bird = new Bird();
    }

    @Test
    public void testWalk() {
        bird.walk();
        assertThat(sysOut.asString(), containsString("I am walking"));
    }


    @Test
    public void testFly() {
        bird.fly();
        assertThat(sysOut.asString(), containsString("I am flying"));
    }

    @Test
    public void testSing() {
        bird.sing();
        assertThat(sysOut.asString(), containsString("I am singing"));
    }



}
