package by.epam.eugene.service.sort.assortment;

import by.epam.eugene.entity.BasicArray;
import by.epam.eugene.exception.BasicArrayException;

public class InsertionSort {

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

    private static void swapElementArray(BasicArray basicArray, int indexFirstElement, int indexSecondElementl)  {
        int temp = 0;
        try {
            temp = basicArray.getElement(indexFirstElement);
            basicArray.setElement(indexFirstElement, basicArray.getElement(indexSecondElementl));
            basicArray.setElement(indexSecondElementl, temp);
        } catch (BasicArrayException e) {
            //log
        }
    }
}
