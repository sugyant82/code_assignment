package com.sugyant.codeassignment.actions.impl.sing;

import com.sugyant.codeassignment.actions.SingingAnimal;

public class NonSingers implements SingingAnimal {


    @Override
    public void sing() {
        System.out.println("Can not sing");
    }
}
