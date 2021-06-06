package com.epam.eugene.entity;

import com.epam.eugene.exception.BasicArrayException;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class TestBasicArray {

    @Test(groups = "BasicArrayException")
    public void testBasicArrayInitNull() {
        assertThrows(BasicArrayException.class, () -> new BasicArray(null));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayInputInvalidData_GetElement() throws BasicArrayException {
        BasicArray basicArray = new BasicArray(new int[]{3, 5, -121, 1});
        assertThrows(BasicArrayException.class, () -> basicArray.getElement(10));
    }

    @Test(groups = "mainGroup")
    public void testBasicArrayInputValidData_GetElement() throws BasicArrayException {
        BasicArray basicArray = new BasicArray(new int[]{3, 5, -121, 1});
        assertEquals(3, basicArray.getElement(0));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayInputInvalidData_SetElement() throws BasicArrayException {
        BasicArray basicArray = new BasicArray(new int[]{3, 5, -121, 1});
        assertThrows(BasicArrayException.class, () -> basicArray.setElement(6, 1111));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayIsEmpty_GetArray() throws BasicArrayException {
        BasicArray basicArray = new BasicArray();
        assertThrows(BasicArrayException.class, () -> basicArray.getArray());
    }
}

