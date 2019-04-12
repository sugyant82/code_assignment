package com.sugyant.codeassignment.actions.impl.fly;

import com.sugyant.codeassignment.actions.FlyingAnimal;

public class NonFlyers implements FlyingAnimal {
    @Override
    public void fly() {
        System.out.println("Can not fly");
    }
}
