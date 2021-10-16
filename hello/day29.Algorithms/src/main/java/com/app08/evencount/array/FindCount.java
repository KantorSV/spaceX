package com.app08.evencount.array;

public class FindCount {

    public int count(int[] data) {

        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
