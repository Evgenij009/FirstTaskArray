package main.java.com.epam.eugene.service.sort;

import main.java.com.epam.eugene.entity.BasicArray;
import main.java.com.epam.eugene.exception.BasicArrayException;
import main.java.com.epam.eugene.service.impl.SortArray;
import main.java.com.epam.eugene.service.sort.assortment.BubleSort;
import main.java.com.epam.eugene.service.sort.assortment.InsertionSort;

public class HelperSortArray implements SortArray {


    @Override
    public void bubleSort(BasicArray basicArray) {
        try {
            BubleSort.sortArray(basicArray);
        } catch (BasicArrayException e) {
            //log
        }
    }

    @Override
    public void insertionSort(BasicArray basicArray) {
        try {
            InsertionSort.sortArray(basicArray);
        } catch (BasicArrayException e) {
            //log
        }
    }
}
