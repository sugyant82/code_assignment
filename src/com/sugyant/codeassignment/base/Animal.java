package com.sugyant.codeassignment.base;

import com.sugyant.codeassignment.actions.impl.walk.Walkers;

public class Animal extends BasicAnimal {

    public Animal(){
        this.walkable=new Walkers();
    }
}
