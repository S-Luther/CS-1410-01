package com.example.project;

public class Dog {
    private String Name;
    private boolean Mood;
    private int Hunger;
    private int Energy = 100;
    public Dog(String d){
        name = d;
    }    
    public goOnWalk(){
        Energy -= 10;
        Hunger += 10;
        Mood = true;
    }
    public feed(){
        Energy += 10;
        Hunger -= 10;
        Mood = true
    } 
}