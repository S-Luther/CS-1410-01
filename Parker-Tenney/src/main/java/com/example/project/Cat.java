package com.example.project;

public class Cat extends Pet {

    mood = 3;
    hunger = 4; 
    energy = 1;

    public Cat(String n) {
        name = n;
        System.out.println("I have a cat named " + name + ".");
    }

    public void escapeOutside() {
        mood++;
        energy--;
        hunger++;
    }

    public void meow() {
        mood++;
    }

    public void eatWetFood() {
        hunger--;
        mood--;
    }

}