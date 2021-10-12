package org.app01;

public class Main01 {

    public static void main(String[] args) {
        int[] data = {3,8,2,0,8,9,1,7,6};
        int target = 6;
        int index = findIndex(data, target);
        System.out.println("index="+index);
    }


// O(n) n - data.lenght
    private static int findIndex(int[] data, int target){
        for(int i=0;i<data.length;i++){
            if(data[i]==target){
                return i;
            }
        }
        return -1;
    }

}
