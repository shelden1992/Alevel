package com.company.logger;

import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerTest {


    private  static final Logger LOGGER ;
//    private  static final Logger logger2 = Logger.getLogger(" LoggerTest");

    static {
//        System.setProperty("java.util.logging.config.file",
//                "/Users/macuser/Desktop/projects/Alevel/src/com/company/logger/log.properties");
//        //must initialize loggers after setting above property
        LOGGER = Logger.getLogger(LoggerTest.class.getName());
    }

    public static void main(String[] args) {
        try {
            LogManager.getLogManager().readConfiguration(LoggerTest.class.getResourceAsStream("com/company/log.properties"));
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }
//        System.out.println(System.getProperty("java Djava.util.logging.config.file"));

    }
}
//com/company/log.properties
