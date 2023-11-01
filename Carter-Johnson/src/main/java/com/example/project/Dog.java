package com.example.project;

public class Dog {
    private String Name;
    private boolean Mood;
    private int Hunger;
    private int Energy = 100;
    public Dog(String d){
        name = d;
        System.out.println("Your dog is named " + Name)
    }    
    public goOnWalk(){
        Energy -= 10;
        Hunger += 10;
        Mood = true;
        System.out.println("You took " + Name + " for a walk")
    }
    public feed(){
        Energy += 10;
        Hunger -= 10;
        Mood = true
        System.out.println("You fed " + Name)
    } 
}