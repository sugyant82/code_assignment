package com.sugyant.codeassignment.test;

import org.junit.Before;
import org.junit.Test;

import com.sugyant.codeassignment.base.animals.Butterfly;
import com.sugyant.codeassignment.base.animals.Caterpillar;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class ButterflyTest extends GenericTest {


    Butterfly butterfly;
    @Before
    public void setUp(){
        this.butterfly=new Butterfly();
    }


    @Test
    public void testFly() {
        butterfly.fly();
        assertThat(sysOut.asString(), containsString("I am flying"));
    }

    @Test
    public void testSing() {
        butterfly.sing();
        assertThat(sysOut.asString(), containsString("Can not sing"));
    }
}
