package com.selenide.tests.pages;

import com.selenide.tests.abstracts.AbstractPage;
import com.selenide.tests.elements.ProfileElements;
import com.selenide.tests.factories.PageFactory;

import static com.selenide.tests.enums.Elements.PROFILE_LOCALE_SELECT;


public class ProfilePage extends AbstractPage<ProfileElements> {

    public ProfilePage(PageFactory pageFactory, ProfileElements pageElements) {
        super(pageFactory, pageElements);
    }

    public void selectValueLocaleField() {
        selectValueBasedOnText(this.pageElements.getElement(PROFILE_LOCALE_SELECT), "Polski");
    }


}
