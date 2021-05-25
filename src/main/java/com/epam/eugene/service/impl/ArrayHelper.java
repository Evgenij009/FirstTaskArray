package com.epam.eugene.service.impl;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;

public interface ArrayHelper {
    int findMaxElement(BasicArray basicArray) throws BasicArrayException;
    int findMinElement(BasicArray basicArray) throws BasicArrayException;
    int findAverageElement(BasicArray basicArray) throws BasicArrayException;
    int findSumElements(BasicArray basicArray) throws  BasicArrayException;
    int findCountPositiveElements(BasicArray basicArray) throws BasicArrayException;
    int findCountNegativeElements(BasicArray basicArray) throws BasicArrayException;

}
