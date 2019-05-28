package com.selenide.tests.pages;

import com.codeborne.selenide.Condition;
import com.selenide.tests.abstracts.AbstractPage;
import com.selenide.tests.elements.LoginElements;
import com.selenide.tests.factories.PageFactory;
import com.selenide.tests.utils.HashUtil;
import com.selenide.tests.utils.Property;

import static com.selenide.tests.enums.EnumElements.*;


public class LoginPage extends AbstractPage<LoginElements> {

    public LoginPage(PageFactory pageFactory, LoginElements pageElements) {
        super(pageFactory, pageElements);
    }

    public void logIn() {

        this.pageElements.getElement(LOGIN_FORM).shouldBe(Condition.visible);
        this.pageElements.getElement(LOGIN_USER_NAME).shouldBe(Condition.visible).setValue(Property.INSTANCE.getPropertyValue("username"));
        this.pageElements.getElement(LOGIN_PASSWORD).shouldBe(Condition.visible).setValue(HashUtil.INSTANCE.decrypt(Property.INSTANCE.getPropertyValue("password")));
        this.pageElements.getElement(LOGIN_BUTTON).shouldBe(Condition.enabled).click();

    }


}
