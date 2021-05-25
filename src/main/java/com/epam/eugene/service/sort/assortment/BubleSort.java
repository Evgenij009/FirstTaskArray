package main.java.com.epam.eugene.service.sort.assortment;


import main.java.com.epam.eugene.entity.BasicArray;
import main.java.com.epam.eugene.exception.BasicArrayException;

public class BubleSort {

    private BubleSort() {
    }

    public static void sortArray(BasicArray basicArray) throws BasicArrayException {
        int sizeArray = basicArray.getSize();
        for (var i = 0; i + 1 < sizeArray; ++i) {
            for (var j = 0; j + 1 < sizeArray - i; ++j) {
                    if (basicArray.getElement(j + 1) < basicArray.getElement(j)) {
                        swapElementArray(basicArray, j, (j + 1));
                    }
            }
        }
    }

    private static void swapElementArray(BasicArray basicArray, int indexFirstElement, int indexSecondElementl)  {
        var temp = 0;
        try {
            temp = basicArray.getElement(indexFirstElement);
            basicArray.setElement(indexFirstElement, basicArray.getElement(indexSecondElementl));
            basicArray.setElement(indexSecondElementl, temp);
        } catch (BasicArrayException e) {
            e.printStackTrace();
        }

    }


}
