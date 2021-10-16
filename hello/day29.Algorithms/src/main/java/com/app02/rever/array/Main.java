package com.app02.rever.array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        MyRevert myRevert = new MyRevert();
        int[] data = {1,2,3,4,5};
        myRevert.revert(data);
        System.out.println(Arrays.toString(data));
    }
}
