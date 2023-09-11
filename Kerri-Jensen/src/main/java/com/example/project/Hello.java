package com.example.project;

public class Hello {


    public static void main(String[] args){
        int[][] someArray= new int[2][2]; //the size needs to be a number\
    
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.println(someArray[i][j] + " ");
            }
        }
        //this can be empty
        System.out.println(someArray);

    }

    //outside a method, so illegal
    // System.out.println();
}


//and you only need one array