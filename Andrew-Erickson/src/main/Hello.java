package com.example.project;


class Friend{

    private boolean happy;
    private String name;

    public Friend(String N){
        name = N;
        System.out.println(name + " is your friend");
    }

    public void makeHappy(){
        happy = true;
        System.out.println(name + " is happy :) " + health);
    }

    public void makeSad(){
        happy = false;
        System.out.println(name + " is sad :( " + health);
    }
}


public class Hello {
    public static void main(String[] args){
        Friend N = new Friend("N");
        Friend.makeSad();
        Friend.makeHappy();
        
    }

  }


/*

Code from Enemy example from Professor Luther

class Enemy{
    private int health = 10;
    private String name;

    private void die(){
        System.out.println("The " + name + "has passed away.");
        name = "deceased " + name;
    }

    public Enemy(String N){
        name = N;
        System.out.println(name + " has come to battle");
    }

    public void askName(){
        System.out.println("I am " + name);
    }

    public void battle(){
        health--;
        System.out.println(name + " has been hurt, health is now " + health);

        if(health == 0){
            die();
        }
    }
}


public class Hello {
    public static void main(String[] args){
        Enemy ogre = new Enemy("Ogre");

        ogre.askName();

        for(int i =0; i<10; i++){
            ogre.battle();
        }

        ogre.askName();

    }
}


*/