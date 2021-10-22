package com.app11.secondmax;

public class Main {

    public static void main(String[] args) {

        SecondMax secondMax = new SecondMax();
        int[] data = {1,5,52,47,3,19,25,22,43,69};
        int res = secondMax.findSecondMax(data);
        System.out.println(res);
        System.out.println("-----------------------------------");
        res = secondMax.findSecondMax2(data);
        System.out.println(res);
        System.out.println("-----------------------------------");
        data = new int[]{5,5,5,5,5,5,5,5,5,5,5,5};
        res = secondMax.findSecondMax(data);
        System.out.println(res);

    }

}
