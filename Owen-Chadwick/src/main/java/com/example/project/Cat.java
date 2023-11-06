package com.example.project;

public class Cat extends pet implements eatsnspeaks{
    

    public Cat(String n){
        name = n;
        System.out.println("You got a new cat named " + name);
    }

    public String giveYarn(){
        mood+=3;
        energy-=1;
        return "You gave " + name +" a ball of yarn, his mood is now " + getMood() + " and his energy is now " + getEnergy(); 
    }

    public void feed() {
        System.out.println("You fed " + name + " mice.");
        energy++;
        hunger+=3;
        System.out.println(name +"'s hunger is now " + hunger + " and energy is now "+ energy);
    }

    public void speak() {
        System.out.println("meow");
    }
    
}