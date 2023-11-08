package com.example.project;

class Parrot extends pet implements eatsnspeaks{

    public Parrot (String n){
        name = n;
        System.out.println("You got a new parrot named " + name);
    }

    public void feed() {
        System.out.println("you fed " + name + " sunflower seeds");
        System.out.println(name + "'s hunger is now " + hunger + " and their energy is " + energy);
    }

    public void speak() {
        System.out.println("Who let the dogs out?");
    }
}