package com.app07.avg.array;

import com.app05.sum.array.FindSum;

public class FindAvg {

    public double avg(int[] data){

        FindSum findSum = new FindSum();
        int sum = findSum.sumOfArray(data);
        double avg = sum / data.length;
        return avg;
    }
}
