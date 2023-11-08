package com.example.project;

public class Pet{
    private int mood;
    private int hunger;
    private int energy;

    public Pet(int mood, int hunger, int energy){
        this.mood = mood;
        this.hunger = hunger;
        this.energy = energy;
        
    }

    public int getMood(){
        return mood;
    }

    public void setMood(int mood){
        this.mood = mood;
    }

    public int getEnergy(){
        return energy;
    }

    public void setEnergy(int energy){
        this.enery = energy;
    }

    public int getHunger(){
        return hunger;
    }


    public void setHunger(int hunger){
        this.hunger = hunger;
    }

}