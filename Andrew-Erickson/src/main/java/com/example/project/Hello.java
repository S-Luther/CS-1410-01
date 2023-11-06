package com.example.project;

public class Hello {

 static void main(String[]){

        Cat Crayon = new Cat("Crayon");

        Dog Tyskie = new Dog("Tyskie");

        Parrot Azores = new Parrot("Azores");


    }    
   
}

/* package com.example.project;

public class Entity {

    protected boolean cursed;
    protected int[] location = new int[2];
    protected boolean visible = true;

    protected void hide(){
        visible = false;
    }

    protected void reveal(){
        visible = true;
    }

    protected int[] getOwnLocation(){
        return location;
    }

    public int[] getLocation(){
        if(visible){
            return location;
        }
        return null;
    }

    protected void updateLocation(int[] l){
        location = l;
    }

}
 */