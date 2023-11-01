package com.example.project;

public class Enemy extends Creature{

    protected boolean hostile = false;

    private void die(){
        System.out.println(name + " has passed away!");
        name = "deceased " + name;
    }

    public void battle(){
        health--;
        if(health == 0){
            die();
        }
    }
    
}
