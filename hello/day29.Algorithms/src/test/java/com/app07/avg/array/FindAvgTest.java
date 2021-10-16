package com.app07.avg.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FindAvgTest {
    @Test
    public void avgTest() {

        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        FindAvg findAvg = new FindAvg();
        double res = findAvg.avg(data);
        assertTrue(res == 5.0);
    }
}
