package com.example.project;

public class Dog{
    private String name;
    private int mood;
    private int hunger;
    private int energy;

    public Dog(String name){
        this.name = name;
        mood = 100;
        hunger = 100;
        energy = 100;
    }

    public void goForAWalk(){
        mood += 20;
        energy -= 30;
    }

    public void feed(){
        hunger -= 10;
    }
}