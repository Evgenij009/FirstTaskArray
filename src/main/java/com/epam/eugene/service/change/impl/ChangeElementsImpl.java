package com.epam.eugene.service.change.impl;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;
import com.epam.eugene.service.change.ChangeElements;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChangeElementsImpl implements ChangeElements {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public void changePositiveElementsToZeroValue(BasicArray basicArray) throws BasicArrayException {
        if (basicArray.isEmpty() || basicArray == null) {
            logger.error("changePositiveElementsToZeroValue() Array is empty!");
            throw new BasicArrayException("changePositiveElementsToZeroValue() Array is empty!");
        }
        int[] array = basicArray.getArray();
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > 0) {
                basicArray.setElement(i, 0);
            }
        }
        logger.info("changePositiveElementsToZeroValue() is already.");
    }

    @Override
    public void changeEverySecondElementsToFirstElement(BasicArray basicArray) throws BasicArrayException {
        if (basicArray.isEmpty() || basicArray == null) {
            logger.error("changeEverySecondElementsToFirstElement() Array is empty!");
            throw new BasicArrayException("changeEverySecondElementsToFirstElement() Array is empty!");
        }
        int[] array = basicArray.getArray();
        int swapElement = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (i % 2 != 0) {
                basicArray.setElement(i, swapElement);
            }
        }
        logger.info("changeEverySecondElementsToFirstElement() is already.");
    }
}
