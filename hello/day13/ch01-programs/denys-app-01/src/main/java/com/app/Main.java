package com.app;

public class Main {

    public static void main(String[] args) {
        int[] data = new int[3];
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;

        System.out.println("data[1]=" + data[1]);


        try {
            System.out.println("start try");
            System.out.println("data[3]=" + data[3]);
            System.out.println("finish try");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("start catch");
            System.out.println("this is exception");
            System.out.println("finish catch");
        } finally {
            System.out.println("start finally");
            System.out.println("finally");
            System.out.println("start finally");
        }


    }

}
