package com.example.project;

import com.example.project.Interaction;

public class Parrot extends Pet implements Interaction {
    public Parrot(int mood, int hunger, int energy) {
        super(mood, hunger, energy);
    }
    @Override
    public void feed(){
    }

    @Override
    public void speak(){
    }
}