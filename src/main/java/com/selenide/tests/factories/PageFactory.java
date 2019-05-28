package com.selenide.tests.factories;

import com.selenide.tests.elements.LoginElements;
import com.selenide.tests.pages.LoginPage;

public class PageFactory {


    public PageFactory() {
    }

    public LoginPage newLoginPage() {
        return new LoginPage(this, new LoginElements());
    }

}
