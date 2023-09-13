package com.example.project;

public class TestHello {

  public static void main(String[] args) {    

      //declaring array as 3 constiting of 3D

      int[][][] ArrayProper = {

        //inserting values in each row and column of first "table"

        {{1,2},
        {3,4}
        },

        //inserting values in each row and column of second "table"

        {{5,6},
        {7,8}
        }

    }

  for (int i=0; i<2; i++){
    for (int j=0; j<2; j++){
      for (int k=0; k<2; k++){
        system.out.print(ArrayProper[i][j][k]);
    
       }
       system.out.println();
      }
      system.out.println();
    }
  }
}
