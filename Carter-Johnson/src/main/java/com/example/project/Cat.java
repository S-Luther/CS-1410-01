package com.example.project;

public class Cat {
    private String Name;
    private boolean Mood;
    private int Hunger;
    private int Energy = 100;
    public Cat(String c){
        name = c;
        System.out.println("Your cat is named " + Name)
    }    
    public goOnWalk(){
        Energy -= 10;
        Hunger += 10;
        Mood = true;
        System.out.println("You took " + Name + " on a walk")
    }
    public feed(){
        Energy += 10;
        Hunger -= 10;
        Mood = true
        System.out.println("You fed " + Name)
    } 
}