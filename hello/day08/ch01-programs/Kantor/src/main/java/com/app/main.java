package com.app;

public class main {
    public static void main(String[] args) {
        int[] array = {23, 45, 4, 82, -3, 1, 45, -15, 36, -7, 44};

        helper z = new helper();

        int negative = helper.negative(array);
        System.out.println("count negative = "+ negative);
    }
}
