package com.selenide.tests.elements;

import com.selenide.tests.abstracts.AbstractElements;

import static com.selenide.tests.enums.Elements.PROFILE_LOCALE_SELECT;

public class ProfileElements extends AbstractElements {

    @Override
    protected void addPageElements() {
        addElement(PROFILE_LOCALE_SELECT, "#locale");
    }
}
