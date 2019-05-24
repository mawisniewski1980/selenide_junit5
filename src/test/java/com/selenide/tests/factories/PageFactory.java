package com.selenide.tests.factories;

import com.selenide.tests.elements.HomeElements;
import com.selenide.tests.pages.Home;

public class PageFactory {

    public Home newHomePage() {
        return new Home(this, new HomeElements());
    }

}
