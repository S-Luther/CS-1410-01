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
            System.out.println(" happy!");
        } else {
            System.out.println(" sad");
        }
    }

}

//looks perfect!


public class Hello {
   public static void main(String[] args){
        
        Friend g = new Friend("didi");
        g.makeHappy();
        g.askMood();
        g.makeSad();
        g.askMood();
}

}







