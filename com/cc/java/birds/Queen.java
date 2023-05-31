package com.cc.java.birds;

import com.cc.java.bees.HoneyBee;

public class Queen extends HoneyBee{
   
    @Override
    public String doYourJob() {
        return "I'm a Queen, any questions?";
     }

     @Override
     public String fly() {
         return "I can fly at 12mph!";
     }

}
