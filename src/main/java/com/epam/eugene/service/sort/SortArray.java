package com.epam.eugene.service.sort;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;

public interface SortArray {
    void bubleSort(BasicArray basicArray) throws BasicArrayException;
    void insertionSort(BasicArray basicArray) throws BasicArrayException;
    void quickSort(BasicArray basicArray) throws BasicArrayException;
//    void mergeSort(BasicArray basicArray);
//    void heapSort(BasicArray basicArray);
//    void shakerSort(BasicArray basicArray);
////    void combSort(BasicArray basicArray);
    //    void selectionSort(BasicArray basicArray);
}
