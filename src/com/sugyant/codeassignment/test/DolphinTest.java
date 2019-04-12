package com.sugyant.codeassignment.test;

import org.junit.Before;
import org.junit.Test;

import com.sugyant.codeassignment.base.fish.Dolphin;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class DolphinTest extends GenericTest {


    Dolphin dolphin;
    @Before
    public void setUp(){
        this.dolphin=new Dolphin();
    }


    @Test
    public void testWalk() {
        dolphin.walk();
        assertThat(sysOut.asString(), containsString("I cannot Walk"));
    }

    @Test
    public void testSing() {
        dolphin.sing();
        assertThat(sysOut.asString(), containsString("Can not sing"));
    }


    @Test
    public void testSwim() {
        dolphin.swim();
        assertThat(sysOut.asString(), containsString("Great swimmers"));
    }
}


