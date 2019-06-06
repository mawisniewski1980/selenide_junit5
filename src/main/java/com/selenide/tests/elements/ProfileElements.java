package com.selenide.tests.elements;

import com.selenide.tests.abstracts.AbstractElements;

import static com.selenide.tests.enums.Elements.*;

public class ProfileElements extends AbstractElements {

    @Override
    protected void addPageElements() {
        addSelector(PROFILE_LOCALE_SELECT, "#locale");
        addSelector(PROFILE_ADMIN_COLOR_SCHEME_FRESH, "#admin_color_fresh");
        addSelector(PROFILE_ADMIN_COLOR_SCHEME_LIGHT, "#admin_color_light");
        addSelector(PROFILE_ADMIN_COLOR_SCHEME_BLUE, "#admin_color_blue");
        addSelector(PROFILE_ADMIN_COLOR_SCHEME_COFFEE, "#admin_color_coffee");
        addSelector(PROFILE_ADMIN_COLOR_SCHEME_ECTOPLASM, "#admin_color_ectoplasm");
        addSelector(PROFILE_ADMIN_COLOR_SCHEME_MIDNIGHT, "#admin_color_midnight");
        addSelector(PROFILE_ADMIN_COLOR_SCHEME_OCEAN, "#admin_color_ocean");
        addSelector(PROFILE_ADMIN_COLOR_SCHEME_SUNRISE, "#admin_color_sunrise");
        addSelector(PROFILE_UPDATE_BUTTON, "input[id='submit']");
        addSelector(PROFILE_UPDATE_MESSAGE, "#message strong");
    }
}
