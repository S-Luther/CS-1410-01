package com.example.project;
import java.util.Scanner;
//you'll need this

public class Hello{

    public static void main(String[] args){
// import java.util.Scanner;

		
		String move = "a";
		
		Scanner in = new Scanner(System.in);
		System.out.println("How do you want to move your cube homie?");
		move = in.next();
		
	switch(move.toLowerCase()) {
	
	case "u":
		System.out.println("Input: " + move );
		System.out.println("Retun: Up");
		break;
	case "d" :
		System.out.println("Input: " + move );
		System.out.println("Retun: Down");
		break;
	case "r" :
		System.out.println("Input: " + move );
		System.out.println("Retun: Right");
		break;
	case "l" :
		System.out.println("Input: " + move );
		System.out.println("Retun: Left");
		break;
	case "f" :
		System.out.println("Input: " + move );
		System.out.println("Retun: Front");
		break;
	case "b" :
		System.out.println("Input: " + move );
		System.out.println("Retun: Back");
		break;

default:
	System.out.println("Your cube is broken, try again dawg");
	break;
		
			}
	}
}


