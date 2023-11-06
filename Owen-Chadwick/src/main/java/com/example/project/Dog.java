package com.example.project;

class Dog extends pet implements eatsnspeaks{

    public Dog (String n){
        name = n;
        System.out.println("You got a new dog named " + name);
    }
    public String giveBath(){
        mood-=3;
        return "You gave " + name + " a bath, his mood is " + getMood();
    }
    public void feed() {
        System.out.println("You fed " + name + " treats.");
        energy++;
        hunger+=3;
        System.out.println(name +"'s hunger is now " + hunger + " and energy is now "+ energy);
    }

    public void speak() {
        System.out.println("meow");
    }
    
}