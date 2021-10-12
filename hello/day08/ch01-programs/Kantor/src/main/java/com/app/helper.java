package com.app;

public class helper {
    public static int negative(int[] array) {
        int count = 0;
        int n = array.length;
        for(int i  = 0;i < n; i++){
            if(array[i] < 0){
                count++;
            }
        }
        return count;
    }
}
