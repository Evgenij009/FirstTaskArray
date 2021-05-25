package main.java.com.epam.eugene.entity;


import main.java.com.epam.eugene.exception.BasicArrayException;

public class BasicArray {
    private int[] array;

    public BasicArray(int[] array) {
        this.array  = array;
    }

    public BasicArray(int sizeArray) throws BasicArrayException {
        if (sizeArray < 1) {
            throw new BasicArrayException();
        }
        this.array = new int[sizeArray];
    }

    public int getSize() {
        return array.length;
    }

    public int getElement(int index) throws BasicArrayException {
        if (index > array.length) {
           throw new BasicArrayException();
        }
        return this.array[index];
    }

    public void setElement(int index, int element) throws BasicArrayException {
        if (index > array.length) {
            throw new BasicArrayException();
        }
        this.array[index] = element;
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
        if (array.length < 1) {
            throw new BasicArrayException("array is empty");
        }
        return this.array.clone();
    }

}