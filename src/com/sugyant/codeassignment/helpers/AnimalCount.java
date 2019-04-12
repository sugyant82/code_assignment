package com.sugyant.codeassignment.helpers;

import com.sugyant.codeassignment.actions.impl.fly.Flyers;
import com.sugyant.codeassignment.actions.impl.sing.Singers;
import com.sugyant.codeassignment.actions.impl.swim.Swimmers;
import com.sugyant.codeassignment.actions.impl.walk.Walkers;
import com.sugyant.codeassignment.base.BasicAnimal;

public class AnimalCount {



    public int  walkableCount(BasicAnimal vertebrates[]) {
        int count=0;
        if(vertebrates.length==0){
            return count;
        }

        for(BasicAnimal vertibrate:vertebrates){
            if(vertibrate.getWalkable()!=null &&  vertibrate.getWalkable() instanceof Walkers){
                count++;
            }
        }
        return count;
    }

    public int flyableCount(BasicAnimal[] vertebrates) {
        int count=0;
        for(BasicAnimal vertebrate:vertebrates){
            if(vertebrate.getFlyable()!=null
                    && vertebrate.getFlyable() instanceof Flyers){
                count++;
            }
        }
        return count;
    }

    public int singableCount(BasicAnimal[] vertebrates) {
        int count=0;
        for(BasicAnimal vertebrate:vertebrates){
            if(vertebrate.getSingable()!=null
                    && vertebrate.getSingable() instanceof Singers){
                count++;
            }
        }
        return count;
    }

    public int swimmableCount(BasicAnimal[] vertebrates) {
        int count=0;
        for(BasicAnimal vertebrate:vertebrates){
            if(vertebrate.getSwimmable()!=null
                    && vertebrate.getSwimmable() instanceof Swimmers){
                count++;
            }
        }
        return count;
    }
}
