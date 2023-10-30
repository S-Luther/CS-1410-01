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
    hunger--;
}
private void play ball(){
    energy--;
    mood++;
    hunger++;
}
public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }
}