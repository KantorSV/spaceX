package com.app01.search;

public class BinarySearcher implements MySearcher{
    @Override
    public int search(int[] data, int target) {
        int left = 0;
        int right = data.length-1;
        while(left<=right){
            int middle = (left+right)/2;
            if(data[middle]==target){
                return middle;
            }
            if(target<data[middle]){
                right = middle-1;
            }else{
                left = middle+1;
            }
        }
        return -1;
    }
}
