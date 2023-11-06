package com.example.project;

public class Ogre extends Enemy implements Reasonable{

    public Ogre(String n){
        name = n;
        health = 40;
        location[0] = 2;
        location[1] = 5;
    }


    @Override
    public void convince(String argument) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'convince'");
    }


    
    
}
