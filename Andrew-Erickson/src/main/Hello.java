package com.example.project;


//check under "projects"


public class Hello {
    public static void main(String[] args){
        Friend N = new Friend("N");
        Friend.makeSad();
        Friend.makeHappy();
        
    }

  }


/*class Friend{

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

*/