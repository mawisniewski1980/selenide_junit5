package com.selenide.tests.pages;

import com.codeborne.selenide.Condition;
import com.selenide.tests.abstracts.AbstractPage;
import com.selenide.tests.elements.NavbarTopElements;
import com.selenide.tests.factories.PageFactory;

import static com.selenide.tests.enums.Elements.H1_PAGE_HEADER;
import static com.selenide.tests.enums.Elements.PROFILE_LINK;

public class NavbarTopPage extends AbstractPage<NavbarTopElements> {

    public NavbarTopPage(PageFactory pageFactory, NavbarTopElements pageElements) {
        super(pageFactory, pageElements);
    }

    public NavbarTopPage openProfilePage() {
        this.pageElements.getElement(PROFILE_LINK)
            .shouldBe(Condition.visible)
            .shouldBe(Condition.enabled)
            .scrollIntoView(true)
            .click();

        this.pageElements.getElement(H1_PAGE_HEADER)
            .shouldBe(Condition.visible)
            .shouldHave(Condition.exactText("Profile"));

        return this;
    }

}
