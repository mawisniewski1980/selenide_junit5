package com.selenide.tests.pages;

import com.codeborne.selenide.WebDriverRunner;
import com.selenide.tests.abstracts.AbstractTest;
import com.selenide.tests.utils.DriverUtil;
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
        DriverUtil.getInstance().setChrome();
    }

    @AfterEach
    void tearDown() {
        LOG.info("after each test method - in a class ................ ");
        WebDriverRunner.clearBrowserCache();
        WebDriverRunner.closeWebDriver();
    }

    @Test
    @DisplayName("Open test page and LOG in.")
    public void openBasePageParamValue() {
        LOG.info("Opening LOGin page....");
        this.pageFactory.newLoginPage().logIn();

        assertThat(this.pageFactory.newLoginPage().isWelcomePanelVisible()).isTrue();
    }

}