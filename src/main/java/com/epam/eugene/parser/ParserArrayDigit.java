package com.epam.eugene.parser;

import java.io.BufferedReader;

public class ParserArrayDigit {

    private static final String REGEX_GAPS = "[\\s]+";

    private ParserArrayDigit() {
    }

    public static int[] parseDigits(String line) {
        String[] arrayDigitsLine = line.split(REGEX_GAPS);
        int[] arrayDigits = new int[arrayDigitsLine.length];
        for (int i = 0; i < arrayDigits.length; ++i) {
            arrayDigits[i] = Integer.parseInt(arrayDigitsLine[i]);
        }
        return arrayDigits;
    }

}