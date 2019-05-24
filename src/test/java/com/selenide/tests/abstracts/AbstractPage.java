package com.selenide.tests.abstracts;

import com.selenide.tests.factories.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractPage<T extends AbstractElements> {

    protected final Logger log = LoggerFactory.getLogger(AbstractPage.class);

    protected final T pageElements;
    protected final PageFactory pageFactory;

    public AbstractPage(PageFactory pageFactory, T pageElements) {
        this.pageFactory = pageFactory;
        this.pageElements = pageElements;
    }


}
