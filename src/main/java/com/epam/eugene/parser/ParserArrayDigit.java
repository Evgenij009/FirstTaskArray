package com.epam.eugene.parser;

import com.epam.eugene.exception.BasicArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ParserArrayDigit {

    private static final Logger logger = LogManager.getLogger();
    private static final String REGEX_GAPS = "[\\s]+";

    private ParserArrayDigit() {
    }

    public static int[] parseDigits(String line) throws BasicArrayException {
        if (line == null || line.isEmpty()) {
            logger.error("parseDigits() Array is empty or NULL!");
            throw new BasicArrayException("Array is empty or NULL");
        }
        String[] arrayDigitsLine = line.trim().split(REGEX_GAPS);
        int[] arrayDigits = new int[arrayDigitsLine.length];
        for (int i = 0; i < arrayDigits.length; ++i) {
            arrayDigits[i] = Integer.parseInt(arrayDigitsLine[i]);
        }
        return arrayDigits;
    }

}