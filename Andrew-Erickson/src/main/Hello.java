package com.example.project;

public class Hello {

  

  public int sum(int a, int b){

      return a + b;

  }

  public static void main(String[] args) { 


        Hello hello = new Hello();
                
        
        new sum().show();


        System.out.print(hello.sum(12, 3));
        //If you wrap ^^^this line in a println it will run as intended

        //^^^thank you!

  }



}
