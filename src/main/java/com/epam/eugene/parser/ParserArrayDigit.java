package com.epam.eugene.parser;

public class ParserArrayDigit {

    private ParserArrayDigit() {
    }

    public static int[] parseDigits(String line) {
        String[] arrayDigitsLine = line.split(" ");
        int[] arrayDigits = new int[arrayDigitsLine.length];
        for (int i = 0; i < arrayDigits.length; ++i) {
            arrayDigits[i] = Integer.parseInt(arrayDigitsLine[i]);
        }
        return arrayDigits;
    }
}