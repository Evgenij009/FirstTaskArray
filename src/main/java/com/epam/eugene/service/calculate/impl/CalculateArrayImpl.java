package com.epam.eugene.service.calculate.impl;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;
import com.epam.eugene.service.calculate.CalculateArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculateArrayImpl implements CalculateArray {

    private static final Logger logger = LogManager.getLogger();
    private static final String MESSAGE_ERROR_ARRAY_IS_EMPTY_OR_NULL = "Array is empty or NULL";

    @Override
    public int findMaxElement(BasicArray basicArray) throws BasicArrayException {
        if (basicArray == null || basicArray.isEmpty()) {
            logger.error("findMaxlement() Array is empty!");
            throw new BasicArrayException("findMaxElement() Array is empty!");
        }
        int[] array = basicArray.getArray();
        int result = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (result < array[i]) {
                result = array[i];
            }
        }
        logger.info("Max element: " + result);
        return result;
    }

    @Override
    public int findMinElement(BasicArray basicArray) throws BasicArrayException {
        if (basicArray == null || basicArray.isEmpty()) {
            logger.error("findMinElement() Array is empty!");
            throw new BasicArrayException("findMinElement() Array is empty!");
        }
        int[] array = basicArray.getArray();
        int result = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (result > array[i]) {
                result = array[i];
            }
        }
        logger.info("Min element: " + result);
        return result;
    }

    @Override
    public double calculateAverageElement(BasicArray basicArray) throws BasicArrayException {
        if (basicArray == null || basicArray.isEmpty()) {
            logger.error("calculateAverageElement() Array is empty!");
            throw new BasicArrayException(MESSAGE_ERROR_ARRAY_IS_EMPTY_OR_NULL);
        }
        double average = (double) (calculateSumElements(basicArray) / basicArray.getSize());
        logger.info("Calculate average of array elements: " + average);
        return average;
    }

    @Override
    public long calculateSumElements(BasicArray basicArray) throws BasicArrayException {
        if (basicArray == null || basicArray.isEmpty()) {
            logger.error("calculateSumElements() Array is empty or NULL!");
            throw new BasicArrayException(MESSAGE_ERROR_ARRAY_IS_EMPTY_OR_NULL);
        }
        long sum = 0L;
        int[] array = basicArray.getArray();
        for (int element : array) {
            sum += element;
        }
        logger.info("Calculate sum of array elements: " + sum);
        return sum;
    }

    @Override
    public int calculateCountPositiveElements(BasicArray basicArray) throws BasicArrayException {
        if (basicArray == null || basicArray.isEmpty()) {
            logger.error("calculateCountPositiveElements() Array is empty or NULL!");
            throw new BasicArrayException(MESSAGE_ERROR_ARRAY_IS_EMPTY_OR_NULL);
        }
        int count = 0;
        int[] array = basicArray.getArray();
        for (int element : array) {
            if (element > 0) {
                ++count;
            }
        }
        logger.info("Calculate amount of positive array elements: " + count);
        return count;
    }

    @Override
    public int calculateCountNegativeElements(BasicArray basicArray) throws BasicArrayException {
        if (basicArray == null || basicArray.isEmpty()) {
            logger.error("calculateCountNegativeElements() Array is empty or NULL!");
            throw new BasicArrayException(MESSAGE_ERROR_ARRAY_IS_EMPTY_OR_NULL);
        }
        int count = 0;
        int[] array = basicArray.getArray();
        for (int element : array) {
            if (element < 0) {
                ++count;
            }
        }
        logger.info("Calculate amount of negative array elements: " + count);
        return count;
    }


}
