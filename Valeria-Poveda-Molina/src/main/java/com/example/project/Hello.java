package com.example.project;

public class Hello {
    public static void main (String[] args){
        
        switch (moves){
        case 'U':
            move = "up";
            break;
         case 'D':
            move = "down";
            break;
         case 'R':
            move = "right";
            break;
         case 'L':
            move = "left";
            break;
         case 'F':
            move = "front";
            break;
         case 'B':
            move = "back";
            break;
        default;
            break;
        }
        System.out.print(move);
    }
}