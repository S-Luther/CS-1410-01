package com.example.project;
    
    public class Cat{
        private String name;
        private int hunger = 1;
        private int mood = 1;
        private int energy = 1;
        
        public Cat(String n){
            name = n;
            System.out.println("A cat named " + name + " is in front of you.");
        }

        
        public void Hunger(){
            hunger ++;
            System.out.println(name + " has eaten.");
        //how would i show the cat getting energy from eating?
       }
        
        public void Mood(){
            mood ++;
            if(mood == 0){
                System.out.println("Dude you have to play with or feed " + name);
                //how to add play or eat?? hmm
                //what should i put here?
            }
        }
        public void Energy(){
            //plays 
            energy --;
            if(energy == 0){
                System.out.println(name + " is ready for a nap.");
            }
            //how to show cat being happy or sad or energized?

        }

        
    }