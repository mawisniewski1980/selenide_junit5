package com.selenide.tests.elements;

import com.selenide.tests.abstracts.AbstractElements;

import static com.selenide.tests.enums.EnumElements.*;

public class HomeElements extends AbstractElements {

    public HomeElements() {
    }

    @Override
    protected void addPageElements() {
        addField(APPLICATION_TEST_DRIVE, ".container .text h2");
        addField(HOME_PAGE_FRONT_END, ".container .text h2");
        addField(ADMINISTRATOR_BACKEND, ".container .text h2");

    }

}
