package com.example.project;
import java.util.Scanner;

class Friend{
    private boolean happy = true;
    private String name;

    Friend(String N){
        name = N;
        System.out.println(name + " is your home-boy");
    }
	//these should be public methods and they need a return type like void
	public void makeHappy(){
		happy = true;
	}
	public void makeSad(){
		happy = false;
	}
	public void checkMood(){
		if(happy == true){
			System.out.println(name + " is happy");
			}
			else if(happy == false){
							System.out.println(name + " is sad");
			}
			else {
				System.out.println("Idk what is going on with " + name);
			}
	}
}


public class Hello {
    public static void main(String[] args){
        Friend nombre = new Friend("Phil");
		Scanner in = new Scanner(System.in);
		System.out.println("If you want to make your friend happy, enter \"happy\".");
		System.out.println("If you want to make your friend sad, enter \"sad\".");
		while (true){
			String method = in.next();
			if (method.equalsIgnoreCase("happy")){
			nombre.makeHappy();
			}
			 else if (method.equalsIgnoreCase("sad")){
			nombre.makeSad();
			}
			else {
			nombre.checkMood();

			}
		}

		//instead call nombre.makeHappy();


			
    }
}