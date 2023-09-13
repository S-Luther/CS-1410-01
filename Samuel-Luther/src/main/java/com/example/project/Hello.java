package com.example.project;

public class Hello {

    static String[][] Board = {
                                {"R","N","B","K","Q","B","N","R"},
                                {"p","p","p","p","p","p","p","p"},
                                {null,null,null,null,null,null,null,null},
                                {null,null,null,null,null,null,null,null},
                                {null,null,null,null,null,null,null,null},
                                {null,null,null,null,null,null,null,null},
                                {"p","p","p","p","p","p","p","p"},
                                {"R","N","B","K","Q","B","N","R"}
                              };


    static void move(String[][] board, int x1, int y1, int x2, int y2){

        board[y2][x2] = board[y1][x1];
        board[y1][x1] = null;
        

    }


    static void show(String[][] board){
        boolean flipper = false;



        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
                if(board[i][j] == null){
                    if(flipper){
                        System.out.print("\u2588\u2588\u2588");
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                else{
                    if(flipper){
                        System.out.print("\u2588"+board[i][j]+"\u2588");
                    }
                    else{
                        System.out.print(" "+board[i][j]+" ");
                    }
                }

                flipper = !flipper;
            }
            flipper = !flipper;
            System.out.println();
        }

    }


    public static void main(String[] args){
        show(Board);

        move(Board, 1, 1, 1, 2);

        System.out.println();

        show(Board);
      
    }


}





