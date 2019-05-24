package com.selenide.tests;

import com.selenide.tests.abstracts.AbstractTest;
import com.selenide.tests.pages.Home;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HomeTest extends AbstractTest {


    @Test
    @DisplayName("Open test page on base page and assertIf")
    public void openBasePage() {
        log.info("Opening base page.");
        assertThat("APPLICATION TEST DRIVE.").isEqualTo(this.pageFactory.newHomePage().getApplicationTestDriveText());
    }


}