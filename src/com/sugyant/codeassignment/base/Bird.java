package com.sugyant.codeassignment.base;

import com.sugyant.codeassignment.actions.impl.fly.Flyers;
import com.sugyant.codeassignment.actions.impl.sing.Singers;
import com.sugyant.codeassignment.actions.impl.walk.Walkers;

public class Bird extends BasicAnimal{

    public Bird(){
        this.walkable=new Walkers();
        this.flyable =new Flyers();
        this.singable=new Singers();
    }
}
