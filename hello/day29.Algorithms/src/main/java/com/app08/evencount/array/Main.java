package com.app08.evencount.array;

public class Main {

    public static void main(String[] args) {

        int[] data = {1,2,3,4,5,6,7,8,9,10,12};
        FindCount findCount = new FindCount();
        int res = findCount.count(data);
        System.out.println(res);
    }
}
