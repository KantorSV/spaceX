package com.app04.max.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FindMaxTest {

    @Test
    public void maxTest() {

        int[] data = {23, 58, 65, 0, 12, 154, 89, 47};
        FindMax findMax = new FindMax();
        int res = findMax.max(data);
        assertTrue(res == 154);
    }
}
