package com.epam.eugene.creator;

import com.epam.eugene.exception.BasicArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class ArrayCreator {

    private static final Logger logger = LogManager.getLogger();
    private static final String MESSAGE_ERROR = "generateSequenceNumbers() Length sequence = %d. Value should be better than 0!";

    private ArrayCreator() {
    }

    public static int[] generateSequenceNumbers(int lengthSequence) throws BasicArrayException {
        if (lengthSequence < 1) {
            logger.error(String.format(MESSAGE_ERROR, lengthSequence));
            throw new BasicArrayException(String.format(MESSAGE_ERROR, lengthSequence));
        }
        int[] array = new Random().ints(lengthSequence).toArray();
        return array;
    }

}
