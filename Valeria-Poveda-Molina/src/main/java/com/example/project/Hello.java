package com.example.project;

public class Hello{
    public static void main(String[]{
        Cat pinky = new Cat("pinky");
        Dog james = new Dog("james");
        Parrot blue = new Parrot("neptune");
        
        System.out.println(pinky.getName() + "'s mood: " + pinky.getMood());
        System.out.println(james.getName() + "'s mood: " + james.getMood());
        System.out.println(neptune.getName() + "'s mood: " + neptune.getMood());

        pinky.play();
        james.goForAWalk();
        neptune.talk();

        System.out.println(pinky.getName() + "'s mood after playing is: " + pinky.getMood());
        System.out.println(james.getName() + "'s mood after going on a walk is: " + james.getMood());
        System.out.println(neptune.getName() + "'s mood after talking is: " + neptune.getMood());

    }
}