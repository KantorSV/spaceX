package com.app03.min.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FindMinTest {


    @Test
    public void minTest() {

        int[] data = {23, 6, 58, 4, 7, 21};
        FindMin findMin = new FindMin();
        int res = findMin.min(data);
        assertTrue(res == 4);
    }
}
