package com.selenide.tests.abstracts;


import com.selenide.tests.factories.PageFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class AbstractTest {

    protected static final Logger LOG = LoggerFactory.getLogger(AbstractTest.class);

    protected PageFactory pageFactory = new PageFactory();

    @BeforeAll
    static void beforeAll() {
        LOG.info("before all methods - once in a class ................ ");
    }

    @AfterAll
    static void afterAll() {
        LOG.info("................ after all methods - once in a class ...");
    }
    

    
}
