package com.example.project;

public class Ogre{
        private String name;
    private int health = 4;

    private void die(){
        System.out.println("An ogre named " + name + " has passed away.");
        name = "deceased + " name;
    }

    public Goblin(String n){
        name = n;
        System.out.println("An ogre named " + name + " has entered the field of battle.");
    }

    public void battle(){
        health--;;
        if(health == 0){
            die();
        }

}
}