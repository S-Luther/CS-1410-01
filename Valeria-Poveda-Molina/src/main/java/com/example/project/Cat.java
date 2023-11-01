package com.example.project;

public class Cat{
    
    private String name;
    private int mood;
    private int hunger;
    private int energy;

    public Cat(String name){
        this.name = name;
        mood = 100;
        hunger = 100;
        energy = 100;
    }

    public void play(){
        mood += 15;
        energy -= 5;
    }

    public void feed(){
        hunger -= 5;
    }
}