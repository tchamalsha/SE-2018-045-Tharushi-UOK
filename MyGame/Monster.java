package com.company;
public class Monster{
    String name;
    int age;

    Warrior stick;

    Monster(String name,int age){
        this.name =name;
        this.age = age;
    }

    void changeAge(Warrior warrior,Monster monster){
        monster.age=warrior.age;
        System.out.println("Age of "+monster.name+" is "+monster.age);
    }

    void Steal(Warrior warrior,String monsterName){
        System.out.println(monsterName + " has stolen the stick of "+ warrior.name);
        warrior.stick=false;
    }

}