package com.app05.sum.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FindSumTest {

    @Test
    public void sumTest() {

        FindSum findSum = new FindSum();
        int[] data = {5, 10, 15, 20, 25, 30};
        int res = findSum.sumOfArray(data);
        assertTrue(res == 105);
    }
}
