package com.selenide.tests.elements;

import com.selenide.tests.abstracts.AbstractElements;

import static com.selenide.tests.enums.Elements.PROFILE_LINK;

public class NavbarTopElements extends AbstractElements {

    @Override
    protected void addPageElements() {
        addElement(PROFILE_LINK, "#wp-admin-bar-my-account");
    }
}
