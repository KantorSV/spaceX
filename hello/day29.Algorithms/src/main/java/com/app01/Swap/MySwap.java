package com.app01.Swap;

public class MySwap {

    public void swap1(int[] data, int i, int j){

        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public void swap2(int[] data, int i, int j){

        data[i] = data[i] + data[j];
        data[j] = data[i] - data[j];
        data[i] = data[i] - data[j];
    }
}
