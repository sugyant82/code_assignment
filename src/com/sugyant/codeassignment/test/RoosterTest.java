package com.sugyant.codeassignment.test;

import org.junit.Before;
import org.junit.Test;

import com.sugyant.codeassignment.base.birds.Chicken;
import com.sugyant.codeassignment.base.birds.Rooster;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class RoosterTest extends GenericTest{


    Rooster rooster;

    @Before
    public void setUp(){
        this.rooster=new Rooster();
    }

    @Test
    public void testFly() {
        rooster.fly();
        assertThat(sysOut.asString(), containsString("Can not fly"));
    }

    @Test
    public void testSing() {
        rooster.sing();
        assertThat(sysOut.asString(), containsString("kikeriki"));
    }

}
