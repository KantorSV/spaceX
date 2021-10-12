package com.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyCalculatorTest {

    @Test
    public void addTest(){
        MyCalculator mc = new MyCalculatorImpl();
        assertNotNull(mc);
        double res = mc.add(3,4);
        assertTrue(res == 7);

    }

    @Test
    public void subtractTest(){
        MyCalculator mc = new MyCalculatorImpl();
        double res = mc.subtract(3,4);
        assertTrue(res == -1);
    }

    @Test
    public void productTest(){
        MyCalculator mc = new MyCalculatorImpl();
        double res = mc.product(3,4);
        assertTrue(res == 12);
    }

    @Test
    public void divideTest(){
        MyCalculator mc = new MyCalculatorImpl();
        double res = mc.divide(12,6);
        assertTrue(res == 2);
    }

}
