package com.example.project;

public class Snake extends Pet implements Feedable {



    public Snake(String n) {
        mood = 2;
        energy = 4;
        hunger = 3;
        name = n;
        System.out.println("I have a snake named " + name + ".");
    }

    public void slither() {
        energy--;
        mood++;
    }

    public void feed() {
        hunger--;
        mood--;
        System.out.println(name + " is eating a hamster");
    }

    public void shedSkin() {
        hunger += 2;
        mood++;
        energy -= 2;
    }

}