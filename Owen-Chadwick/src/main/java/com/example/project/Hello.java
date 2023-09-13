package com.example.project;
//you'll nned this

public class Hello{

    public static void main(String[] args){


	
int num = 1;

		int [][][]arr = new int [2][2][2];
		
		for(int k = 0; k < 2; k++) {

		for(int j = 0; j < 2; j++) {

		for(int i = 0; i < 2; i++) {
			
			arr[i][j][k] = num++;
			
					}
				}
			}
		
		for(int k = 0; k < 2; k++) {

			for(int j = 0; j < 2; j++) {

			for(int i = 0; i < 2; i++) {
				
				System.out.print(arr[i][j][k] + " ");
				}
			}
		}


	}
}

