package com.app11.secondmax;

import java.util.Arrays;

public class SecondMax {

    public int findSecondMax(int[] data) {

        int maxFirst = Math.max(data[0], data[1]);
        int maxSecond = Math.max(data[1], data[1]);

        for (int i = 2; i < data.length; i++) {
            if (data[i] > maxFirst) {
                maxSecond = maxFirst;
                maxFirst = data[i];
            } else if (data[i] > maxSecond) {
                maxSecond = data[i];
            }
        }
        if (maxFirst == maxSecond) {
            makeException();
        }
        return maxSecond;
    }

    public int findSecondMax2(int[] data) {

        Arrays.sort(data);
        int n = data.length;
        if (data[n - 1] == data[n - 2]) {
            makeException();
        }
        return data[n - 2];
    }

    private void makeException() {
        throw new RuntimeException("maxFirst == maxSecond");
    }
}
