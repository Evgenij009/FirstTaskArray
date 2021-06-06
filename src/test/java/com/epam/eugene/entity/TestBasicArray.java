package com.epam.eugene.entity;

import com.epam.eugene.exception.BasicArrayException;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;

public class TestBasicArray {

    @Test(groups = "BasicArrayException")
    public void testBasicArray() {
        assertThrows(BasicArrayException.class, () -> new BasicArray(null));
    }
}
