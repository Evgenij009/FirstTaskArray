package com.epam.eugene._main;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;
import com.epam.eugene.creator.ArrayCreator;
import com.epam.eugene.service.sort.impl.SortArrayImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger();

    public static void main(final String... args) throws BasicArrayException {
        BasicArray basicArray = new BasicArray(20);
        ArrayCreator.fillRandomized(basicArray, 1, 10);
        System.out.println(basicArray.toString());
        SortArrayImpl helperSortArray = new SortArrayImpl();
        helperSortArray.bubleSort(basicArray);
        System.out.println(basicArray.toString());
    }
}