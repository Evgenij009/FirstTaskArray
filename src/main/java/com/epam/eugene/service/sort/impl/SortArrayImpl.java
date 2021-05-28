package com.epam.eugene.service.sort.impl;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;
import com.epam.eugene.service.sort.SortArray;
import com.epam.eugene.service.sort.impl.assortment.BubleSort;
import com.epam.eugene.service.sort.impl.assortment.InsertionSort;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortArrayImpl implements SortArray {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public void bubleSort(BasicArray basicArray) {
        try {
            BubleSort.sortArray(basicArray);
        } catch (BasicArrayException e) {
            logger.error( "bubleSort() " + e);
        }
    }

    @Override
    public void insertionSort(BasicArray basicArray) {
        try {
            InsertionSort.sortArray(basicArray);
        } catch (BasicArrayException e) {
            logger.error( "insertionSort() " + e);
        }
    }
}
