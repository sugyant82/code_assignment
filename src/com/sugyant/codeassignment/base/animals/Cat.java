package com.sugyant.codeassignment.base.animals;

import com.sugyant.codeassignment.actions.impl.sing.CatParrot;
import com.sugyant.codeassignment.base.Animal;
import com.sugyant.codeassignment.base.BasicAnimal;

public class Cat extends Animal {

    public Cat(){
        this.singable= new CatParrot();
    }
}
