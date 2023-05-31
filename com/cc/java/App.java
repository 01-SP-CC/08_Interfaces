package com.cc.java;

import com.cc.java.bees.HoneyBee;
import com.cc.java.bees.Worker;
import com.cc.java.birds.Bird;
import com.cc.java.birds.Drone;
import com.cc.java.birds.Queen;

public class App {
    
    public static void main(String[] args) {
     
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();
        Bird bird = new Bird();

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);
        output("--------------------------------");
        pollObj(bird);

        // HoneyBee ist abstrakt --> Fehler!
        // HoneyBee bee = new HoneyBee();
        // output(bee.doYourJob());


    }

    // 2. Variante Polymorphie
    private static void pollObj(HoneyBee bee) {
        output(bee.doYourJob());
        output(bee.fly());
    }

    // Überladen für Bird(s) ...
    private static void pollObj(Bird obj) {
        output(obj.hasFeathers());
        output(obj.fly());
    }

   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

