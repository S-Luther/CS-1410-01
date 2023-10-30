package com.example.project;

public class Cat{

    private String name;
    name = n;
    private int mood = 3;
    private int energy = 3;
    private int hunger = 3;
    //5 is high, 1 is low
    //idk how much energy to start with

    public Cat(String n){
        name = n;
        System.out.println("Meet " + name + "!");
    }

    public void feedCat(){
        mood++;
        energy++;
        hunger--;
    }

    public void leaveCatAloneToChill(){
        mood++;
        energy++;
    }

    public void rubCat(){
        mood++;
        energy--;
        //they will probably feel sleepy
      
    }


    //mood, happiness
    private void mood(){
        if(mood <= 5){
            System.out.println("A kitten named " + name + " is happy!");
        }
    }

    private void energy(){
        if(energy <= 5){
            System.out.println("A kitten named " + name + " is feeling energized!");
        }
    }

    private void hunger(){
        if(hunger == 0){
            System.out.println("A kitten named " + name + " is well-fed!");
        }
    }
    public String getName(){
        return name;
    }

    public void fightDog{}
}