package com.sugyant.codeassignment.test;

import org.junit.Before;
import org.junit.Test;

import com.sugyant.codeassignment.base.birds.Rooster;

import java.util.Locale;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class LanguageTest extends GenericTest {


    Rooster rooster;

    @Before
    public void setUp(){
        this.rooster= new Rooster();
    }


    @Test
    public void testEnglish(){
        rooster.sing();
        assertThat(sysOut.asString(), containsString("Cock-a-doodle-doo"));
    }


    @Test
    public void testGerman(){
        Locale.setDefault(Locale.GERMAN);
        rooster.sing();
        assertThat(sysOut.asString(), containsString("kikeriki"));
    }
}
