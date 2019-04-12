package com.sugyant.codeassignment.base;

import com.sugyant.codeassignment.actions.impl.sing.NonSingers;
import com.sugyant.codeassignment.actions.impl.swim.Swimmers;
import com.sugyant.codeassignment.actions.impl.walk.NonWalkers;
import com.sugyant.codeassignment.helpers.BodyColorEnum;
import com.sugyant.codeassignment.helpers.BodySizeEnum;
public class Fish  extends BasicAnimal{

    protected BodySizeEnum size;
    protected BodyColorEnum color;

    public Fish(){
        this.swimmable=new Swimmers();
        this.walkable =new NonWalkers();
        this.singable= new NonSingers();
    }

    public BodySizeEnum size() {
        return size;
    }

    public BodyColorEnum color() {
        return color;
    }
}
