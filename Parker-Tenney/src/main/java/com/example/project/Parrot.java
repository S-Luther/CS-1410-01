package com.example.project;

public class Parrot extends Pet implements Feedable {



    public Parrot(String n) {
        mood = 5;
        hunger = 2; 
        energy = 3;
        name = n;
        System.out.println("I have a parrot named " + name + ".");
    }

    public void talk() {
        mood++;
        energy--;
    }

    public void fly() {
        energy--;
        hunger++;
    }

    public void feed() {
        hunger--;
        energy--;
        System.out.println(name + " is eating a mouse it caught");
    }


}