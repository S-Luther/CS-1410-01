package com.example.project;

class Friend {

    private boolean happy;
    private String name;

    public Friend(String N) {
        name = N;
        System.out.println("My name is " + name);
    }

    public void makeHappy() {
        happy = true;
    }

    public void makeSad() {
        happy = false;
    }

    public void askName() {
        System.out.println("I am " + name);
    }

    public void askMood() {
        if (happy == true) {
            System.out.println("I am happy!");
        } else {
            System.out.println("I am sad...");
        }
    }

}

//looks great!


public class Hello {
  

    public static void main(String[] args){
        
        Friend dude = new Friend("John");
        dude.makeHappy();
        dude.askMood();
        dude.makeSad();
        dude.askMood();

    }

}


