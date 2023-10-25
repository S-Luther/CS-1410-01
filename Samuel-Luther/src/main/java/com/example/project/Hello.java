package com.example.project;



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

    public void battle(){C
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





