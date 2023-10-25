package com.example.project;
//perfect
public class Hello{
  public static void main(String[] args){
  }
}
class Friend{
  private boolean happy;
  private String name;
  public Friend(String N){
    name = N;
  }

  public void makeHappy(){
    if(happy == true){
      System.out.println("True :)");
    }

    happy = true;
  }

  public void makeSad(){
    if(happy =! true){
      System.out.println("False :(");
    }
    happy = false;
  }

}

    
//nice! Looks great!
