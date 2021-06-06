package com.epam.eugene.parser;

import com.epam.eugene.exception.BasicArrayException;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;

public class TestParserArrayDigit {

    private static final int[] ACTUAL_ARRAY = {321, 12, -12, 12, 1};

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsNull_ParseDigits() {
        assertThrows(BasicArrayException.class, () -> ParserArrayDigit.parseDigits(null));

    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsEmpty_ParseDigits() {
        String line = new String();
        assertThrows(BasicArrayException.class, () -> ParserArrayDigit.parseDigits(line));
    }

    @Test(groups = "mainGroup")
    public void testInputValidLine_ParseDigits() throws BasicArrayException {
        String line = new String("   321    12   -12 12 1  ");
        int[] expected = ParserArrayDigit.parseDigits(line);
        Assert.assertEquals(ACTUAL_ARRAY, expected);
    }
}
