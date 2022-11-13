package org.example.HomeWork15;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum.twoSum(nums, 9)));

        FibonacciNums fibonacciNums = new FibonacciNums();
        System.out.println(fibonacciNums.fibonacciNum(8));

        PascalTriangle pascalTriangle = new PascalTriangle();
        System.out.println(pascalTriangle.pascalTriangle(3));
    }
}