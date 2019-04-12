package com.sugyant.codeassignment.test;

import com.sugyant.codeassignment.base.Fish;
import com.sugyant.codeassignment.base.fish.Shark;
import com.sugyant.codeassignment.helpers.BodyColorEnum;
import com.sugyant.codeassignment.helpers.BodySizeEnum;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class SharkTest extends GenericTest {


    Shark shark;


    @Before
    public void setUp(){
        shark=new Shark();
    }


    @Test
    public void testWalk() {
        shark.walk();
        assertThat(sysOut.asString(), containsString("I cannot Walk"));
    }

    @Test
    public void testSing() {
        shark.sing();
        assertThat(sysOut.asString(), containsString("Can not sing"));
    }

    @Test
    public void testSwim() {
        shark.swim();
        assertThat(sysOut.asString(), containsString("I am swimming"));
    }

    @Test
    public void testSize() {
        BodySizeEnum size= shark.size();
       assertEquals(BodySizeEnum.LARGE,size);
    }

    @Test
    public void testColor() {
        BodyColorEnum color= shark.color();
        assertEquals(BodyColorEnum.GREY,color);
    }

}
