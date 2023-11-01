package com.example.project;

public class Parrot {
    private String Name;
    private boolean Mood;
    private int Hunger;
    private int Energy = 100;
    public Parrot(String p){
        name = p;
        System.out.println("Your parrot is named " + Name)
    }    
    public playWith(){
        Energy -= 10;
        Hunger += 10;
        Mood = true;
        System.out.println("You played with " + Name)
    }
    public feed(){
        Energy += 10;
        Hunger -= 10;
        Mood = true
        System.out.println("You fed " + name)
    } 
}