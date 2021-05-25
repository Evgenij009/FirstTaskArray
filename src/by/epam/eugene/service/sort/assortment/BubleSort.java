package by.epam.eugene.service.sort.assortment;

import by.epam.eugene.entity.BasicArray;
import by.epam.eugene.exception.BasicArrayException;

public class BubleSort {

    public static void sortArray(BasicArray basicArray) throws BasicArrayException {
        int sizeArray = basicArray.getSize();
        for (int i = 0; i + 1 < sizeArray; ++i) {
            for (int j = 0; j + 1 < sizeArray - i; ++j) {
                    if (basicArray.getElement(j + 1) < basicArray.getElement(j)) {
                        swapElementArray(basicArray, j, (j + 1));
                    }
            }
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
