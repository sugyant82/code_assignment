package com.sugyant.codeassignment.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;

import com.sugyant.codeassignment.base.Animal;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnimalTest  extends GenericTest{

    @Test
    public void testWalk(){
        Animal animal= new Animal();
        animal.walk();
        assertThat(sysOut.asString(), containsString("I am walking"));
//        assertTrue(sysOut.asString().equalsIgnoreCase("I am walking"));
    }
}
