package com.epam.eugene;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.service.sort.impl.SortArrayImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSortArrayImpl {
    SortArrayImpl sortArray = new SortArrayImpl();

    @Test
    public void testBubleSort() throws Exception {
        BasicArray basicArray = new BasicArray(new int[]{2, 33, -24, -23, -12, -2, 1234, -202, 1, 1, -12, -232, 231, 43232, -11111, 0, -14211});
        sortArray.bubleSort(basicArray);
        BasicArray validResult = new BasicArray(new int[]{-14211, -11111, -232, -202, -24, -23, -12, -12, -2, 0, 1, 1, 2, 33, 231, 1234, 43232 });
        Assert.assertEquals(validResult, basicArray);
    }

    @Test
    public void testInsertionSort() throws Exception {
        BasicArray basicArray = new BasicArray(new int[]{2, 33, -24, -23, -12, -2, 1234, -202, 1, 1, -12, -232, 231, 43232, -11111, 0, -14211});
        sortArray.insertionSort(basicArray);
        BasicArray validResult = new BasicArray(new int[]{-14211, -11111, -232, -202, -24, -23, -12, -12, -2, 0, 1, 1, 2, 33, 231, 1234, 43232 });
        Assert.assertEquals(validResult, basicArray);
    }
}
