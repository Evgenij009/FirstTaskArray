package com.epam.eugene.service.change;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;

public interface ChangeElements {
    void changePositiveElementsToZeroValue(BasicArray basicArray) throws BasicArrayException;
    void changeEverySecondElementsToFirstElement(BasicArray basicArray) throws BasicArrayException;
}
