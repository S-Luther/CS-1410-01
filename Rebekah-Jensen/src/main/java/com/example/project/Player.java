package com.example.project;

public class Player{

    private String name;
    private int health = 100;


    public Player(String n){
        name = n;
        System.out.println("Hi! I'm " + name);
    }

    public String getName(){
        return name;
    }

    public void fightGoblin(Goblin b){
        b.battle();
        health -= 2;

        System.out.println(name + " has struck " + g.getName()+ " with a nasty dagger.");
        System.out.println(name + " has sustained damage and is now at " + health + " health");

    }

    public void fightOgre(Ogre o){
        o.battle();
        health -= 50;
    }

}