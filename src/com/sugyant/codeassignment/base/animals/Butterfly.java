package com.sugyant.codeassignment.base.animals;

import com.sugyant.codeassignment.actions.impl.fly.Flyers;
import com.sugyant.codeassignment.actions.impl.sing.NonSingers;

public class Butterfly extends Caterpillar {

    public Butterfly(){
        this.flyable =new Flyers();
        this.singable= new NonSingers();
    }
}
