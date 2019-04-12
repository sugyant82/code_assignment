package com.sugyant.codeassignment.base.birds;

import com.sugyant.codeassignment.actions.impl.fly.NonFlyers;
import com.sugyant.codeassignment.actions.impl.sing.ChickenSing;
import com.sugyant.codeassignment.base.Bird;

public class Chicken extends Bird {

    public  Chicken(){
        this.singable=new ChickenSing();
        this.flyable =new NonFlyers();
    }
}
