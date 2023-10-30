package com.example.project;

public class Goblin {

    

    private void die(){
        System.out.println(name + " has passed away.");
        name = "deceased " + name;
    }

    public Goblin(String n){
        name = n;
        System.out.println("A Goblin named " + name + " has entered the field of battle.");
    }

    public void battle(){
        health--;
        if(health == 0){
            die();
        }
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }
    
}
