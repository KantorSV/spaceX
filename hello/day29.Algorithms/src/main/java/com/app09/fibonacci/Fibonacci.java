package com.app01.fibonacci;

public class Fibonacci {

    public int[] createNumbers(int n) {

        int[] result = new int[n];
        if (n == 0) {
            return result;
        }
        if (n == 1) {
            result[0] = 0;
            return result;
        }
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < n; i++) {
            result[i] = result[i-1] + result[i-2];
        }
        return result;
    }
}
