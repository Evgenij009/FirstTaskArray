package com.epam.eugene.service.calculate.impl;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;
import com.epam.eugene.service.calculate.CalculateArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculateArrayImpl implements CalculateArray {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int findMaxElement(BasicArray basicArray) throws BasicArrayException {
        if (basicArray.isEmpty() || basicArray == null) {
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
        if (basicArray.isEmpty() || basicArray == null) {
            logger.error("findMinElement() Array is empty!");
            throw new BasicArrayException("findMinElement() Array is empty!");
        }
        int[] array = basicArray.getArray();
        int result = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (result < array[i]) {
                result = array[i];
            }
        }
        logger.info("Min element: " + result);
        return result;
    }

    @Override
    public double calculateAverageElement(BasicArray basicArray) throws BasicArrayException {
        if (basicArray.isEmpty() || basicArray == null) {
            logger.error("calculateAverageElement() Array is empty!");
            throw new BasicArrayException("Array is empty");
        }
        double average = (double) (calculateSumElements(basicArray) / basicArray.getSize());
        logger.info("Calculate average of array elements: " + average);
        return 0;
    }

    @Override
    public long calculateSumElements(BasicArray basicArray) throws BasicArrayException {
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
