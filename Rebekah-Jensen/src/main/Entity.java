package com.example.project;

public class Entity{
    protected int[] location = new int [2];
    protected boolean visible = true;

    protected void hide(){
        visible = false;
    }

    protected void reveal(){
        visible = true;
    }

    protected int[] getLocation(){
        return location;
    }
    
}