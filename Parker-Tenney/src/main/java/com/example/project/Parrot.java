package com.example.project;

public class Parrot extends Pet {

    mood = 5;
    hunger = 2; 
    energy = 3;

    public Parrot(String n) {
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

    public void catchMouse() {
        hunger--;
        energy--;
    }


}