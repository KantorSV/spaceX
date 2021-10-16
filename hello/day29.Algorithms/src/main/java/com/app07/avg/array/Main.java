package com.app07.avg.array;

public class Main {

    public static void main(String[] args) {

        int[] data = {1,2,3,4,5,6,7,8,9,10};
        FindAvg findAvg = new FindAvg();
        double res = findAvg.avg(data);
        System.out.println(res );
    }
}
