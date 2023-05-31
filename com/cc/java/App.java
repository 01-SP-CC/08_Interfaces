package com.cc.java;

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

