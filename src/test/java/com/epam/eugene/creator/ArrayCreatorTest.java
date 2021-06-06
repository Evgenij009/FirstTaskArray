package com.epam.eugene.creator;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertThrows;

public class ArrayCreatorTest {

    @Test(groups = "BasicArrayException")
    public void testArrayCreatorIsNull_FillRandomized() {
        assertThrows(BasicArrayException.class, () -> ArrayCreator.generateSequenceNumbers(0));
    }

    @Test(groups = "mainGroup")
    public void testArrayCreatorGenerateSequence_FillRandomized() throws BasicArrayException {
        BasicArray basicArray = new BasicArray(ArrayCreator.generateSequenceNumbers(20));
        boolean expected = basicArray.isEmpty();
        assertFalse(expected);
    }
}
