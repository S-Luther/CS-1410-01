package com.example.project;
public class Player{
    
    public Player(){

        private String name;
        private int health = 100;

        public Player(String n){
           // name = wjateva
            System.out.println("Hi, I'm " + name);
    }
    //need to make Goblin.java and Ogre.java class for these to work together.
    //public class Goblin{
        //private String name;
        //private int health = 4;

        //private void die(){
            //System.out.println(name + " has passed away");
            //name = "deceased " + name;
       // }
        //public Goblin(String n){
            //name = n;
            //System.out.println("A goblin named " + name + "has entered the field of battle");
    //}
    //public void battle(){
        //health --;
        //if(health == 0){

        }
    }
        }
    }

    public String getName(){
        return name;

    }
    public void fightGoblin(Goblin b){
        b.battle();
        health -= 2;
    }
    }
    public void fightOgre(Ogre o){
        o.battle();
        health -= 50;
    }
}