package com.epam.eugene._main;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;
import com.epam.eugene.service.creator.ArrayCreator;
import com.epam.eugene.service.sort.HelperSortArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger();

    public static void main(final String... args) throws BasicArrayException {
        logger.info("Log4j2ExampleApp started.");
        logger.warn("Something to warn");
        logger.error("Something failed.");
        BasicArray basicArray = new BasicArray(20);
        ArrayCreator.fillRandomized(basicArray, 1, 10);
        System.out.println(basicArray.toString());
        HelperSortArray helperSortArray = new HelperSortArray();
        helperSortArray.bubleSort(basicArray);
        System.out.println(basicArray.toString());
    }
}