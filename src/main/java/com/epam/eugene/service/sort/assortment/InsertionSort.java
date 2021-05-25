package main.java.com.epam.eugene.service.sort.assortment;


import main.java.com.epam.eugene.entity.BasicArray;
import main.java.com.epam.eugene.exception.BasicArrayException;

public class InsertionSort {

    private InsertionSort() {
    }

    public static void sortArray(BasicArray basicArray) throws BasicArrayException {
        int sizeArray = basicArray.getSize();
        for (var i = 0; i < sizeArray; ++i) {
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
