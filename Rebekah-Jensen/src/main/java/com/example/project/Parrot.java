package com.example.project;

public class Parrot extends Pet implements Food, Speak{

    public void speak(){
        System.out.println("Squawk!")
    }

    public void food(){
        String parrotfood = "Humans";
        
    }

    private String name;
    name = n;
    private int mood = 3;
    private int energy = 3;
    private int hunger = 3;
    //5 is high, 1 is low
    //idk how much energy to start with

    public Parrot(String n){
        name = n;
        System.out.println("Meet " + name + "!");
    }

    public void feedParrot(){
        mood++;
        energy++;
        hunger--;
    }

    public void talkWithParrot(){
        mood++;
        energy--;
        hunger++;
    }

    public void letParrotOutToFly(){
        mood++;
        energy--;
        hunger++;
    }


    //mood, happiness
    private void mood(){
        if(mood <= 5){
            System.out.println("A parrot named " + name + " is happy!");
        }
    }

    private void energy(){
        if(energy <= 5){
            System.out.println("A parrot named " + name + " is feeling energized!");
        }
    }

    private void hunger(){
        if(hunger == 0){
            System.out.println("A parrot named " + name + " is well-fed!");
        }
    
}
    public String getName(){
        return name;
    }
}