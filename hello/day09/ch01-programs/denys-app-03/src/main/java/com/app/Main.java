package com.app;

public class Main {

    public static void main(String[] args) {
        SubChild subChild = new SubChild();
        System.out.println("---------------------");
        SubChild subChild2 = new SubChild();
        System.out.println("---------------------");
        SubChild subChild3 = new SubChild();
        subChild2.speak();


        subChild2.speak(6);

        System.out.println("-------------------");
        Parent p = new SubChild();
        p.speak();
       // p.tv();



    }

}
