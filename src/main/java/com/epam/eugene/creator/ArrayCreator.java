package com.epam.eugene.creator;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayCreator {

    private static final Logger logger = LogManager.getLogger();

    public ArrayCreator() {
    }

    public static void fillRandomized(BasicArray basicArray, int minValue, int maxValue) {
        int sizeArray = basicArray.getSize();
        for (int i = 0; i < sizeArray; ++i) {
            int value = (int)((Math.random() * (maxValue - minValue)) + minValue);
            try {
                basicArray.setElement(i, value);
            } catch (BasicArrayException e) {
                logger.error( "fillRandomized() " + e);
            }
        }
    }

}
