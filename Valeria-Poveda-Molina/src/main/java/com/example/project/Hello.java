package com.example.project;

public class Hello {

    public static void main(String[] args){

        int[][] arr = new int [2][2];
        int num = 1;
        //semi colon 
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                arr[i][j] = num;
                num++;
            }
        }
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }

}




