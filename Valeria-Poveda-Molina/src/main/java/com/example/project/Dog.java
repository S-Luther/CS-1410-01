package com.example.project;

import com.example.project.Interaction;

public class Dog extends Pet implements Interaction {
    public Dog(int mood, int hunger, int energy) {
        super(mood, hunger, energy);
    }
    @Override
    public void feed(){
    }

    @Override
    public void speak(){

}
   