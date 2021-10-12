package com.app;

public class Main2 {

    public static void main(String[] args) {
        Person p1 = null;
        try {
            System.out.println("try - start");
            //p1 = new Person();
            p1.setAge(10);
            p1.setName("Name1");
            System.out.println("try - finish");
        } catch (Exception ex) {
            System.out.println("catch - start");
            ex.printStackTrace();
            System.out.println("catch - finish");
        } finally {
            System.out.println("finally - start");
            System.out.println("p1=" + p1);
            System.out.println("finally - finish");

            /*Person p2 = null;
            try {
                System.out.println("try!!!!");
                p2.setName("Name2");
                p2.setAge(20);
            } catch (Exception ex) {
                System.out.println("CATCH!!!!");
            } finally {
                System.out.println("FINALLY!!!!");
            }*/


        }


    }

}
