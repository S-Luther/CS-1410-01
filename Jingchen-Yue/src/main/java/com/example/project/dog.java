package com.example.project;

public class Dog extends Pet{
private String name;
    private int mood = 4;
    private int Hunger = 5;
    private  int energy = 3;

public Dog(String n){
        name = n;
        System.out.println(  name + " jump to you");
    }


}
private void feed(){
    energy++; 
    Hunger--;
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



