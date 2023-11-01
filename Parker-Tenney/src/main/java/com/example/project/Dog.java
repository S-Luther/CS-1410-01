package com.example.project;

public class Dog extends Pet {

    mood = 7;
    hunger = 9; 
    energy = 5;

    public Dog(String n) {
        name = n;
        System.out.println("I have a dog named " + name + ".");
    }

    public void throwFrisbee() {
        mood++;
        hunger++;
        energy--;
    }

    public void eatKibble() {
        hunger--;
    }


}
