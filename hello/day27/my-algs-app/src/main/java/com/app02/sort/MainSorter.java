package com.app02.sort;

import java.util.Arrays;

public class MainSorter {

    public static void main(String[] args) {
        int [] data = {2,8,1,0,9,4,5,3,7,6};
        MySorter mySorter = getSorter(1);
        mySorter.sort(data);
        System.out.println("data = " + data);
        //Arrays.sort(data);
        System.out.println("data = " + Arrays.toString(data));

    }


    public static MySorter getSorter(int type){
        switch (type){
            case 0:
                return new BubbleSorter();
            case 1:
                return new SelectionSorter();
            default: throw new RuntimeException("Incorrect type="+type);
        }
    }

}
