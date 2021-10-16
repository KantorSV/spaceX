package com.app06.product.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FindProductTest {

    @Test
    public void productTest(){

        int[] data = {1,2,3,4,5};
        FindProduct findProduct = new FindProduct();
        int res = findProduct.product(data);
        assertTrue(res == 120);
    }
}
