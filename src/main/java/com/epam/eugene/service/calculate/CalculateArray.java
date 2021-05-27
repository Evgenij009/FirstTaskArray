package com.epam.eugene.service.calculate;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;

public interface CalculateArray {
    int findMaxElement(BasicArray basicArray) throws BasicArrayException;
    int findMinElement(BasicArray basicArray) throws BasicArrayException;
    double calculateAverageElement(BasicArray basicArray) throws BasicArrayException;
    long calculateSumElements(BasicArray basicArray) throws  BasicArrayException;
    int calculateCountPositiveElements(BasicArray basicArray) throws BasicArrayException;
    int calculateCountNegativeElements(BasicArray basicArray) throws BasicArrayException;

}
