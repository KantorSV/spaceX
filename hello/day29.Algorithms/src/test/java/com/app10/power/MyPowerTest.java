package com.app10.power;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MyPowerTest {

    @Test
    public void myTest() {

        MyPower myPower = new MyPower();
        int res = myPower.power(2, 4);
        assertTrue(res == 16);
    }
}
