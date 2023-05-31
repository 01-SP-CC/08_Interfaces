package com.cc.java.birds;

import com.cc.java.interfaces.Flyable;
import com.cc.java.interfaces.IFeathers;

public class Bird implements Flyable, IFeathers {

    @Override
    public String fly() {
        return "I am a Bird, I can fly!";
    }

    @Override
    public String hasFeathers() {
       return "And I got black feathers.";
    }
    
}
