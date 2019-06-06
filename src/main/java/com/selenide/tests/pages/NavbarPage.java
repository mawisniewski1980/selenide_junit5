package com.selenide.tests.pages;

import com.selenide.tests.abstracts.AbstractPage;
import com.selenide.tests.elements.NavbarElements;
import com.selenide.tests.factories.PageFactory;

import static com.selenide.tests.enums.Elements.H1_PAGE_HEADER;
import static com.selenide.tests.enums.Elements.PROFILE_LINK;

public class NavbarPage extends AbstractPage<NavbarElements> {

    public NavbarPage(PageFactory pageFactory, NavbarElements pageElements) {
        super(pageFactory, pageElements);
    }

    public NavbarPage openProfilePage() {
        util.click(this.pageElements.getElement(PROFILE_LINK));
        util.shouldHaveExactText(this.pageElements.getElement(H1_PAGE_HEADER), "Profile");
        return this;
    }

}
