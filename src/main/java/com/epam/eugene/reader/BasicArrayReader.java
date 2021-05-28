package com.epam.eugene.reader;

import com.epam.eugene.entity.BasicArray;
import com.epam.eugene.exception.BasicArrayException;
import com.epam.eugene.parser.ParserArrayDigit;
import com.epam.eugene.validator.BasicArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BasicArrayReader {

    private static final Logger logger = LogManager.getLogger();

    private BasicArrayReader() {
    }

    public static BasicArray readBasicArrayFromFile(String path) throws BasicArrayException {

        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (BasicArrayValidator.isValidateDigitLine(line)) {
                    int[] digits = ParserArrayDigit.parseDigits(line);
                    BasicArray basicArray = new BasicArray(digits);
                    logger.info("File is valid. Data read.");
                    return basicArray;
                }
            }
            logger.error("File data is incorrect.");
            throw new BasicArrayException("File data is incorrect");
        } catch (FileNotFoundException e) {
            logger.error("File not found");
        }
        return null;
    }
}
