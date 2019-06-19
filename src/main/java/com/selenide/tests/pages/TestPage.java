package com.selenide.tests.pages;

import com.selenide.tests.abstracts.AbstractPage;
import com.selenide.tests.elements.TestElements;
import com.selenide.tests.factories.PageFactory;

public class TestPage extends AbstractPage<TestElements> {



    public TestPage(PageFactory pageFactory, TestElements pageElements) {
        super(pageFactory, pageElements);
    }


}
