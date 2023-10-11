package com.example.project;


class Cube {
    public String[][][] value =  {
        {
            {"r","r","r"},
            {"r","r","r"},
            {"r","r","r"},
        },
        {
            {"b","b","b"},
            {"b","b","b"},
            {"b","b","b"},
        },
        {
            {"w","w","w"},
            {"w","w","w"},
            {"w","w","w"},
        },
        {
            {"y","y","y"},
            {"y","y","y"},
            {"y","y","y"},
        },
        {
            {"o","o","o"},
            {"o","o","o"},
            {"o","o","o"},
        },
        {
            {"g","g","g"},
            {"g","g","g"},
            {"g","g","g"},
        },
    };

    public Cube(){
        
    }
    public Cube(int i){
        
    }
    public Cube(double i){
        
    }
    public Cube(double i,double j){
        
    }

    public void show(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    System.out.print(this.value[i][j][k]);
                }       
                System.out.println();    
            }          
            System.out.println();    
 
        }
    }

}


public class Hello {


    public static void main(String[] args){

        Hello hello = new Hello();


        new Cube().show();
        new Cube(5, 5.0);

    }
}





