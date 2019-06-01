package com.selenide.tests.pages;

import com.selenide.tests.abstracts.AbstractTest;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.assertj.core.api.Assertions.*;

@Tag("login")
class LoginPageTest extends AbstractTest {

    protected static final Logger LOG = LoggerFactory.getLogger(LoginPageTest.class);

    @Test
    @DisplayName("Open test page and LOG in.")
    public void openBasePageParamValue() {
        LOG.info("Opening LOGin page....");
        this.pageFactory.newLoginPage().logIn();

        assertThat(this.pageFactory.newLoginPage().isWelcomePanelVisible()).isTrue();

    }



}