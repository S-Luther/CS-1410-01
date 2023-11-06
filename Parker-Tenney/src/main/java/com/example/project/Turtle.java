package com.example.project;

public class Turtle extends Pet implements Feedable {



    public Turtle(String n) {
        mood = 6;
        hunger = 3;
        energy = 1;
        name = n;
        System.out.println("I have a turtle named " + name + ".");
    }

    public void sunbathe() {
        mood++;
        hunger++;
    }

    public void swim() {
        hunger++;
        energy--;
    }

    public void feed() {
        hunger--;
        energy--;
        System.out.println(name + " is eating some ferns");
    }

}