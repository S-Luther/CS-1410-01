package com.example.project;

public class Pet{
    protected String name;
    protected int mood;
    protected int hunger;
    protected int energy;

    public Pet(String name){
        this.name = name;
        mood = 100;
        hunger = 100;
        energy = 100;
    }

    public void play(){
        mood+= 10;
        energy -= 5;
    }

    public void feed(){
        hunger -= 5;
    }

    public String getName(){
        return name;
    }

    public int getMood(){
        return mood;
    }

    public int getHunger(){
        return hunger;
    }

    public int getEnergy(){
        return energy;
    }
}