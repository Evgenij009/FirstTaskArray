package main.java.com.epam.eugene._main;

import main.java.com.epam.eugene.entity.BasicArray;
import main.java.com.epam.eugene.exception.BasicArrayException;
import main.java.com.epam.eugene.service.creator.ArrayCreator;
import main.java.com.epam.eugene.service.sort.HelperSortArray;

public class Main {

    public static void main(final String... args) throws BasicArrayException {
        BasicArray basicArray = new BasicArray(20);
        ArrayCreator.fillRandomized(basicArray, 1, 10);
        System.out.println(basicArray.toString());
        HelperSortArray helperSortArray = new HelperSortArray();
        helperSortArray.bubleSort(basicArray);
        System.out.println(basicArray.toString());
    }
}