package com.sugyant.codeassignment.base.birds;

import com.sugyant.codeassignment.actions.impl.sing.RoosterSing;
import com.sugyant.codeassignment.base.Bird;

public class Rooster extends Bird {

    Chicken chicken;

    public Rooster(){
        this.singable= new RoosterSing();
        this.chicken=new Chicken();
    }

    @Override
    public void fly(){
        this.chicken.fly();
    }
}
