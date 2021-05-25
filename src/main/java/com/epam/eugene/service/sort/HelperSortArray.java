package com.epam.eugene.service.sort;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;
import com.epam.eugene.service.impl.SortArray;
import com.epam.eugene.service.sort.assortment.BubleSort;
import com.epam.eugene.service.sort.assortment.InsertionSort;

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
