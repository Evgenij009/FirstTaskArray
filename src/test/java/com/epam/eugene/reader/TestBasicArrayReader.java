package com.epam.eugene.reader;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;

public class TestBasicArrayReader {
    private static final int[] ACTUAL_ARRAY = {2, 33, -24, 121};

    @Test(groups = "mainGroup")
    public void testInputValidFileData_readBasicArrayFromFile() throws BasicArrayException {
        BasicArray basicArray = new BasicArray(ACTUAL_ARRAY);
        Assert.assertEquals(basicArray, BasicArrayReader.readBasicArrayFromFile("src/test/resources/file/test1.txt"));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionIsNull_ReadBasicArrayFromFile() {
        assertThrows(BasicArrayException.class, () -> BasicArrayReader.readBasicArrayFromFile(null));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionInvalidPath_ReadBasicArrayFromFile() {
        assertThrows(BasicArrayException.class, () -> BasicArrayReader.readBasicArrayFromFile("src/file"));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionEmptyPath_ReadBasicArrayFromFile() {
        String path = new String();
        assertThrows(BasicArrayException.class, () -> BasicArrayReader.readBasicArrayFromFile(path));
    }

    @Test(groups = "BasicArrayException")
    public void testBasicArrayExceptionInvalidFileData_readBasicArrayFromFile() {
        assertThrows(BasicArrayException.class, () -> BasicArrayReader.readBasicArrayFromFile("src/test/resources/file/test2.txt"));
    }
}
