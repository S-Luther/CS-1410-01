package com.example.project;

public class pet{
    protected String name;
    protected int hunger = 5;
    protected int mood = 5;
    protected  int energy = 5;

public String getName(){
        return name;
    }
    public int getHunger(){
        return hunger;
    }
    public int getMood(){
        return mood;
    }
        public int getEnergy(){
        return energy;
    }
    public String feed(){
        hunger+=2;
        energy+=1;
        
        return "You fed " + name + "his hunger is " + getHunger();
    }

}