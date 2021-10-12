package com.app;

public class Helper {
    public static int FindSum(int[] array) {

        int sum = 0;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static int FindProduct(int[] array) {

        int sum = 1;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            sum = sum * array[i];
        }
        return sum;
    }

    public static int FindAvg(int[] array) {

        int sum = FindSum(array);
        float avg = sum / array.length;
        System.out.println("avg = " + avg);
        if (avg > 5) {
            System.out.println("OK !!!");
        }
        return sum;

    }

    public static int Negative(int[] array) {

        int count = 0;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        return count;

    }

    public static int FindMin(int[] array) {

        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int FindMax(int[] array) {

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
