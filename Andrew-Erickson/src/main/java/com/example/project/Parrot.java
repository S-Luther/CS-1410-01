package com.example.project;

    public class Parrot extends Pet implements Feed {

    name = "Tyskie";
    Hunger = 1;
    Energy = 0;
    Mood = false;
// you 

    public void feed(){

        String food = "Parrot pellets and government agents";

    }


    System.out.println("Hunger is at " + Hunger);
    
    System.out.println("Energy is at " + Energy);

    System.out.println("Mood is currently " + Mood);

    System.out.println(name + " desires " + food);


    }