package com.company;
 public class MyGame {

    public static void main(String[] args) {
            Warrior warrior1=new Warrior("Archilies",25,true);
            Warrior warrior2=new Warrior("Hector",27,true);
            Monster monster1= new Monster("Agamennon",34);

            //setting the warrior1's age to monster's age
            monster1.changeAge(warrior1,monster1);


            //stealing warrior2's stick by monster
            monster1.Steal(warrior2,monster1.name);

            //checking the immobility
            warrior2.Immobile();
            warrior1.Immobile();


        }


}


