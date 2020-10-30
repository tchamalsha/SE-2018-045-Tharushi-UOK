package com.company;
public class Warrior{
    String name;
    int age;
    boolean stick;//checking whether the warrior has the stick

    Warrior(String name,int age,boolean stick){
        this.name = name;
        this.age = age;
        this.stick = stick;

    }

    void Immobile(){
        if(!this.stick) {
            System.out.println(this.name + " can't move now! ");
        }
        else{
            System.out.println(this.name+" can move. ");
        }
    }

}