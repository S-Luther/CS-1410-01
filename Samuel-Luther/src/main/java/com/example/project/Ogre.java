package com.example.project;

public class Ogre {
    private String name;
    private int health = 400;

    private void die(){
        System.out.println(name + " has passed away.");
        name = "deceased " + name;
    }

    public Ogre(String n){
        name = n;
        System.out.println("An Ogre named "+name + " has entered the field of battle.");
    }

    public void battle(){
        health--;
        if(health == 0){
            die();
        }
    }
}
