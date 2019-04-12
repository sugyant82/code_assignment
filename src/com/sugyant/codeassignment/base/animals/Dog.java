package com.sugyant.codeassignment.base.animals;

import com.sugyant.codeassignment.actions.impl.sing.DogSing;
import com.sugyant.codeassignment.base.Animal;
import com.sugyant.codeassignment.base.BasicAnimal;

public class Dog extends Animal {

    public Dog(){
        this.singable = new DogSing();
    }
}
