package com.app;

public class Main {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.name = "Jack";

        Animal a2 = new Animal();
        a2.name = "Kesha";

        System.out.println("a1.name="+a1.name);
        System.out.println("a2.name="+a2.name);

        System.out.println("---------------");
        new Animal();

        System.out.println("---------------");
        Animal a3 = new Animal("Denis");
        System.out.println("a3.name="+a3.name);

        Animal a4 = new Animal("sERGEY");
        System.out.println("a4.name="+a4.name);

        System.out.println();

    }

}
