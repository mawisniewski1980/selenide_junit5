package com.selenide.tests.abstracts;

import com.selenide.tests.factories.PageFactory;
import com.selenide.tests.interfaces.InterfacesTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class AbstractTest implements InterfacesTest {

    protected static final Logger log = LoggerFactory.getLogger(AbstractTest.class);

    protected final PageFactory pageFactory;

    public AbstractTest() {
        pageFactory = new PageFactory();
    }

    @BeforeEach
    void setUp() {
        log.info("before each test method - in a class ................ ");
    }

    @AfterEach
    void tearDown() {
        log.info("after each test method - in a class ................ ");
    }

}
