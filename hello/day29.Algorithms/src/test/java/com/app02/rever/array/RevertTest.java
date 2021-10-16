package com.app02.rever.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class RevertTest {

    private MyRevert myRevert = new MyRevert();

    @Test
    public void oddTest() {

        int[] data = {1, 2, 3, 4, 5};
        myRevert.revert(data);
        assertTrue(data[0] == 5);
        assertTrue(data[1] == 4);
    }

    public  void evenTest(){

        int[] data = {1,2,3,4,5};
        int[] expectedData = {5,4,3,2,1};
        myRevert.revert(data);
        assertTrue(Arrays.equals(data, expectedData));
    }
}
