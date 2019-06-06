package com.selenide.tests.elements;

import com.selenide.tests.abstracts.AbstractElements;

import static com.selenide.tests.enums.Elements.ALL_POSTS;
import static com.selenide.tests.enums.Elements.PROFILE_LINK;

public class NavbarElements extends AbstractElements {

    @Override
    protected void addPageElements() {
        addSelector(PROFILE_LINK, "#wp-admin-bar-my-account");
        addSelector(ALL_POSTS, "#menu-posts li.wp-first-item");
    }
}
