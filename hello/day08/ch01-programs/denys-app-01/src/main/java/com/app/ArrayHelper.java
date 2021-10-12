package com.app;

public class ArrayHelper {


    public int findSum(int[] array) {
        int sum = 0;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
        }

        return sum;
    }

    public int findProduct(int[] array) {
        int sum = 1;
        //int n = array.length;
        for (int i = 0; i < array.length; i++) {
            sum = sum * array[i];
        }
        return sum;
    }

    public void findAvg(int[] array){
        int sum = findSum(array);
        float avg = sum/array.length;
        System.out.println("avg="+avg);
        if(avg>10){
            System.out.println("This is good result");
        }
        //return avg;
    }

    //[1,2,-7,9-5,-1]
    public int findNegative(int[] array){
        int count = 0;
        int n = array.length;
        for(int i=0;i<n;i++){
            if(array[i]<0){
                count++;
            }

        }
        return count;
    }

    public int findMin(int[] array){
        int min = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
    public int findMax(int[] array){
        int max = array[0];

        for(int i = 0;i<array.length;i++){
            if (array[i]>max) {
                max = array[i];


            }

        }
        return max;
    }


}
