package org.example.HomeWork15Test;

import org.example.HomeWork15.PascalTriangle;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleTest {

    @Test
    public void pascalTriangleTest() {

        PascalTriangle pascalTriangle = new PascalTriangle();
        Integer rowIndex = 3;
        List<Integer> ret = new ArrayList<>();
        ret.add(1);
        ret.add(3);
        ret.add(3);
        ret.add(1);

        Assert.assertEquals(ret, pascalTriangle.pascalTriangle(rowIndex));

    }
}
