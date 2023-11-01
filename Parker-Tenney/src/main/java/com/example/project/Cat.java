package com.example.project;

public class Cat {

    private String name;
    private int mood = 3;
    private int hunger = 4; 
    private int energy = 1;

    public String getName(){
        return name;
    }

    public Cat(String n) {
        name = n;
        System.out.println("I have a cat named " + name + ".");
    }

    public void printStats() {
        System.out.println("Mood: " + mood);
        System.out.println("Hunger: " + hunger);
        System.out.println("Energy: " + energy);
    }

    public void sleep() {
        hunger++;
        energy++;
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