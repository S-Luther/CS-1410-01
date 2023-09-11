package com.example.project;

public class Hello {

    public static void main(String[] args){

        String[][] stringValues = {     {"working", "with"}, 
                                        {"2D", "arrays"}, 
                                        {"is", "fun"}   
                                  };

        for(String[] rowOfStrings : twoDStringArray) {
            for(String s : rowOfStrings) {
                System.out.println(s);
            }
        }

    }
}








