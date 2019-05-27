package com.selenide.tests.interfaces;

import com.codeborne.selenide.Selenide;
import com.selenide.tests.abstracts.AbstractTest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface InterfacesTest {

    Logger log = LoggerFactory.getLogger(AbstractTest.class);

    @BeforeAll
    static void beforeAll() {
        log.info("before all methods - once in a class ................ ");
        Selenide.open("https://phptravels.com/demo/");
    }

    @AfterAll
    static void afterAll() {
        log.info("................ after all methods - once in a class ...");
    }
}
