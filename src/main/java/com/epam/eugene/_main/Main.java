package com.epam.eugene._main;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;
import com.epam.eugene.reader.BasicArrayReader;
import com.epam.eugene.service.calculate.impl.CalculateArrayImpl;
import com.epam.eugene.service.change.impl.ChangeElementsImpl;
import com.epam.eugene.service.sort.impl.SortArrayImpl;

public class Main {

    public static void main(final String... args) throws BasicArrayException {
        //BasicArray basicArray = BasicArrayReader.readBasicArrayFromFile("file/array1.txt");
        BasicArray basicArray = new BasicArray(new int[]{2, 33, -24, -23, -12, -2, 1234, -202, 1, 1, -12, -232, 231, 43232, -11111, 0, -14211});
        System.out.println(basicArray.toString());
        CalculateArrayImpl calculateArray = new CalculateArrayImpl();
        System.out.println("Average: " + calculateArray.calculateAverageElement(basicArray));
        System.out.println("Negative elements: " + calculateArray.calculateCountNegativeElements(basicArray));
        System.out.println("Sum elements: " + calculateArray.calculateSumElements(basicArray));
        System.out.println("Max element: " + calculateArray.findMaxElement(basicArray));
        System.out.println("Positive elements: " + calculateArray.calculateCountPositiveElements(basicArray));
        System.out.println("Min element: " + calculateArray.findMinElement(basicArray));
        SortArrayImpl sortArray = new SortArrayImpl();
        sortArray.bubleSort(basicArray);
        System.out.println(basicArray.toString());
        ChangeElementsImpl changeElements = new ChangeElementsImpl();
        changeElements.changeEverySecondElementsToFirstElement(basicArray);
        System.out.println(basicArray.toString());
        changeElements.changePositiveElementsToZeroValue(basicArray);
        System.out.println(basicArray.toString());

    }
}