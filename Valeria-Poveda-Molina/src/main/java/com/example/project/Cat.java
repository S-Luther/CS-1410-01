package com.example.project;

import com.example.project.Interaction;


public class Cat extends Pet implements Interaction {
    public Cat(int mood, int hunger, int energy) {
        super(mood, hunger, energy);
    }
    @Override
    public void feed(){
    }

    @Override
    public void speak(){
    }

}