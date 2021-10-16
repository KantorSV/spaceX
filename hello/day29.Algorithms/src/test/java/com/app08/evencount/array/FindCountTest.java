package com.app08.evencount.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FindCountTest {

    @Test
    public void evenCountTest(){

        int[] data = {2,4,6,8,10,3,5,7,9};
        FindCount findCount = new FindCount();
        int res = findCount.count(data);
        assertTrue(res == 5);
    }
}
