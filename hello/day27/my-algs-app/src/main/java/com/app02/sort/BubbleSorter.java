package com.app02.sort;

public class BubbleSorter implements MySorter {

    //O(n2)
    @Override
    public void sort(int[] data) {
        for(int i=0;i<data.length-1;i++){

            for(int j=i+1;j<data.length;j++){
                if(data[i]>data[j]){
                    int currentI = data[i];
                    data[i] = data[j];
                    data[j] = currentI;
                }
            }
        }
    }
}
