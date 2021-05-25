package main.java.com.epam.eugene.service.creator;

import main.java.com.epam.eugene.entity.BasicArray;
import main.java.com.epam.eugene.exception.BasicArrayException;

public class ArrayCreator {

    private ArrayCreator() {
    }

    public static void fillRandomized(BasicArray basicArray, int minValue, int maxValue) {
        int sizeArray = basicArray.getSize();
        for (var i = 0; i < sizeArray; ++i) {
            int value = (int)((Math.random() * (maxValue - minValue)) + minValue);
            try {
                basicArray.setElement(i, value);
            } catch (BasicArrayException e) {
                //log
            }
        }
    }
// public int[][] createArray(int n, int m, int minValue, int maxValue) {/*code*/
    // public void createFromFile(Matrix matrix, File f) { /* code */ }
    // public void createFromStream(Matrix matrix, Stream stream) { /* code */ }

}