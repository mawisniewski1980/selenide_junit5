package com.selenide.tests.abstracts;


import com.codeborne.selenide.WebDriverRunner;
import com.selenide.tests.factories.PageFactory;
import com.selenide.tests.utils.DriverUtil;
import com.selenide.tests.utils.GlobalUtil;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class AbstractTest {

    protected static final Logger LOG = LoggerFactory.getLogger(AbstractTest.class);

    protected final PageFactory pageFactory;


    public AbstractTest() {
        this.pageFactory = new PageFactory();

    }

    @BeforeAll
    static void beforeAll() {
        LOG.info("before all methods - once in a class ................ ");
        DriverUtil.getInstance().setChrome();
    }

    @AfterEach
    void tearDown() {
        LOG.info("after each test method - in a class ................ ");
        WebDriverRunner.clearBrowserCache();
        WebDriverRunner.closeWebDriver();
    }

    @AfterAll
    static void afterAll() {
        LOG.info("................ after all methods - once in a class ...");
    }


    
}
