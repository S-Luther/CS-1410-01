package com.example.project;

public class Hello {
    public static void main (String[] args){
        int [][][] arr = new int [2][2][2];
        int num = 1;

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                for (int k = 0; k < 2; k++){
                    arr [i][j][k] = num;
                    num++
                }
            }
        }

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                for (int k = 0; k < 2; k++){
                    System.out.print(arr[i][j][k])
                }
            }
        }
    }
}