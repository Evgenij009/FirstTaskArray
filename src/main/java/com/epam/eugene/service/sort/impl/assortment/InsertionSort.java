package com.epam.eugene.service.sort.impl.assortment;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;

public class InsertionSort {

    private InsertionSort() {
    }

    public static void sortArray(BasicArray basicArray) throws BasicArrayException {
        int sizeArray = basicArray.getSize();
        for (int i = 0; i < sizeArray; ++i) {
            int temp = basicArray.getElement(i);
            int j = i;
            while (j > 0 && basicArray.getElement(j - 1) > temp) {
                basicArray.setElement(j, basicArray.getElement(j - 1));
                --j;
            }
            basicArray.setElement(j, temp);
        }
    }

}
