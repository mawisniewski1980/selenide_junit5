package com.selenide.tests.pages;

import com.selenide.tests.abstracts.AbstractTest;
import org.junit.jupiter.api.Test;

public class ProfilePageTest extends AbstractTest {

    @Test
    public void openProfilePage() {

        this.pageFactory.newLoginPage().logIn();
        this.pageFactory.newNavbarTopPage().openProfilePage();
        this.pageFactory.newProfilePage().selectValueLocaleField();
    }
}
