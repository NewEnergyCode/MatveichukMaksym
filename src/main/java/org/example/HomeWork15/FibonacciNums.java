package org.example.HomeWork15;

public class FibonacciNums {

    public int fibonacciNum(int n) {

        {
            if (n <= 1)
                return n;
            return fibonacciNum(n - 1) + fibonacciNum(n - 2);
        }
    }
}
