package com.selenide.tests.abstracts;

import com.selenide.tests.factories.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.selenide.tests.enums.EnumElements.WELCOME_PANEL;

public abstract class AbstractPage<T extends AbstractElements> {

    protected final Logger log = LoggerFactory.getLogger(AbstractPage.class);

    protected final T pageElements;
    protected final PageFactory pageFactory;

    public AbstractPage(PageFactory pageFactory, T pageElements) {
        this.pageFactory = pageFactory;
        this.pageElements = pageElements;
    }


    public boolean isWelcomePanelVisible() {
        return this.pageElements.getElement(WELCOME_PANEL).isDisplayed();
    }
}
