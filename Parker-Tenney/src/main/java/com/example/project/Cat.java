package com.example.project;

public class Cat extends Pet implements Feedable{    



    public Cat(String n) {
        mood = 3;
        hunger = 4; 
        energy = 1;   
        name = n;
        System.out.println("I have a cat named " + name + ".");
    }

    public void escapeOutside() {
        mood++;
        energy--;
        hunger++;
    }

    public void meow() {
        mood++;
    }

    public void feed() {
        hunger--;
        mood++;
        System.out.println(name + " is eating wet food");
    }

}