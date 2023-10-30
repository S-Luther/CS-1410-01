package com.example.project;


class Cat{
    private String name;
    private int hunger = 5;
    private int mood = 5;
    private  int energy = 5;

    public Cat (String n){
        name = n;
        System.out.println("You got a new cat named " + name);
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
    public String feed(){
        hunger += 2;
        energy += 1;
    }
    
    
}