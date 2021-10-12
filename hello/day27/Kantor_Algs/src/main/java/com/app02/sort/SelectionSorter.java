package com.app02.sort;

public class SelectionSorter implements MySorter {

    @Override
    public void sort(int[] data) {

        for (int i = 0; i < data.length - 1; i++) {
            int min = data[i];
            int minINdex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < min) {
                    min = data[j];
                    minINdex = j;
                }
            }
            if (minINdex != i) {
                int dataI = data[i];
                data[i] = min;
                data[minINdex] = dataI;
            }
        }
    }
}
