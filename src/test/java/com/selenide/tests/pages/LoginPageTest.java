package com.selenide.tests.pages;

import com.codeborne.selenide.Selenide;
import com.selenide.tests.abstracts.AbstractTest;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.assertj.core.api.Assertions.*;

@Tag("login")
class LoginPageTest extends AbstractTest {

    protected static final Logger LOG = LoggerFactory.getLogger(LoginPageTest.class);

    @BeforeEach
    void setUp() {
        LOG.info("before each test method - in a class ................ ");
        Selenide.open("");

        LOG.info("Opening LOGin page....");
        this.pageFactory.newLoginPage().logIn();
    }

    @Test
    @DisplayName("Assert LOG in.")
    public void openBasePageParamValue() {

        assertThat(this.pageFactory.newLoginPage().isWelcomePanelVisible()).isTrue();
    }

}