package com.example.project;

public class parrots extends Pet{

private String name;
    private int mood = 6;
    private int Hunger = 3;
    private  int energy = 5;

public parrots(String n){
        name = n;
        System.out.println(  name + " say hello to you");
    }

private void talk(){
    mood++; 
    energy++;
}
private void feed(){
    energy++; 
    Hunger--;
}

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
    
