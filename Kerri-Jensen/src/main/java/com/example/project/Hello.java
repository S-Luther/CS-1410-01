package com.example.project;
    public class Hello{
        public static void main(String[] args){
           
            int[][][] data = new int[2][2][2];
            int temp = 0;


            for (int i = 0; i < 2; i++){
                for(int j = 0; j < 2; j++){
                    for(int k = 0; k < 2; k++){
                        temp++;
                        data[i][j][k] = temp;
                    System.out.print(data[i][j][k]);

                }
            }


        }
        
    }
    }