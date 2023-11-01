package com.example.project;

public class Pet {

    protected String name;
    protected int mood;
    protected int hunger; 
    protected int energy;

    public void printStats() {
        System.out.println("Mood: " + mood);
        System.out.println("Hunger: " + hunger);
        System.out.println("Energy: " + energy);
    }

    public String getName(){
        return name;
    }

    protected void sleep() {
        mood--;
        energy++;
    }

}