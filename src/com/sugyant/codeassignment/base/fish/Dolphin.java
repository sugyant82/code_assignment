package com.sugyant.codeassignment.base.fish;

import com.sugyant.codeassignment.actions.SingingAnimal;
import com.sugyant.codeassignment.actions.WalkingAnimal;
import com.sugyant.codeassignment.actions.impl.swim.GreatSwimmers;
import com.sugyant.codeassignment.base.Fish;
import com.sugyant.codeassignment.base.BasicAnimal;

public class Dolphin extends BasicAnimal {

    Fish fish;

    public Dolphin(){
        this.swimmable= new GreatSwimmers();
        this.fish =new Fish();
        this.walkable = this.fish.getWalkable();
        this.singable = this.fish.getSingable();
    }

}
