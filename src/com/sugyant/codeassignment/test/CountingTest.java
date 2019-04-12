package com.sugyant.codeassignment.test;

import com.sugyant.codeassignment.base.Bird;
import com.sugyant.codeassignment.base.Fish;
import com.sugyant.codeassignment.base.BasicAnimal;
import com.sugyant.codeassignment.base.animals.Butterfly;
import com.sugyant.codeassignment.base.animals.Cat;
import com.sugyant.codeassignment.base.animals.Dog;
import com.sugyant.codeassignment.base.animals.Frog;
import com.sugyant.codeassignment.base.birds.Chicken;
import com.sugyant.codeassignment.base.birds.Duck;
import com.sugyant.codeassignment.base.birds.Parrot;
import com.sugyant.codeassignment.base.birds.Rooster;
import com.sugyant.codeassignment.base.fish.Clownfish;
import com.sugyant.codeassignment.base.fish.Dolphin;
import com.sugyant.codeassignment.base.fish.Shark;
import com.sugyant.codeassignment.helpers.AnimalCount;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountingTest extends GenericTest {

    AnimalCount countAnimals;
    BasicAnimal vertebrates[] ;

    @Before
    public  void setUp(){
        this.countAnimals=new AnimalCount();
        vertebrates = new BasicAnimal[]{
                new Bird(),  //  SING, FLY ,WALK
                new Duck(),  //  SING, FLY ,WALK, SWIM
                new Chicken(), // SING, FLY ,WALK
                new Rooster(), // SING, FLY ,WALK
                new Parrot(), //SING, FLY ,WALK
                new Fish(), // SWIM
                new Shark(), // SWIM
                new Clownfish(), // SWIM
                new Dolphin(), // SWIM
                new Frog(), // SING WALK
                new Dog(), // SING WALK
                new Butterfly(), // FLY WALK
                new Cat()  // SING WALK
        };
    }

    @Test
    public void testWalkableCount(){
        int count= this.countAnimals.walkableCount(vertebrates);
        assertEquals(8,count);
    }

    @Test
    public void testFlyableCount(){
        int count= this.countAnimals.flyableCount(vertebrates);
        assertEquals(5,count);
    }

    @Test
    public void testSingableCount(){
        int count= this.countAnimals.singableCount(vertebrates);
        assertEquals(8,count);
    }

    @Test
    public void testSwimmableCount(){
        int count= this.countAnimals.swimmableCount(vertebrates);
        assertEquals(5,count);
    }
}
