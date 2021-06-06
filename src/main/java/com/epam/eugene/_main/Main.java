package com.epam.eugene._main;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;
import com.epam.eugene.reader.BasicArrayReader;
import com.epam.eugene.service.calculate.impl.CalculateArrayImpl;
import com.epam.eugene.service.change.impl.ChangeElementsImpl;
import com.epam.eugene.service.sort.impl.SortArrayImpl;

public class Main {

    public static void main(final String... args) throws BasicArrayException {
        BasicArray basicArray = BasicArrayReader.readBasicArrayFromFile("file/array1.txt");
        System.out.println(basicArray.toString());
//        CalculateArrayImpl calculateArray = new CalculateArrayImpl();
//        System.out.println("Average: " + calculateArray.calculateAverageElement(basicArray));
//        System.out.println("Negative elements: " + calculateArray.calculateCountNegativeElements(basicArray));
//        System.out.println("Sum elements: " + calculateArray.calculateSumElements(basicArray));
//        System.out.println("Max element: " + calculateArray.findMaxElement(basicArray));
//        System.out.println("Positive elements: " + calculateArray.calculateCountPositiveElements(basicArray));
//        System.out.println("Min element: " + calculateArray.findMinElement(basicArray));
        SortArrayImpl sortArray = new SortArrayImpl();
        sortArray.quickSort(basicArray);
        System.out.println(basicArray.toString());
//        ChangeElementsImpl changeElements = new ChangeElementsImpl();
//        changeElements.changeEverySecondElementsToFirstElement(basicArray);
//        System.out.println(basicArray.toString());
//        changeElements.changePositiveElementsToZeroValue(basicArray);
//        System.out.println(basicArray.toString());
    }
}