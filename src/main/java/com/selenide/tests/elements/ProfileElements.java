package com.selenide.tests.elements;

import com.selenide.tests.abstracts.AbstractElements;

import static com.selenide.tests.enums.Elements.*;

public class ProfileElements extends AbstractElements {

    @Override
    protected void addPageElements() {
        addElement(PROFILE_LOCALE_SELECT, "#locale");
        addElement(PROFILE_ADMIN_COLOR_SCHEME_FRESH, "#admin_color_fresh");
        addElement(PROFILE_ADMIN_COLOR_SCHEME_LIGHT, "#admin_color_light");
        addElement(PROFILE_ADMIN_COLOR_SCHEME_BLUE, "#admin_color_blue");
        addElement(PROFILE_ADMIN_COLOR_SCHEME_COFFEE, "#admin_color_coffee");
        addElement(PROFILE_ADMIN_COLOR_SCHEME_ECTOPLASM, "#admin_color_ectoplasm");
        addElement(PROFILE_ADMIN_COLOR_SCHEME_MIDNIGHT, "#admin_color_midnight");
        addElement(PROFILE_ADMIN_COLOR_SCHEME_OCEAN, "#admin_color_ocean");
        addElement(PROFILE_ADMIN_COLOR_SCHEME_SUNRISE, "#admin_color_sunrise");
        addElement(PROFILE_UPDATE_BUTTON, "input[id='submit']");
        addElement(PROFILE_UPDATE_MESSAGE, "#message strong");
    }
}
