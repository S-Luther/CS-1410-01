package com.example.project;

public class Cat {
    private String Name;
    private boolean Mood;
    private int Hunger;
    private int Energy = 100;
    public Cat(String c){
        name = c;
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