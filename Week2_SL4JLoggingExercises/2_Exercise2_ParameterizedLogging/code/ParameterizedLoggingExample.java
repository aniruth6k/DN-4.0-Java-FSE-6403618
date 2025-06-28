package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String username = "aniruth";
        int attempts = 3;

        logger.info("User {} has attempted to login {} times", username, attempts);
        logger.warn("User {} has {} failed login attempts", username, attempts);
        logger.error("User {} is now locked out after {} attempts", username, attempts);
    }
}
