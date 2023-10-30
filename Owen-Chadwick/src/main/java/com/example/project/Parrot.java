package com.example.project;

class Parrot{
    private String name;
    private int hunger =5;
    private int mood =5 ;
    private  int energy =5;

    public Parrot (String n){
        name = n;
        System.out.println("You got a new parrot named " + name);
    }
    //needs a return type
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