package com.app11.secondmax;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SecondMaxTest {

    private SecondMax secondMax = new SecondMax();

    @Test
    public void findSecondMaxTest() {

        int[] data = {1, 5, 3, 4, 9, 0, 14};
        int res = secondMax.findSecondMax(data);
        assertTrue(res == 9);
        res = secondMax.findSecondMax2(data);
        assertTrue(res == 9);
    }

    @Test(expected = RuntimeException.class)
    public void sameDataTest() {
        int[] data = {5, 5, 5, 5, 5, 5, 5, 5, 5};
        secondMax.findSecondMax(data);
    }

    @Test(expected = RuntimeException.class)
    public void sameDataTest2() {
        int[] data = {5, 5, 5, 5, 5, 5, 5, 5, 5};
        secondMax.findSecondMax2(data);

    }
}
