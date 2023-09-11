package com.example.project;

public class Hello{

    public static void main(String[] args){

        //how does my code know that it needs to stop at 4?
        //I'm trying to understand how this works...
        //ah, it is because the for loops only run 4 times.


    int[][] array = new int [2][2];
    int number = 1;
    array[0][0] = 1;
    array[0][1] = 2;

    array[1][0] = 3;
    array[1][1] = 4;



    //[0][x] loop?
    for(int i = 0; i < 2; i++){//2
        System.out.println();
        for(int j = 0; j < 2; j++){//2
            array[i][j] = number;
            number++;
            //you need to print the values of array here.

            System.out.print(array[i][j] + " ");
        }
        System.out.println();
        }
    }
}

//cool example via the slideshow (study this) ignore this?  uhhhhh

// public static void main(String[] args){

//     int[][] array = {{1,2}},{{3,4}








