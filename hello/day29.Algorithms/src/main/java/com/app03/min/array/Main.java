package com.app03.min.array;

public class Main {

    public static void main(String[] args) {

        FindMin findMin = new FindMin();
        int[] data = {26,34,2,3,4,5,6,7,89,};
        int min = findMin.min(data);
        System.out.println(min);
    }
}
