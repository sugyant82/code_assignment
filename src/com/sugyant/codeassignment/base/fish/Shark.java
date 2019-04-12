package com.sugyant.codeassignment.base.fish;

import com.sugyant.codeassignment.base.Fish;
import com.sugyant.codeassignment.helpers.BodyColorEnum;
import com.sugyant.codeassignment.helpers.BodySizeEnum;

public class Shark  extends Fish {


    public  Shark(){
        this.size= BodySizeEnum.LARGE;
        this.color=BodyColorEnum.GREY;
    }
}
