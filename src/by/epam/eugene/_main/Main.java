package by.epam.eugene._main;

import by.epam.eugene.creator.ArrayCreator;
import by.epam.eugene.entity.BasicArray;
import by.epam.eugene.exception.BasicArrayException;

public class Main {

    public static void main(String[] args) {
        try {
            ArrayCreator arrayCreator = new ArrayCreator();
            BasicArray basicArray = new BasicArray(10);

        } catch (BasicArrayException e) {
            System.out.println("Error of creating array " + e);
        }
    }
}