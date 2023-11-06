package com.example.project;

public class Skeleton extends Enemy implements Jumpable{
    public Skeleton(String n){
        name = n;
        health = 10;
    }

    @Override
    public void jump() {
        System.out.println(name+  "jumped 1 foot.");
    }
    
}
