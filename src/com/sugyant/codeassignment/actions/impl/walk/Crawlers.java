package com.sugyant.codeassignment.actions.impl.walk;

import com.sugyant.codeassignment.actions.WalkingAnimal;

public class Crawlers implements WalkingAnimal {
    @Override
    public void walk() {
        System.out.println("I am crawling");
    }
}
