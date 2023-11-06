package com.example.project;

public class Goblin extends Sentient implements Jumpable{

    public Goblin(String n){
        name = n;
        health = 4;
        location[0] = 1;
        location[1] = 1;
    }

    @Override
    public void think() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'think'");
    }

    @Override
    public void feel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'feel'");
    }

    @Override
    public void jump() {
        System.out.println(name+  "jumped 2 inches.");
    }


    
    
}
