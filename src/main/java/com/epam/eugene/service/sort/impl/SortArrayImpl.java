package com.epam.eugene.service.sort.impl;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;
import com.epam.eugene.service.sort.SortArray;
import com.epam.eugene.service.sort.impl.assortment.BubleSort;
import com.epam.eugene.service.sort.impl.assortment.InsertionSort;
import com.epam.eugene.service.sort.impl.assortment.QuickSort;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortArrayImpl implements SortArray {
    private static final String MESSAGE_ERROR_ARRAY_IS_EMPTY_OR_NULL = "Array is empty or NULL";
    private static final Logger logger = LogManager.getLogger();

    @Override
    public void bubleSort(BasicArray basicArray) throws BasicArrayException {
        if (basicArray == null || basicArray.isEmpty()) {
            logger.error("bubleSort() Array is empty or NULL!");
            throw new BasicArrayException(MESSAGE_ERROR_ARRAY_IS_EMPTY_OR_NULL);
        }
        try {
            BubleSort.sortArray(basicArray);
        } catch (BasicArrayException e) {
            logger.error( "bubleSort() " + e);
        }
    }

    @Override
    public void insertionSort(BasicArray basicArray) throws BasicArrayException {
        if (basicArray == null || basicArray.isEmpty()) {
            logger.error("insertionSort() Array is empty or NULL!");
            throw new BasicArrayException(MESSAGE_ERROR_ARRAY_IS_EMPTY_OR_NULL);
        }
        try {
            InsertionSort.sortArray(basicArray);
        } catch (BasicArrayException e) {
            logger.error( "insertionSort() " + e);
        }
    }

    @Override
    public void quickSort(BasicArray basicArray) throws BasicArrayException {
        if (basicArray == null || basicArray.isEmpty()) {
            logger.error("quickSort() Array is empty or NULL!");
            throw new BasicArrayException(MESSAGE_ERROR_ARRAY_IS_EMPTY_OR_NULL);
        }
        try {
            QuickSort.sortArray(basicArray);
        } catch (BasicArrayException e) {
            logger.error( "quickSort() " + e);
        }
    }
}
