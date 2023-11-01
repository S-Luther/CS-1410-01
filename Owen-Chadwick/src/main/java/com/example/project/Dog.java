package com.example.project;

class Dog extends pet{

    public Dog (String n){
        name = n;
        System.out.println("You got a new dog named " + name);
    }
    public String giveBath(){
        mood-=3;
        return "You gave " + name + " a bath, his mood is " + getMood();
    }
}