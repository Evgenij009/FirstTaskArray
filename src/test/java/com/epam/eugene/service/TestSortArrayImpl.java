package com.epam.eugene.service;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;
import com.epam.eugene.service.sort.impl.SortArrayImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;

public class TestSortArrayImpl {
    private static BasicArray BASIC_ARRAY_TEST;
    private static BasicArray BASIC_ARRAY_EXPECTED;

    static {
        try {
            BASIC_ARRAY_TEST = new BasicArray(new int[]{2, 33, -24, -23, -12, -2, 1234, -202, 1, 1, -12, -232, 231, 43232, -11111, 0, -14211});
            BASIC_ARRAY_EXPECTED = new BasicArray(new int[]{-14211, -11111, -232, -202, -24, -23, -12, -12, -2, 0, 1, 1, 2, 33, 231, 1234, 43232 });
        } catch (BasicArrayException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "mainGroup")
    public void testBubleSort() throws BasicArrayException {
        SortArrayImpl sortArray = new SortArrayImpl();
        BasicArray basicArray = new BasicArray(BASIC_ARRAY_TEST.getArray());
        sortArray.bubleSort(basicArray);
        Assert.assertEquals(BASIC_ARRAY_EXPECTED, basicArray);
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsNull_BubbleSort() {
        SortArrayImpl sortArray = new SortArrayImpl();
        assertThrows(BasicArrayException.class, () -> sortArray.bubleSort(null));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsEmpty_BubbleSort() {
        SortArrayImpl sortArray = new SortArrayImpl();
        BasicArray basicArray = new BasicArray();
        assertThrows(BasicArrayException.class, () -> sortArray.bubleSort(basicArray));
    }

    @Test(groups = "mainGroup")
    public void testInsertionSort() throws BasicArrayException {
        SortArrayImpl sortArray = new SortArrayImpl();
        BasicArray basicArray = new BasicArray(BASIC_ARRAY_TEST.getArray());
        sortArray.insertionSort(basicArray);
        Assert.assertEquals(BASIC_ARRAY_EXPECTED, basicArray);
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsNull_InsertionSort() {
        SortArrayImpl sortArray = new SortArrayImpl();
        assertThrows(BasicArrayException.class, () -> sortArray.insertionSort(null));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsEmpty_InsertionSort() {
        SortArrayImpl sortArray = new SortArrayImpl();
        BasicArray basicArray = new BasicArray();
        assertThrows(BasicArrayException.class, () -> sortArray.insertionSort(basicArray));
    }

    @Test(groups = "mainGroup")
    public void testQuickSort() throws BasicArrayException {
        SortArrayImpl sortArray = new SortArrayImpl();
        BasicArray basicArray = new BasicArray(BASIC_ARRAY_TEST.getArray());
        sortArray.quickSort(basicArray);
        Assert.assertEquals(BASIC_ARRAY_EXPECTED, basicArray);
    }
    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsNull_QuickSort() {
        SortArrayImpl sortArray = new SortArrayImpl();
        assertThrows(BasicArrayException.class, () -> sortArray.quickSort(null));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsEmpty_QuickSort() {
        SortArrayImpl sortArray = new SortArrayImpl();
        BasicArray basicArray = new BasicArray();
        assertThrows(BasicArrayException.class, () -> sortArray.quickSort(basicArray));
    }
}
