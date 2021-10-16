package com.app05.sum.array;

public class FindSum {

    public int sumOfArray(int[] data){

        int sum = 0;
        for (int i = 0; i < data.length; i ++){
            sum = sum + data[i];
        }
        return sum;
    }
}
