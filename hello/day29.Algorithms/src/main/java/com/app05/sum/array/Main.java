package com.app05.sum.array;

public class Main {

    public static void main(String[] args) {

        int[] data = {5,10,15,20,25,30};
        FindSum findSum = new FindSum();
        int res = findSum.sumOfArray(data);
        System.out.println(res);

    }
}
