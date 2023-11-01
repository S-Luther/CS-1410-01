package com.example.project;


class Cat extends pet{
    
    public Cat(String n){
        name = n;
        System.out.println("You got a new cat named " + name);
    }

    public String giveYarn(){
        mood+=3;
        energy-=1;
        return "You gave " + name +" a ball of yarn, his mood is now " + getMood() + " and his energy is now " + getEnergy(); 
    }
    
}