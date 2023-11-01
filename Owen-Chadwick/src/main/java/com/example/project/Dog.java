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
    public String feed(){
        hunger+=2;
        energy+=1;
        return "You fed " + dog1.getName() + "his hunger is " + getHunger();
    }
    public String giveBath(){
        mood-=3;
        return "You gave " + dog1.getName() + " a bath, his mood is " + getMood();
    }
}