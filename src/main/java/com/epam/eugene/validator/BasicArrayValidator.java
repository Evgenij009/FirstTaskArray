package com.epam.eugene.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicArrayValidator {
    private static final String REGEX_NUMBER = "^[-?[\\d]+[\\s]+ ]+$";

    private BasicArrayValidator() {
    }

    public static boolean isValidateDigitLine(String line) {
        Pattern pattern = Pattern.compile(REGEX_NUMBER);
        Matcher matcher = pattern.matcher(line);
        return matcher.matches();
    }
}
