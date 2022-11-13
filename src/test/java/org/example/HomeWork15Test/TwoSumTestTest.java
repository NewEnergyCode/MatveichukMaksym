package org.example.HomeWork15Test;

import org.example.HomeWork15.TwoSum;
import org.junit.Assert;
import org.junit.Test;

public class TwoSumTestTest {

    @Test
    public void twoSum() {

        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{2, 7, 11, 15, 16};
        int[] mum = new int[]{0, 1};
        Assert.assertArrayEquals(mum, twoSum.twoSum(nums, 9));

    }

}
