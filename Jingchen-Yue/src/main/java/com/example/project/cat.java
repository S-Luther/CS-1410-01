package com.example.project;

public class cat {
private String name;
    private int mood = 6;
    private int Hunger = 3;
    private  int energy = 5;

public cat(String n){
        name = n;
        System.out.println(  name + " meow meow");
    }

private void touch(){
    mood++; 
    energy++;
}
private void feed(){
    energy++; 
    Hunger--;
}
private void play ball(){
    energy--;
    mood++;
    Hunger++;
}
public String getName(){
        return name;
    }

    public int getMood(){
        return mood;
    }
public int getHunger(){
        return Hunger;
    }
public int getEnergy(){
        return energy;
    }
}