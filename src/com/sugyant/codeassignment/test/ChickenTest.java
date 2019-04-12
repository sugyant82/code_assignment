package com.sugyant.codeassignment.test;

import org.junit.Before;
import org.junit.Test;

import com.sugyant.codeassignment.base.birds.Chicken;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class ChickenTest extends GenericTest {


    Chicken chicken;

    @Before
    public void setUp(){
        this.chicken=new Chicken();
    }

    @Test
    public void testFly() {
        chicken.fly();
        assertThat(sysOut.asString(), containsString("Can not fly"));
    }

    @Test
    public void testSing() {
        chicken.sing();
        assertThat(sysOut.asString(), containsString("Cluck,cluck"));
    }
}
