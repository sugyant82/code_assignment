package com.sugyant.codeassignment.base;

import com.sugyant.codeassignment.actions.FlyingAnimal;
import com.sugyant.codeassignment.actions.SingingAnimal;
import com.sugyant.codeassignment.actions.WalkingAnimal;
import com.sugyant.codeassignment.actions.impl.swim.Swimmers;

public abstract class BasicAnimal {

    protected WalkingAnimal walkable;
    protected FlyingAnimal flyable;
    protected SingingAnimal singable;
    protected Swimmers swimmable;

    /**
     * Need to be refactored
     */
    public void walk(){
        this.walkable.walk();
    }

    public void fly() {
        this.flyable.fly();
    }

    public void sing() {
        this.singable.sing();
    }

    public void swim() {
        this.swimmable.swim();
    }


    public WalkingAnimal getWalkable() {
        return walkable;
    }

    public void setWalkable(WalkingAnimal walkable) {
        this.walkable = walkable;
    }

    public FlyingAnimal getFlyable() {
        return flyable;
    }

    public void setFlyable(FlyingAnimal flyable) {
        this.flyable = flyable;
    }

    public SingingAnimal getSingable() {
        return singable;
    }

    public void setSingable(SingingAnimal singable) {
        this.singable = singable;
    }

    public Swimmers getSwimmable() {
        return swimmable;
    }

    public void setSwimmable(Swimmers swimmable) {
        this.swimmable = swimmable;
    }
}
