package com.example.project;

public class Parrot {
    private String Name;
    private boolean Mood;
    private int Hunger;
    private int Energy = 100;
    public Parrot(String p){
        name = p;
    }    
    public playWith(){
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