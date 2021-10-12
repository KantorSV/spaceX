package com.app;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;


        int[] array = new int[7];
        int number1 = array[0];
        System.out.println("array[0]="+number1);
        int number2 = array[1];
        System.out.println("array[1]="+number2);
        System.out.println("-------------------------------------");

        int n = array.length;
        for(int i=0;i<n;i++){
            System.out.println("array["+i+"]="+array[i]);
        }
        System.out.println("--------------------------------------");
        array[0] = 5;
        array[1] = 9;
        array[2] = -1;
        array[3] = 15;
        for(int i=0;i<n;i++){
            System.out.println("array["+i+"]="+array[i]);
        }

        System.out.println("--------------------------------------");
        for(int i=0;i<n;i++){
            array[i] = i+500;
        }
        for(int i=0;i<n;i++){
            System.out.println("array["+i+"]="+array[i]);
        }



    }
}
