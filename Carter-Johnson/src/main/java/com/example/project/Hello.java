package com.example.project;

class Friend {
    private boolean happy;
    private String name;
    public Friend(String N){
        name = N;
        System.out.println("I am " + name);
    }
    public void makeHappy(){
        happy = true;
        System.out.println(name + " is now happy!");
    }
    public void makeSad(){
        happy = false;
        System.out.println(name + " is now sad...");
    }
}

class Hello {
    public static void main(String[] args) {
        Friend Bob = new Friend("Bob");
        Bob.makeSad();
        Bob.makeHappy();
    }
}