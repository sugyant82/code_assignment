package com.sugyant.codeassignment.base.animals;

import com.sugyant.codeassignment.actions.impl.sing.Singers;
import com.sugyant.codeassignment.base.Animal;
import com.sugyant.codeassignment.base.BasicAnimal;

public class Frog extends Animal {

    public Frog(){
        this.singable =new Singers();
    }

}
