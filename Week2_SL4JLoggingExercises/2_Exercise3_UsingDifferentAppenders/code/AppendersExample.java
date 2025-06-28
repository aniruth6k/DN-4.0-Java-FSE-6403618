package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppendersExample {
    private static final Logger logger = LoggerFactory.getLogger(AppendersExample.class);

    public static void main(String[] args) {
        logger.debug("Debug message: Application is starting.");
        logger.info("Info message: Application is running.");
        logger.warn("Warning message: Low disk space.");
        logger.error("Error message: Unable to connect to database.");
    }
}
