package com.epam.eugene.validation;

import com.epam.eugene.validator.BasicArrayValidator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class TestBasicArrayValidator {

    @Test (groups = "mainGroup")
    public void testInputNullLine_isValidateDigitLine() {
        String line = null;
        boolean result = BasicArrayValidator.isValidateDigitLine(line);
        assertFalse(result);
    }

    @Test (groups = "mainGroup")
    public void testInputEmpryLine_isValidateDigitLine() {
        String line = "";
        boolean result = BasicArrayValidator.isValidateDigitLine(line);
        assertFalse(result);
    }

    @Test (groups = "mainGroup")
    public void testInputInvalidLine_isValidateDigitLine() {
        String line = "  12 123  444-1  AD 13 ";
        boolean result = BasicArrayValidator.isValidateDigitLine(line);
        assertFalse(result);
    }

    @Test (groups = "mainGroup")
    public void testInputValidLine_isValidateDigitLine() {
        String line = "  2123 332   -323 111   ";
        boolean result = BasicArrayValidator.isValidateDigitLine(line);
        assertTrue(result);
    }
}
