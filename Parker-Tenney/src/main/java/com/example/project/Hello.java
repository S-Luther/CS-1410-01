package com.example.project;

public class Hello {



    public static void main(String[] args){
        
        int[][][] arr = new int[2][2][2];
        int fillTable = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int z = 0; z < 2; z++) {
                    arr[i][j][z] = fillTable;
                    fillTable++;
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int z = 0; z < 2; z++) {
                    System.out.print(arr[i][j][z]);
                }
            }
        }


    }

}


