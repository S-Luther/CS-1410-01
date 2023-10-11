package com.example.project;

public class Hello {
    public int sum() {
        return 2 + 2;
    }
    public static void main(String[] args) {
        Hello hello = new Hello();
        new Hello().sum();
    }
}