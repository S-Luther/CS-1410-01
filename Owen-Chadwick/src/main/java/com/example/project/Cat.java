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
        return "You fed " + cat1.getName() + " his hunger is now "+ gethunger();
    }
    public String giveYarn(){
        mood+=3;
        energy-=1;
        return "You gave " + cat1.getName() +" a ball of yarn, his mood is now " + cat1.getMood() + " and his energy is now " + cat1.getEnergy(); 
    }
    
}