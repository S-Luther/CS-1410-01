package com.example.project;

    public class Cat {

        private String name;
        private int Mood = 1;
        private int Hunger = 1;
        private int Energy = 1;


        public Cat(String n){
            name = n;
            System.out.println("A cat named " + name + " is set before you.");

        private void Hunger(){
            Hunger ++;
            System.out.println(name + " has eaten.");
            

            if(Hunger == 0){

                name = name + " has starved :( ."
        
            }

            System.out.println("Hunger level for " + name + " is currently " + Hunger);
        }

        private void Mood(){
        Mood ++;

            if(Mood == 0){

                name = name + " is currently sad :( ."
        
            }

        private void Energy(){
            Energy --;
            if(Energy == 0){
                (name + " is ready for a nap.");
                            }

        }

        }

        }
    }