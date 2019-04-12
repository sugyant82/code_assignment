package com.sugyant.codeassignment.test;

import com.sugyant.codeassignment.actions.impl.sing.CatParrot;
import com.sugyant.codeassignment.actions.impl.sing.DogSing;
import com.sugyant.codeassignment.actions.impl.sing.DuckSing;
import com.sugyant.codeassignment.actions.impl.sing.RoosterSing;
import com.sugyant.codeassignment.base.birds.Parrot;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class ParrotTest extends GenericTest {


    Parrot parrot;

    @Before
    public void setUp(){
        parrot= new Parrot();
    }

    @Test
    public void testParrotLivingWithDog(){
        parrot.setSingable(new DogSing());
        parrot.sing();
        assertThat(sysOut.asString(), containsString("Woof,woof"));

    }


    @Test
    public void testParrotLivingWithCat(){
        parrot.setSingable(new CatParrot());
        parrot.sing();
        assertThat(sysOut.asString(), containsString("Meow"));
    }


    @Test
    public void testParrotLivingWithRooster(){
        parrot.setSingable(new RoosterSing());
        parrot.sing();
        assertThat(sysOut.asString(), containsString("Cock-a-doodle-doo"));
    }

    @Test
    public void testParrotLivingWithDuck(){
        parrot.setSingable(new DuckSing());
        parrot.sing();
        assertThat(sysOut.asString(), containsString("Quack,quack"));
    }

}
