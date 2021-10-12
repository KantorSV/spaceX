package com.app;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = p1;

        p1.name="Denys";

        System.out.println("p2.name="+p2.name);


        Person p3 = new Person();
        System.out.println("p3.name="+p3.name);


        p3 = p2;
        System.out.println("p3.name="+p3.name);




    }

}
