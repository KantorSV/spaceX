package com.app;

public class MainWhile {

    public static void main(String[] args) {
        int [] array = new int[7];
        int n = array.length;
        int i=0;
        while(i<n){
            array[i] = i*2;
            i++;
        }
        System.out.println("i="+i);

        i = 0;
        while(i<n){
            System.out.println("array["+i+"]="+array[i]);
            i++;
        }

    }
}
