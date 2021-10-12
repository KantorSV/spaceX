package com.app;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,-10,4,5,658,6,7,-5,8,9,100};
        ArrayHelper arrayHelper = new ArrayHelper();
        int sum = arrayHelper.findSum(array);
        System.out.println("sum="+sum);
        System.out.println("-----------------------------------------------");
        int sum1 = arrayHelper.findProduct(array);
        System.out.println("sum1="+sum1);
        System.out.println("----------------------------");
        arrayHelper.findAvg(array);
        System.out.println("-----------------------------");
        int negativeCount = arrayHelper.findNegative(array);
        System.out.println("negativeCount="+negativeCount);
        System.out.println("-----------------------------");
        int min = arrayHelper.findMin(array);
        System.out.println("min="+min);
        System.out.println("-----------------------------");
        int max = arrayHelper.findMax(array);
        System.out.println("max="+max);
    }



}
