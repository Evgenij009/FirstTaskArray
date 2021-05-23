package by.epam.eugene.entity;

import by.epam.eugene.exception.BasicArrayException;

public class BasicArray {
    private int[] array;

    public BasicArray() {

    }
    public BasicArray(int[] array) {
        this.array  = array;
    }
    public BasicArray(int size) throws BasicArrayException {
        if (size < 1) {
            throw new BasicArrayException();
        }
        this.array = new int[size];
    }
    public int getSize() {
        return array.length;
    }
    public int getElement(int index) throws BasicArrayException {
        if (index < array.length) {
            return array[index];
        } else {
            throw new BasicArrayException();
        }
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("\nArray: " + array.length + " elements\n");
        for (int value : this.array) {
            stringBuilder.append(value).append(" ");
        }
        return stringBuilder.toString();
    }
    public int[] getArray() throws BasicArrayException {
        if (array.length < 0) {
            throw new BasicArrayException("array is empty");
        }
        return this.array.clone();
    }

}
