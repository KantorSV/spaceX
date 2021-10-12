package com.app;

public class Animal {
    public String name;

    public Animal(){
        System.out.println("Animal.Constructor");
    }

    public Animal(String animalName){
        System.out.println("Animal.Constructor-with animalName");
        name = animalName;
    }

}
