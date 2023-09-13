package com.example.project;

public class Hello{

    static void Print(String printArg) {
        System.out.println(printArg);
    }

    public static void main(String[] args) {

        int[][][] oneToEight = new int[2][2][2];
        int currentNum = 1;
        
        for (int i = 0; i < 2 ;i++) {
            for (int j = 0; j < 2 ; j++) {
                for (int k = 0; k < 2  ;k++ ) {
                    oneToEight[i][j][k] = currentNum;
                    currentNum++;
                }
            }
        }

        for (int l = 0; l < 2 ; l++) {

            for (int m = 0; m < 2 ; m++) {
                
                for (int n = 0; n < 2  ; n++ ) {
                    System.out.print(oneToEight[l][m][n]);
                    System.out.print(" , ");
                }
            }
        }


    }
}
