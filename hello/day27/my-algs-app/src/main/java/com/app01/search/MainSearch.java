package com.app01.search;

public class MainSearch {

    public static void main(String[] args) {
        //int[] data = {2,5,8,1,9,0,4,5,7};
        int[] data = {0,1,2,3,4,5,6,7,8,9};
        int target = 7;
        MySearcher mySearcher = getSearcher(1);
        int index = mySearcher.search(data, target);
        System.out.println("index="+index);
    }


    public static MySearcher getSearcher(int type){
        switch (type){
            case 0:
                return new LinearSearcher();
            case 1:
                return new BinarySearcher();
            default:
                throw new RuntimeException("Incorrect type="+type);
        }
    }

}
