package com.selenide.tests.abstracts;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.selenide.tests.factories.PageFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class AbstractTest {

    protected static final Logger log = LoggerFactory.getLogger(AbstractTest.class);

    public final PageFactory pageFactory;

    public AbstractTest() {
        pageFactory = new PageFactory();
    }

    @BeforeAll
    static void beforeAll() {
        log.info("before all methods - once in a class ................ ");
        Selenide.open("https://phptravels.com/demo/");
    }

    @BeforeEach
    void setUp() {
        log.info("before each test method - in a class ................ ");
    }

    @AfterEach
    void tearDown() {
        log.info("after each test method - in a class ................ ");
    }

    @AfterAll
    static void afterAll() {
        log.info("................ after all methods - once in a class ...");

    }

}
