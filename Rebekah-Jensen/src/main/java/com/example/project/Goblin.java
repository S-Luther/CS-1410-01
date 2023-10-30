package com.example.project;

public class Goblin{

    private String name;
    name = n;
    private int health = 4;

    private void die(){
        System.out.println(name + " has passed away.");
        name = " deceased " + name;
    }

    public Goblin(String n){
        name = n;
        System.out.println(name + " has entered the field of battle.");
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