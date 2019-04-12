package com.sugyant.codeassignment.base.birds;

import com.sugyant.codeassignment.actions.impl.sing.DuckSing;
import com.sugyant.codeassignment.actions.impl.swim.Swimmers;
import com.sugyant.codeassignment.base.Bird;

public class Duck extends Bird {

    public Duck(){
        this.singable =new DuckSing();
        this.swimmable= new Swimmers();
    }
}
