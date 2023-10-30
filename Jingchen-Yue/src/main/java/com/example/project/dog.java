package com.example.project;

public class Dog {
private String name;
    private int mood = 4;
    private int Hunger = 5;
    private  int energy = 3;

public Dog(String n){
        name = n;
        System.out.println(  name + " jump to you");
    }

private void goOnAWalk(){
    mood++; 
    energy--;
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