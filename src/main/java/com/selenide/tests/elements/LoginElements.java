package com.selenide.tests.elements;

import com.selenide.tests.abstracts.AbstractElements;

import static com.selenide.tests.enums.EnumElements.*;

public class LoginElements extends AbstractElements {

    public LoginElements() {
    }

    @Override
    protected void addPageElements() {
        addElement(LOGIN_FORM, "#loginform");
        addElement(LOGIN_USER_NAME, "#user_login");
        addElement(LOGIN_PASSWORD, "#user_pass");
        addElement(LOGIN_REMEMBER_ME_CHECKBOX, "#rememberme");
        addElement(LOGIN_BUTTON, "#wp-submit");
    }

}
