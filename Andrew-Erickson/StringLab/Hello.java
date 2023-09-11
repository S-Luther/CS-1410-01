package com.example.project;

//import (hopefully)

public class Hello {

    static int[][] intArray = {
        {1,2},
        {3,4}
        }

        //int array declared outside main method with values

    public static void main (String[] args) {

            //print time!

        for (int i = 0; i<2; i++){

            // running through "x" axis

            for (int j = 0; j<2; j++){
                
                // running through "y" axis

                System.out.print(intArray[i][j]);

                    //actual printing of each individual value
            
            }

            System.out.println;

            //println to "return" to next line

        }
        
        

    }
    
}