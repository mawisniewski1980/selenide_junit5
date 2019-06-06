package com.selenide.tests.factories;

import com.selenide.tests.elements.LoginElements;
import com.selenide.tests.elements.NavbarElements;
import com.selenide.tests.elements.ProfileElements;
import com.selenide.tests.pages.LoginPage;
import com.selenide.tests.pages.NavbarPage;
import com.selenide.tests.pages.ProfilePage;

public class PageFactory {

    public LoginPage newLoginPage() {
        return new LoginPage(this, new LoginElements());
    }

    public NavbarPage newNavbarTopPage() {
        return new NavbarPage(this, new NavbarElements());
    }

    public ProfilePage newProfilePage() {
        return new ProfilePage(this, new ProfileElements());
    }

}
