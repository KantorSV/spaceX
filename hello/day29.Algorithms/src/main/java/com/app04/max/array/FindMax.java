package com.app04.max.array;

public class FindMax {

    public int max(int[] data){

        int max = data[0];
        for (int i = 1; i < data.length; i ++){
            if (data[i] > max){
                max = data[i];
            }
        }
        return max;
    }
}
