package com.app01.fibonacci;

import static org.junit.Assert.assertTrue;

public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();


    public void testEmpty() {
        int[] res = fibonacci.createNumbers(0);
        assertTrue(res.length==0);

    }
}
