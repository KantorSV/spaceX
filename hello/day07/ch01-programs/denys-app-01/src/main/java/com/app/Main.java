package com.app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello 1");
        System.out.println("Hello 2");
        System.out.println("Hello 3");
        System.out.println("Hello 1000 000");

        System.out.println("------------------------------");
        for(int i=0;i<=30;i++){
            System.out.println("i="+i);
        }

        System.out.println("---------------------------------");
        for(int i=10;i<=20;i=i+2){
            System.out.println("Hello "+i);
        }

        System.out.println("-----------------------------------");
        int n = 50;
        Helpr.priintLines(n);
    }





}
