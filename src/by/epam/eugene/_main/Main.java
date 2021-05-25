package by.epam.eugene._main;


import by.epam.eugene.service.creator.ArrayCreator;
import by.epam.eugene.entity.BasicArray;
import by.epam.eugene.exception.BasicArrayException;
import by.epam.eugene.service.sort.HelperSortArray;

public class Main {

    public static void main(String[] args) throws BasicArrayException {
        BasicArray basicArray = new BasicArray(20);
        ArrayCreator.fillRandomized(basicArray, 1, 10);
        System.out.println(basicArray.toString());
        HelperSortArray helperSortArray = new HelperSortArray();
        helperSortArray.bubleSort(basicArray);
        System.out.println(basicArray.toString());
    }
}