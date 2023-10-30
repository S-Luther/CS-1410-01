package com.example.project;

class Dog{
    private String name;
    private int hunger = 5;
    private int mood = 5;
    private  int energy = 5;

    public Dog (String n){
        name = n;
        System.out.println("You got a new dog named " + name);
    }
    public String getName(){
        return name;
    }
    public int getHunger(){
        return hunger;
    }
    public int getMood(){
        return mood;
    }
        public int getEnergy(){
        return energy;
    }
    
}