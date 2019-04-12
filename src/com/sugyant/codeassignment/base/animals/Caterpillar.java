package com.sugyant.codeassignment.base.animals;

import com.sugyant.codeassignment.actions.impl.fly.NonFlyers;
import com.sugyant.codeassignment.actions.impl.walk.Crawlers;
import com.sugyant.codeassignment.base.Animal;

public class Caterpillar extends Animal {

    public Caterpillar(){
        this.flyable= new NonFlyers();
        this.walkable= new Crawlers();
    }
}
