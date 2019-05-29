package com.selenide.tests.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Properties;

public enum Property {

    INSTANCE;

    private static final Logger LOG = LoggerFactory.getLogger(Property.class);

    private Properties prop = new Properties();
    private final String config = "config.properties";

    Property() {
        try (InputStream inputStream = Property.class.getClassLoader().getResourceAsStream(config)) {
            prop.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getPropertyValue(String key) {
        if(isPropertyExists(key)) {
            return prop.getProperty(key);
        } else {
            throw new IllegalStateException(MessageFormat.format("NO!! KEY {0}", key));
        }
    }

    private boolean isPropertyExists(String key) {
        return prop.get(key) != null;
    }

}
