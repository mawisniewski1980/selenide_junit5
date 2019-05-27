package com.selenide.tests;

import com.selenide.tests.abstracts.AbstractTest;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("home")
class HomeTest extends AbstractTest {

    protected static final Logger log = LoggerFactory.getLogger(HomeTest.class);

    @DisplayName("Open test page on base page and assert it")
    @Test
    public void openBasePage(TestInfo testInfo) {
        log.info("Opening base page.");
        log.info("TestInfo: " + testInfo.getDisplayName());
        assertThat("APPLICATION TEST DRIVE.").isEqualTo(this.pageFactory.newHomePage().getApplicationTestDriveText());
    }

    @DisplayName("Open test page on base page: [ValueSource] ")
    @ParameterizedTest(name = "[{index}] - {displayName} - {arguments}")
    @ValueSource(strings = "APPLICATION TEST DRIVE.")
    public void openBasePageParamValue(String value) {
        log.info("Opening base page.");
        assertThat(value).isEqualTo(this.pageFactory.newHomePage().getApplicationTestDriveText());
    }
}