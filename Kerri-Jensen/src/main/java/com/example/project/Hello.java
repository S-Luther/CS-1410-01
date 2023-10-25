package com.example.project;
    
    class friend{
        private boolean happy;
        private String name;
        
        public friend(String N){
            name = N;

        }
        public void makeHappy(){
            happy = true;
            if(happy == true){
                System.out.println("woohoo! u r happy!");

            }
        }
        public void makeSad(){
            happy = false;
            if(happy == false){
                System.out.println("nooo u r sad.");
            }
        }
        
    }

public class Hello{
    public static void main(String[] args){

        friend fred = new friend("fred");
        fred.makeHappy();
        fred.makeSad();

    }
}