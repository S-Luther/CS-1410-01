package com.example.project;

public class Hello {
    public static void main(String[] args){
     
	  Dog dog1 = new Dog("Curious George");
	Cat cat1 = new Cat("Puss in Boots");
	Parrot parrot1 = new Parrot("Squaks McGee");
	dog1.getName();
	dog1.getEnergy();
	dog1.getHunger();
	dog1.getMood();
	cat1.getName();
	parrot1.getName();
    }
}