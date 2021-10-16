package com.app03.min.array;

public class FindMin {

    public int min(int[] data){

        int min = data[0];
        for (int i = 0; i < data.length; i ++){
            if (data[i] < min){
                min = data[i];
            }
        }
        return min;

    }
}
