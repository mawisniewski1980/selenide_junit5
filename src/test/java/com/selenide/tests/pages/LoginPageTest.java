package com.selenide.tests.pages;

import com.selenide.tests.abstracts.AbstractTest;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.assertj.core.api.Assertions.*;

@Tag("login")
class LoginPageTest extends AbstractTest {

    protected static final Logger log = LoggerFactory.getLogger(LoginPageTest.class);

    @ParameterizedTest(name = "[{index}] - {displayName} - {arguments}")
    @ValueSource(strings = "APPLICATION TEST DRIVE.")
    @DisplayName("Open test page on base page: [ValueSource] ")
    public void openBasePageParamValue(String value) {
        log.info("Opening login page....");
        this.pageFactory.newLoginPage().logIn();

        assertThat(this.pageFactory.newLoginPage().isWelcomePanelVisible()).isTrue();
    }

    @ParameterizedTest(name = "[{index}] - {displayName} - {arguments}")
    @ValueSource(strings = "APPLICATION TEST DRIVE.")
    @DisplayName("Open test page on base page: [ValueSource] ")
    public void openBasePageParamValue2(String value) {
        log.info("Opening login page....");
        this.pageFactory.newLoginPage().logIn();

        assertThat(this.pageFactory.newLoginPage().isWelcomePanelVisible()).isTrue();
    }
}