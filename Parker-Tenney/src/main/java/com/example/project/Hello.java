package com.example.project;


public class Hello {

    public static void main(String[] args){
        
        Cat Dog = new Cat("Dog");
        Dog.feed();
        Dog.sleep();
        Dog.meow();
        Dog.escapeOutside();
        Dog.printStats();

        Dog Cat = new Dog("Cat");
        Cat.feed();
        Cat.throwFrisbee();
        Cat.sleep();
        Cat.printStats();

        Parrot Bartholomew = new Parrot("King Bartholomew II");
        Bartholomew.fly();
        Bartholomew.talk();
        Bartholomew.feed();
        Bartholomew.sleep();
        Bartholomew.printStats();

    }

}


