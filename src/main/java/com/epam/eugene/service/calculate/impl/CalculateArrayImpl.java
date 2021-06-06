package com.epam.eugene.service.calculate.impl;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;
import com.epam.eugene.service.calculate.CalculateArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

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
        OptionalInt optionalIntResult = IntStream.of(array).max();
        int result = optionalIntResult.getAsInt();
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
        OptionalInt optionalIntResult = IntStream.of(array).min();
        int result = optionalIntResult.getAsInt();
        logger.info("Min element: " + result);
        return result;
    }

    @Override
    public double calculateAverageElement(BasicArray basicArray) throws BasicArrayException {
        if (basicArray == null || basicArray.isEmpty()) {
            logger.error("calculateAverageElement() Array is empty!");
            throw new BasicArrayException(MESSAGE_ERROR_ARRAY_IS_EMPTY_OR_NULL);
        }
        int[] array = basicArray.getArray();
        OptionalDouble optionalIntResult = IntStream.of(array).average();
        double result = optionalIntResult.getAsDouble();
        logger.info("Calculate average of array elements: " + result);
        return result;
    }

    @Override
    public long calculateSumElements(BasicArray basicArray) throws BasicArrayException {
        if (basicArray == null || basicArray.isEmpty()) {
            logger.error("calculateSumElements() Array is empty or NULL!");
            throw new BasicArrayException(MESSAGE_ERROR_ARRAY_IS_EMPTY_OR_NULL);
        }
        int[] array = basicArray.getArray();
        long sum = IntStream.of(array).sum();
        logger.info("Calculate sum of array elements: " + sum);
        return sum;
    }

    @Override
    public int calculateCountPositiveElements(BasicArray basicArray) throws BasicArrayException {
        if (basicArray == null || basicArray.isEmpty()) {
            logger.error("calculateCountPositiveElements() Array is empty or NULL!");
            throw new BasicArrayException(MESSAGE_ERROR_ARRAY_IS_EMPTY_OR_NULL);
        }
        int[] array = basicArray.getArray();
        int count = (int) IntStream.of(array).filter(x -> x > 0).count();
        logger.info("Calculate amount of positive array elements: " + count);
        return count;
    }

    @Override
    public int calculateCountNegativeElements(BasicArray basicArray) throws BasicArrayException {
        if (basicArray == null || basicArray.isEmpty()) {
            logger.error("calculateCountNegativeElements() Array is empty or NULL!");
            throw new BasicArrayException(MESSAGE_ERROR_ARRAY_IS_EMPTY_OR_NULL);
        }
        int[] array = basicArray.getArray();
        int count = (int) IntStream.of(array).filter(x -> x < 0).count();
        logger.info("Calculate amount of negative array elements: " + count);
        return count;
    }


}
