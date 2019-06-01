package com.selenide.tests.elements;

import com.selenide.tests.abstracts.AbstractElements;

import static com.selenide.tests.enums.Elements.*;

public class LoginElements extends AbstractElements {

    @Override
    protected void addPageElements() {
        addElement(LOGIN_FORM, "#loginform");
        addElement(LOGIN_USER_NAME, "#user_login");
        addElement(LOGIN_PASSWORD, "#user_pass");
        addElement(LOGIN_REMEMBER_ME_CHECKBOX, "#rememberme");
        addElement(LOGIN_BUTTON, "#wp-submit");
    }

}
