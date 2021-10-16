package com.app04.max.array;

public class Main {

    public static void main(String[] args) {

        int[] data = {23,1,25,236,58,74};
        FindMax findMax = new FindMax();
        int res = findMax.max(data);
        System.out.println(res);

    }
}
