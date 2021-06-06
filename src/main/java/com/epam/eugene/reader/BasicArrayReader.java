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
        if (path == null || path.isEmpty()) {
            logger.fatal("readBasicArrayFromFile() Path to file is empty or NULL!");
            throw new BasicArrayException("Path to file is empty or NULL");
        }
        BasicArray basicArray = null;
        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (BasicArrayValidator.isValidateDigitLine(line)) {
                    int[] digits = ParserArrayDigit.parseDigits(line);
                    basicArray = new BasicArray(digits);
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            logger.fatal("fatal error: file not found: " + path);
            throw new BasicArrayException("fatal error: file not found: " + path, e);
        }
        if (basicArray == null) {
            logger.error("File data is incorrect.");
            throw new BasicArrayException("File data is incorrect");
        }
        logger.info("File is valid. Data was read.");
        return basicArray;
    }
}
