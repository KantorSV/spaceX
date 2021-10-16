package com.app01.Swap;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MySwapTest {

    private MySwap swap = new MySwap();

    @Test
    public void swap1Test() {

        int[] data = {1, 5, 3, 9, 4, 0, 58};
        swap.swap1(data, 1, 6);
        assertTrue(data[1] == 58);
        assertTrue(data[6] == 5);
    }

    @Test
    public void swap2Test() {

        int[] data = {1, 5, 3, 9, 4, 0, 58};
        swap.swap2(data, 1, 6);
        assertTrue(data[1] == 58);
        assertTrue(data[6] == 5);
    }
}
