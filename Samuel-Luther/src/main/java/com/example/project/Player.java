package com.example.project;

import java.io.Serializable;

import com.example.project.Actions.HeavyAttack;
import com.example.project.Social.Persuador;

public class Player implements HeavyAttack, Persuador, Serializable{

    private String name;

    public Player(String n){
        name = n;
    }

    @Override
    public void heavyStrike() {
        
    }

    @Override
    public void heavyBlock() {
        
    }

    @Override
    public void charm() {

    }

    @Override
    public void goad() {

    }

    @Override
    public void persuade() {

    }
    
}
