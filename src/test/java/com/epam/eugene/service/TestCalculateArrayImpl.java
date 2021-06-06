package com.epam.eugene.service;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;
import com.epam.eugene.service.calculate.impl.CalculateArrayImpl;
import com.epam.eugene.service.sort.impl.SortArrayImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;

public class TestCalculateArrayImpl {
    CalculateArrayImpl calculateArray = new CalculateArrayImpl();
    private static BasicArray BASIC_ARRAY_TEST;
    private static final int ACTUAL_MAX_ELEMENT = 43232;
    private static final int ACTUAL_MIN_ELEMENT = -14211;
    private static final double ACTUAL_AVERAGE_ELEMENT = 1112.0588235294117;
    private static final int ACTUAL_SUM_ELEMENTS = 18905;
    private static final int ACTUAL_COUNT_NEGATIVE_ELEMENTS = 9;
    private static final int ACTUAL_COUNT_POSITIVE_ELEMENTS = 7;

    static {
        try {
            BASIC_ARRAY_TEST = new BasicArray(new int[]{2, 33, -24, -23, -12, -2, 1234, -202, 1, 1, -12, -232, 231, 43232, -11111, 0, -14211});
        } catch (BasicArrayException e) {
            e.printStackTrace();
        }
    }

    @Test (groups = "mainGroup")
    public void testFindMaxElement() throws BasicArrayException {
        Assert.assertEquals(ACTUAL_MAX_ELEMENT, calculateArray.findMaxElement(BASIC_ARRAY_TEST));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsNull_FindMaxElement() throws BasicArrayException {
        assertThrows(BasicArrayException.class, () -> calculateArray.findMaxElement(null));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsEmpty_FindMaxElement() {
        BasicArray basicArray = new BasicArray();
        assertThrows(BasicArrayException.class, () -> calculateArray.findMaxElement(basicArray));
    }

    @Test(groups = "mainGroup")
    public void testCalculateAverageElement() throws BasicArrayException {
        Assert.assertEquals(ACTUAL_AVERAGE_ELEMENT, calculateArray.calculateAverageElement(BASIC_ARRAY_TEST));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsNull_AverageElement() throws BasicArrayException {
        assertThrows(BasicArrayException.class, () -> calculateArray.calculateAverageElement(null));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsEmpty_AverageElement() {
        BasicArray basicArray = new BasicArray();
        assertThrows(BasicArrayException.class, () -> calculateArray.calculateAverageElement(basicArray));
    }

    @Test(groups = "mainGroup")
    public void testFindMinElement() throws BasicArrayException {
        Assert.assertEquals(ACTUAL_MIN_ELEMENT, calculateArray.findMinElement(BASIC_ARRAY_TEST));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsNull_FindMinElement() throws BasicArrayException {
        assertThrows(BasicArrayException.class, () -> calculateArray.findMinElement(null));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsEmpty_FindMinElement() {
        BasicArray basicArray = new BasicArray();
        assertThrows(BasicArrayException.class, () -> calculateArray.findMinElement(basicArray));
    }

    @Test(groups = "mainGroup")
    public void testCalculateSumElements() throws BasicArrayException {
        Assert.assertEquals(ACTUAL_SUM_ELEMENTS, calculateArray.calculateSumElements(BASIC_ARRAY_TEST));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsNull_SumElements() throws BasicArrayException {
        assertThrows(BasicArrayException.class, () -> calculateArray.calculateSumElements(null));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsEmpty_SumElements() {
        BasicArray basicArray = new BasicArray();
        assertThrows(BasicArrayException.class, () -> calculateArray.calculateSumElements(basicArray));
    }

    @Test(groups = "mainGroup")
    public void testCalculateCountNegativeElements() throws BasicArrayException {
        Assert.assertEquals(ACTUAL_COUNT_NEGATIVE_ELEMENTS, calculateArray.calculateCountNegativeElements(BASIC_ARRAY_TEST));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsNull_CountNegativeElements() throws BasicArrayException {
        assertThrows(BasicArrayException.class, () -> calculateArray.calculateCountNegativeElements(null));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsEmpty_CountNegativeElements() {
        BasicArray basicArray = new BasicArray();
        assertThrows(BasicArrayException.class, () -> calculateArray.calculateCountNegativeElements(basicArray));
    }

    @Test(groups = "mainGroup")
    public void testCalculateCountPositiveElements() throws BasicArrayException {
        Assert.assertEquals(ACTUAL_COUNT_POSITIVE_ELEMENTS, calculateArray.calculateCountPositiveElements(BASIC_ARRAY_TEST));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsNull_PositiveElements() throws BasicArrayException {
        assertThrows(BasicArrayException.class, () -> calculateArray.calculateCountPositiveElements(null));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsEmpty_PositiveElements() {
        BasicArray basicArray = new BasicArray();
        assertThrows(BasicArrayException.class, () -> calculateArray.calculateCountPositiveElements(basicArray));
    }
}
