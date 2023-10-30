package com.example.project;

public class Dog {

    private String name;
    private int mood = 7;
    private int hunger = 9; 
    private int energy = 5;

    public String getName(){
        return name;
    }

    public Dog(String n) {
        name = n;
        System.out.println("I have a dog named " + name + ".");
    }

    public void printStats() {
        System.out.println(mood);
        System.out.println(hunger);
        System.out.println(energy);
    }

    public void throwFrisbee() {
        mood++;
        hunger++;
        energy--;
    }

    public void eatKibble() {
        hunger--;
    }

    public void sleep() {
        mood--;
        energy++;
    }
}
