package com.example.project;

public class Turtle extends Pet {

    mood = 6;
    hunger = 3;
    energy = 1;

    public Turtle(String n) {
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

    public void eatPlants() {
        hunger--;
        energy--;
    }

}