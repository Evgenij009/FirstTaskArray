package com.epam.eugene.service;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.service.calculate.impl.CalculateArrayImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculateArrayImpl {
    CalculateArrayImpl calculateArray = new CalculateArrayImpl();
    BasicArray basicArray = new BasicArray(new int[]{2, 33, -24, -23, -12, -2, 1234, -202, 1, 1, -12, -232, 231, 43232, -11111, 0, -14211});

    @Test
    public void testFindMaxElement() throws Exception {
        Assert.assertEquals(43232, calculateArray.findMaxElement(basicArray));
    }

    @Test
    public void testCalculateAverageElement() throws Exception {
        Assert.assertEquals(1112, calculateArray.calculateAverageElement(basicArray));
    }

    @Test
    public void testCalculateSumElements() throws Exception {
        Assert.assertEquals(18905, calculateArray.calculateSumElements(basicArray));
    }

    @Test
    public void testCalculateCountNegativeElements() throws Exception {
        Assert.assertEquals(9, calculateArray.calculateCountNegativeElements(basicArray));
    }

    @Test
    public void testCalculateCountPositiveElements() throws Exception {
        Assert.assertEquals(7, calculateArray.calculateCountPositiveElements(basicArray));
    }
}
