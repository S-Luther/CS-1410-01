package com.example.project;

public class Dog extends Pet implements Feedable {    



    public void feed() {
        hunger--;
        System.out.println(name + " is eating kibble");
    }

    public Dog(String n) {
        mood = 7;
        hunger = 9; 
        energy = 5;    
        name = n;
        System.out.println("I have a dog named " + name + ".");
    }

    public void throwFrisbee() {
        mood++;
        hunger++;
        energy--;
    }



}
