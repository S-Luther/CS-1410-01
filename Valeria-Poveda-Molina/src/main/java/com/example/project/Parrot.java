package com.example.project;

public class Parrot {
    private String name;
    private int mood;
    private int hunger;
    private int energy;

    public Parrot(String name){
        this.name = name
        mood = 100;
        hunger = 100;
        energy = 100;
    }

    public void talk(){
        mood += 10;
        energy += 10;
    }

    public void feed(){
        hunger -= 10;
    }
}