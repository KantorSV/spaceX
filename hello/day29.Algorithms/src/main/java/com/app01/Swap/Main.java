package com.app01.Swap;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        MySwap mySwap = new MySwap();
        mySwap.swap2(data,5,10);
        System.out.println(Arrays.toString(data));

    }
}
