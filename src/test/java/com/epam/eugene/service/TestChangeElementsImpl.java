package com.epam.eugene.service;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.service.change.impl.ChangeElementsImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChangeElementsImpl {
    ChangeElementsImpl changeElements = new ChangeElementsImpl();

    @Test
    public void testChangeEverySecondElementsToFirstElement() throws Exception {
        BasicArray basicArray = new BasicArray(new int[]{2, 33, -24, -23, -12, -2, 1234, -202, 1, 1, -12, -232, 231, 43232, -11111, 0, -14211});
        changeElements.changeEverySecondElementsToFirstElement(basicArray);
        BasicArray validResult = new BasicArray(new int[]{2, 2, -24, 2, -12, 2, 1234, 2, 1, 2, -12, 2, 231, 2, -11111, 2, -14211});
        Assert.assertEquals(validResult, basicArray);
    }

    @Test
    public void testChangePositiveElementsToZeroValue() throws Exception {
        BasicArray basicArray = new BasicArray(new int[]{2, 33, -24, -23, -12, -2, 1234, -202, 1, 1, -12, -232, 231, 43232, -11111, 0, -14211});
        changeElements.changePositiveElementsToZeroValue(basicArray);
        BasicArray validResult = new BasicArray(new int[]{0, 0, -24, -23, -12, -2, 0, -202, 0, 0, -12, -232, 0, 0, -11111, 0, -14211 });
        Assert.assertEquals(validResult, basicArray);
    }
}
