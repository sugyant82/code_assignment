package com.sugyant.codeassignment.test;

import com.sugyant.codeassignment.base.fish.Clownfish;
import com.sugyant.codeassignment.helpers.BodyColorEnum;
import com.sugyant.codeassignment.helpers.BodySizeEnum;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class ClownfishTest extends GenericTest{


    Clownfish clownfish;


    @Before
    public void setUp(){
        this.clownfish=new Clownfish();
    }


    @Test
    public void testWalk() {
        clownfish.walk();
        assertThat(sysOut.asString(), containsString("I cannot Walk"));
    }

    @Test
    public void testSing() {
        clownfish.sing();
        assertThat(sysOut.asString(), containsString("Can not sing"));
    }

    @Test
    public void testSwim() {
        clownfish.swim();
        assertThat(sysOut.asString(), containsString("I am swimming"));
    }

    @Test
    public void testSize() {
        BodySizeEnum size= clownfish.size();
        assertEquals(BodySizeEnum.SMALL,size);
    }

    @Test
    public void testColor() {
        BodyColorEnum color= clownfish.color();
        assertEquals(BodyColorEnum.ORANGE,color);
    }
}
