package com.epam.eugene.service.sort.impl.assortment;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QuickSort {

    private static final Logger logger = LogManager.getLogger();

    private QuickSort() {
    }

    public static void sortArray(BasicArray basicArray) throws BasicArrayException {
        quickSortImpl(basicArray, 0, basicArray.getSize() - 1);
    }

    private static void quickSortImpl(BasicArray basicArray, int leftEl, int rightEl) throws BasicArrayException {
        if (leftEl < rightEl) {
            int q = calcPartition(basicArray, leftEl, rightEl);
            quickSortImpl(basicArray, leftEl, q - 1);
            quickSortImpl(basicArray, q + 1, rightEl);
        }
    }

    private static int calcPartition(BasicArray basicArray, int leftEl, int rightEl) throws BasicArrayException {
        int x = basicArray.getElement(rightEl);
        int less = leftEl;
        for (int i = leftEl; i < rightEl; ++i) {
            if (basicArray.getElement(i) <= x) {
                swapElementArray(basicArray, i, less);
                ++less;
            }
        }
        swapElementArray(basicArray, less, rightEl);
        return less;
    }

    private static void swapElementArray(BasicArray basicArray, int indexFirstElement, int indexSecondElementl)  {
        int temp = 0;
        try {
            temp = basicArray.getElement(indexFirstElement);
            basicArray.setElement(indexFirstElement, basicArray.getElement(indexSecondElementl));
            basicArray.setElement(indexSecondElementl, temp);
        } catch (BasicArrayException e) {
            logger.error("swapElementArray() " + e);
        }
    }
}
