package com.app;

public class Main {
    public static void main(String[] args) {

        int[] array = {3, -5, 24, 6, -7, 13, 25, 2,-12};

        Helper S = new Helper();

        int sum = S.FindSum(array);
        System.out.println("sum = " + sum);
        System.out.println("--------------------------------------");

        int sum1 = Helper.FindProduct(array);
        System.out.println("sum1 = " + sum1);
        System.out.println("--------------------------------------");

        int avg = Helper.FindAvg(array);
        System.out.println("avg = " + avg);
        System.out.println("--------------------------------------");

        int negative = Helper.Negative(array);
        System.out.println("count = " + negative);
        System.out.println("--------------------------------------");

        int min = Helper.FindMin(array);
        System.out.println("min = "+min);
        System.out.println("--------------------------------------");

        int max = Helper.FindMax(array);
        System.out.println("max = "+max);
        System.out.println("--------------------------------------");


    }
}
