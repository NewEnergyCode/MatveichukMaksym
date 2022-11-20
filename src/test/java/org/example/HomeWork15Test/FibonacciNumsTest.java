package org.example.HomeWork15Test;

import org.example.HomeWork15.FibonacciNums;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciNumsTest {
    @Test
    public void fibonacciNum (){

        FibonacciNums fibonacciNums = new FibonacciNums();
        int n=8, fib = 21;
        Assert.assertEquals(fib, fibonacciNums.fibonacciNum(n));

    }
}
