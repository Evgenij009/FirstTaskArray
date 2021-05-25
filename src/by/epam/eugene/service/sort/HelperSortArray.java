package by.epam.eugene.service.sort;

import by.epam.eugene.entity.BasicArray;
import by.epam.eugene.exception.BasicArrayException;
import by.epam.eugene.service.impl.SortArray;
import by.epam.eugene.service.sort.assortment.BubleSort;
import by.epam.eugene.service.sort.assortment.InsertionSort;

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
