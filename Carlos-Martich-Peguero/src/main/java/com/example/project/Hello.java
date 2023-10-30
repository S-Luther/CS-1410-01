package com.example.project;



class Friend{
    private boolean happy;
    private String name;

    public void Friend(String N){

        name = N;
    }


    
    public void makeHappy() {
        happy = true;
        
    }
    
    public void makeSad() {
        happy = false;

        
    }
}

public class Hello {


public static void main(String[] args){

Friend Carlos = new Friend("Carlos");

}
}

