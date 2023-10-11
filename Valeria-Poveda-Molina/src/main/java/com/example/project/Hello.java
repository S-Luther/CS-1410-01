package com.example.project;

public class Hello {
    
    public static void main (String[] args){
        getDirection('U');
        getDirection('D');
        getDirection('R');
        getDirection('L');
        getDirection('F');
        getDirection('B');
    public static void getDirection(char moves)

    //looks almost perfect although you can just print out up instead of setting it equal to something
        switch (moves){
        case 'U':
        //System.out.print("up"); like this
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




