package com.example.project;

public class dog{
    private String name;
    private int mood = 100;
    private int hunger = 100;
    private int energy = 100;


public dog(String N){
 name = N;

}

public String getName(){
    return name;
}

public void setName(){
    return name;
}
public void goOnWalk(){
    energy --;
    hunger --;
    mood ++;
}

public void feed(){
    energy ++;
    hunger ++;
    mood ++;

}
   


}