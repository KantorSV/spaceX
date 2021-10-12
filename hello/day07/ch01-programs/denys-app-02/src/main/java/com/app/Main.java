package com.app;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        while(i<10){
            System.out.println("line # "+i);
            i++;
        }
        System.out.println("--------------------");
        int n = 21;
        Helper.printLines(n);
    }

}
