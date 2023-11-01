package com.example.project;

public class Dog{

    private String name;
    name = n;
    private int mood = 3;
    private int energy = 3;
    private int hunger = 3;
    private int pain = 3;
    //5 is high, 1 is low
    //idk how much energy to start with

    public Dog(String n){
        name = n;
        System.out.println("Meet " + name + "!");
    }

    //these need parentheses but otherwise will work great!
    public void feedDog(){
        mood++;
        energy++;
        hunger--;
    }

    public void cuddleDog(){
        mood++;
        energy++;
    }

    public void runWithDog(){
        mood++;
        energy--;
        hunger++;
    }


    //mood, happiness
    private void mood(){
        if(mood <= 5){
            System.out.println("A puppy named " + name + " is happy!");
        }
    }

    private void energy(){
        if(energy <= 5){
            System.out.println("A puppy named " + name + " is feeling energized!");
        }
    }

    private void hunger(){
        if(hunger == 0){
            System.out.println("A puppy named " + name + " is well-fed!");
        }
    }
    public String getName(){
        return name;

    
    public void fight(){
        
    }
    }
    
}
