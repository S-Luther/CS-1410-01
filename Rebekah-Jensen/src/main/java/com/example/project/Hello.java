package com.example.project;

public class Hello {
    
    
    public int sum(int i, int j){
        return i + j;
    }   


    
       
        


  public static void main(String[] args) {  

    //then here create an object of Hello

    //instead of String lets have this be of type Hello
    Hello Hello = new Hello();

   
//then in here you can call Hello.sum(4,5)
    System.out.print(Hello.sum(4,5));

    // new Hello().sum();

  }
}