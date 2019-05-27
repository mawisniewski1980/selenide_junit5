package com.selenide.tests.pages;

import com.codeborne.selenide.Condition;
import com.selenide.tests.abstracts.AbstractPage;
import com.selenide.tests.elements.HomeElements;
import com.selenide.tests.factories.PageFactory;

import static com.selenide.tests.enums.EnumElements.APPLICATION_TEST_DRIVE;


public class Home extends AbstractPage<HomeElements> {

    public Home(PageFactory pageFactory, HomeElements pageElements) {
        super(pageFactory, pageElements);
    }


    public String getApplicationTestDriveText() {
        return this.pageElements.getElement(APPLICATION_TEST_DRIVE)
                .shouldBe(Condition.appear)
                .getText();
    }


}
