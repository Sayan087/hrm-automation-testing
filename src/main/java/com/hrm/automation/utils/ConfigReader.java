package com.hrm.automation.utils;


import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop = new Properties();

    static {
        try {
            InputStream input =
                    ConfigReader.class
                            .getClassLoader()
                            .getResourceAsStream("config.properties");

            prop.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Config file not found");
        }
    }

    public static String get(String key) {
        return prop.getProperty(key);
    }
}


