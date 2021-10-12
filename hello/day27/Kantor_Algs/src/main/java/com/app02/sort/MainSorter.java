package com.app02.sort;

import java.util.Arrays;

public class MainSorter {

    public static void main(String[] args) {

        int[] data = {5,3,0,9,4,6,2,8,7,1};
        MySorter mySorter = getSorter(0);
        mySorter.sort(data);
        //System.out.println(data);
        System.out.println(Arrays.toString(data));

    }

    public static MySorter getSorter(int type){

        switch (type){
            case 0:
                System.out.println("Bubble Sorter");
                return new BubbleSorter();
            case 1:
                System.out.println("Selection Sorter");
                return new SelectionSorter();
            default:
                throw new RuntimeException("incorrect type" + type);
        }
    }
}
