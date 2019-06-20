package com.selenide.tests.pages;

import com.codeborne.selenide.Selenide;
import com.selenide.tests.abstracts.AbstractTest;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Tag("login")
class LoginPageTest extends AbstractTest {

    static final Logger LOG = LoggerFactory.getLogger(LoginPageTest.class);

    @BeforeEach
    void setUp() {
        LOG.info("before each test method - in a class ................ ");
        Selenide.open("");

        LOG.info("Opening LOGin page....");
        this.pageFactory.newLoginPage().logIn();
    }

   /* @Test
    @DisplayName("Assert LOG in.")
    public void openBasePageParamValue() {

        assertThat(this.pageFactory.newLoginPage().isWelcomePanelVisible()).isTrue();
    }*/

   @Test
   void test1_LoginPageTest() {
       LOG.info("test1 LoginPageTest");
   }

    @Test
    void test2_LoginPageTest() {
        LOG.info("test2 LoginPageTest");
    }

    @Test
    void test3_LoginPageTest() {
        LOG.info("test3 LoginPageTest");
    }

}