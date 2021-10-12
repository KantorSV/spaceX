package org.app02;

public class Main02 {


    //logn
    public static void main(String[] args) {
        int[] data = {0,1,2,3,4,5,6,7,8,9};
        int target = 1;
        int index = binarySearch(data, 2);
        System.out.println("index="+index);
    }

    public static int binarySearch(int[] data, int target){
        int left = 0;
        int right = data.length-1;
        while(left<=right){
            int middleIndex = (left+right)/2;
            if(data[middleIndex]==target){
                return middleIndex;
            }
            if(target<data[middleIndex]){
                right=middleIndex-1;
            }else{
                left=middleIndex+1;
            }
        }

        return -1;
    }



}
