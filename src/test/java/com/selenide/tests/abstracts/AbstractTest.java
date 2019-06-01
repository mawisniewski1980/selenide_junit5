package com.selenide.tests.abstracts;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.selenide.tests.factories.PageFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class AbstractTest {

    protected static final Logger LOG = LoggerFactory.getLogger(AbstractTest.class);
    protected static final String URL = "https://s1.demo.opensourcecms.com/wordpress/wp-login.php";
    
    protected PageFactory pageFactory = new PageFactory();

    @BeforeAll
    static void beforeAll() {
        LOG.info("before all methods - once in a class ................ ");
        Configuration.baseUrl = URL;
        //Configuration.startMaximized = true;
    }

    @BeforeEach
    void setUp() {
        LOG.info("before each test method - in a class ................ ");
        LOG.info("Open the page: " + URL);
        Selenide.open("");
    }
    
    @AfterEach
    void tearDown() {
        LOG.info("after each test method - in a class ................ ");
    }

    @AfterAll
    static void afterAll() {
        LOG.info("................ after all methods - once in a class ...");
    }
    

    
}
