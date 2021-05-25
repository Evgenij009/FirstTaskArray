package com.epam.eugene;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class AppTest {

    private static final Logger logger = LogManager.getLogger();

    @Test
    public void test1() {
        logger.info("App test log message.");
    }
}