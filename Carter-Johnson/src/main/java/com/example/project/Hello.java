package com.example.project;

public class Hello {
    public static void main(String[] args) {
        int [][][] a = new int [2][2][2];
        int add = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    a [i][j][k] = add++;
                    System.out.print(a [i][j][k]);
                }
            }
        }
    }
}