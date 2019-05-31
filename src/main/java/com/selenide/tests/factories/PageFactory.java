package com.selenide.tests.factories;

import com.selenide.tests.elements.LoginElements;
import com.selenide.tests.elements.NavbarTopElements;
import com.selenide.tests.elements.ProfileElements;
import com.selenide.tests.pages.LoginPage;
import com.selenide.tests.pages.NavbarTopPage;
import com.selenide.tests.pages.ProfilePage;

public class PageFactory {

    public LoginPage newLoginPage() {
        return new LoginPage(this, new LoginElements());
    }

    public NavbarTopPage newNavbarTopPage() {
        return new NavbarTopPage(this, new NavbarTopElements());
    }

    public ProfilePage newProfilePage() {
        return new ProfilePage(this, new ProfileElements());
    }

}
