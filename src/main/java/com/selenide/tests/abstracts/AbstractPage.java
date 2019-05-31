package com.selenide.tests.abstracts;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.selenide.tests.factories.PageFactory;

import static com.selenide.tests.enums.Elements.*;

public abstract class AbstractPage<T extends AbstractElements> {

    protected final T pageElements;
    protected final PageFactory pageFactory;

    public AbstractPage(PageFactory pageFactory, T pageElements) {
        this.pageFactory = pageFactory;
        this.pageElements = pageElements;
    }

    public boolean isWelcomePanelVisible() {
        return this.pageElements.getElement(WELCOME_PANEL).shouldBe(Condition.visible).isDisplayed();
    }

    public String getH1PageNavbarText() {
        return this.pageElements.getElement(H1_PAGE_HEADER).shouldBe(Condition.visible).getText();
    }

    public void selectValueBasedOnText(SelenideElement element, String text) {
        element.shouldBe(Condition.visible).selectOptionContainingText(text);
        element.getSelectedOption().shouldBe(Condition.exactText(text));
    }
}
