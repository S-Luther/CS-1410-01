package com.example.project;

public class Snake {

    mood = 2;
    energy = 4;
    hunger = 3;

    public Snake(String n) {
        name = n;
        System.out.println("I have a snake named " + name + ".");
    }

    public void slither() {
        energy--;
        mood++;
    }

    public void eatMouse() {
        hunger--;
    }

    public void shedSkin() {
        hunger += 2;
        mood++;
        energy -= 2;
    }

}