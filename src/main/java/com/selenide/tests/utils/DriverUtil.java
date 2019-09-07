package com.selenide.tests.utils;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class DriverUtil {

    private final Logger logger = LoggerFactory.getLogger(DriverUtil.class);

    //private volatile static DriverUtil instance;

    public DriverUtil() {
    }
/*

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
*/

    public void setChrome() {
            //String driverPath = new File(Thread.currentThread().getContextClassLoader().getResource("exe/chromedriver.exe").getFile()).getAbsolutePath();
            //System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, driverPath);
            System.setProperty("selenide.browser", "chrome");
            Configuration.timeout = 8000;
            Configuration.startMaximized = true;
            Configuration.baseUrl = "https://s1.demo.opensourcecms.com/wordpress/wp-login.php";
    }

}