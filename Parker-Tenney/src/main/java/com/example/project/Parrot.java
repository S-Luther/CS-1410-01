package com.example.project;

public class Parrot {

    private String name;
    private int mood = 5;
    private int hunger = 2; 
    private int energy = 3;

    public String getName(){
        return name;
    }

    public Parrot(String n) {
        name = n;
        System.out.println("I have a parrot named " + name + ".");
    }

    public void printStats() {
        System.out.println("Mood: " + mood);
        System.out.println("Hunger: " + hunger);
        System.out.println("Energy: " + energy);
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

    public void sleep() {
        energy++;
    }

}