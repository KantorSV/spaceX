package com.app;

public class Main {

    public static void main(String[] args) {
        int[] array = {5,10,7,8,3,9, 1, -2, 8};
        int n = array.length;
        System.out.println("n="+n);
        System.out.println("----------------");
        for(int i=0;i<n;i++){
            System.out.println("array["+i+"]="+array[i]);
        }
        System.out.println("----------------");
        for(int i=n-1;i>=0;i--){
            System.out.println("array["+i+"]="+array[i]);
        }


    }

}
