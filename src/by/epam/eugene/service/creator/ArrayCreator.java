package by.epam.eugene.service.creator;

import by.epam.eugene.entity.BasicArray;
import by.epam.eugene.exception.BasicArrayException;

public class ArrayCreator {

    public static void fillRandomized(BasicArray basicArray, int minValue, int maxValue) {
        int sizeArray = basicArray.getSize();
        for (int i = 0; i < sizeArray; ++i) {
            try {
                int value = (int)((Math.random() * (maxValue - minValue)) + minValue);
                basicArray.setElement(i, value);
            } catch (BasicArrayException e) {
                //log: exception impossible
            }
        }
    }
// public int[][] createArray(int n, int m, int minValue, int maxValue) {/*code*/
    // public void createFromFile(Matrix matrix, File f) { /* code */ }
    // public void createFromStream(Matrix matrix, Stream stream) { /* code */ }

}
