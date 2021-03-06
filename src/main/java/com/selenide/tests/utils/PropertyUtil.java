package com.selenide.tests.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Properties;

public class PropertyUtil {

    private volatile static PropertyUtil instance;
    private final Properties myProperties;
    private final String config = "config.properties";

    private PropertyUtil() {

        this.myProperties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(new File(Thread.currentThread().getContextClassLoader().getResource(config).getFile()))) {
            this.myProperties.load(fileInputStream);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static Properties getInstance() {
        if (instance == null) {
            synchronized (PropertyUtil.class) {
                if (instance == null) {
                    instance = new PropertyUtil();
                }
            }
        }

        return instance.myProperties;
    }

    public String getPropertyValue(String key) {
        if(isPropertyExists(key)) {
            return myProperties.getProperty(key);
        } else {
            throw new IllegalStateException(MessageFormat.format("NO!! KEY {0}", key));
        }
    }

    private boolean isPropertyExists(String key) {
        return myProperties.get(key) != null;
    }
}