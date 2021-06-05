package com.epam.eugene.service;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;
import com.epam.eugene.service.change.impl.ChangeElementsImpl;
import com.epam.eugene.service.sort.impl.SortArrayImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;

public class TestChangeElementsImpl {
    private static BasicArray BASIC_ARRAY_TEST;
    private static BasicArray BASIC_ARRAY_EXPECTED_CHANGE_EVERY_SECOND_ELEMENT;
    private static BasicArray BASIC_ARRAY_EXPECTED_CHANGE_POSITIVE_ELEMENT;

    static {
        try {
            BASIC_ARRAY_TEST = new BasicArray(new int[]{2, 33, -24, -23, -12, -2, 1234, -202, 1, 1, -12, -232, 231, 43232, -11111, 0, -14211});
            BASIC_ARRAY_EXPECTED_CHANGE_EVERY_SECOND_ELEMENT = new BasicArray(new int[]{2, 2, -24, 2, -12, 2, 1234, 2, 1, 2, -12, 2, 231, 2, -11111, 2, -14211});
            BASIC_ARRAY_EXPECTED_CHANGE_POSITIVE_ELEMENT = new BasicArray(new int[]{0, 0, -24, -23, -12, -2, 0, -202, 0, 0, -12, -232, 0, 0, -11111, 0, -14211 });
        } catch (BasicArrayException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "mainGroup")
    public void testChangeEverySecondElementsToFirstElement() throws Exception {
        ChangeElementsImpl changeElements = new ChangeElementsImpl();
        BasicArray basicArray = new BasicArray(BASIC_ARRAY_TEST.getArray());
        changeElements.changeEverySecondElementsToFirstElement(basicArray);
        Assert.assertEquals(BASIC_ARRAY_EXPECTED_CHANGE_EVERY_SECOND_ELEMENT, basicArray);
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsNull_ChangeEverySecondElementsToFirstElement() {
        ChangeElementsImpl changeElements = new ChangeElementsImpl();
        assertThrows(BasicArrayException.class, () -> changeElements.changeEverySecondElementsToFirstElement(null));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsEmpty_ChangeEverySecondElementsToFirstElement() {
        ChangeElementsImpl changeElements = new ChangeElementsImpl();
        BasicArray basicArray = new BasicArray();
        assertThrows(BasicArrayException.class, () -> changeElements.changeEverySecondElementsToFirstElement(basicArray));
    }

    @Test(groups = "mainGroup")
    public void testChangePositiveElementsToZeroValue() throws Exception {
        ChangeElementsImpl changeElements = new ChangeElementsImpl();
        BasicArray basicArray = new BasicArray(BASIC_ARRAY_TEST.getArray());
        changeElements.changePositiveElementsToZeroValue(basicArray);
        Assert.assertEquals(BASIC_ARRAY_EXPECTED_CHANGE_POSITIVE_ELEMENT, basicArray);
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsNull_ChangePositiveElementsToZeroValue() {
        ChangeElementsImpl changeElements = new ChangeElementsImpl();
        assertThrows(BasicArrayException.class, () -> changeElements.changePositiveElementsToZeroValue(null));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsEmpty_ChangePositiveElementsToZeroValue() {
        ChangeElementsImpl changeElements = new ChangeElementsImpl();
        BasicArray basicArray = new BasicArray();
        assertThrows(BasicArrayException.class, () -> changeElements.changePositiveElementsToZeroValue(basicArray));
    }
}
