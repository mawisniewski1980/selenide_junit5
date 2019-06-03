package com.selenide.tests.utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.URL;

public class DriverUtil {

    private final Logger logger = LoggerFactory.getLogger(DriverUtil.class);
    protected static final String URL = "https://s1.demo.opensourcecms.com/wordpress/wp-login.php";

    private volatile static DriverUtil instance;

    private DriverUtil() {
    }

    public static DriverUtil getInstance() {
        if (instance == null) {
            synchronized (DriverUtil.class) {
                if (instance == null) {
                    instance = new DriverUtil();
                }
            }
        }

        return instance;
    }

    public void setChrome() {

        ClassLoader classLoader = getClass().getClassLoader();
        URL url = classLoader.getResource("exe/chromedriver.exe");

        if (url != null) {
            String driverPath = new File(url.getFile()).getAbsolutePath();
            System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, driverPath);
            System.setProperty("selenide.browser", "chrome");
            Configuration.timeout = 6000;
            Configuration.startMaximized = true;
            Configuration.baseUrl = URL;
        } else {
            logger.error("NO! File chromedriver.exe not found.");
        }
    }

}