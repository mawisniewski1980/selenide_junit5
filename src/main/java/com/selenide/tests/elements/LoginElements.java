package com.selenide.tests.elements;

import com.selenide.tests.abstracts.AbstractElements;

import static com.selenide.tests.enums.Elements.*;

public class LoginElements extends AbstractElements {

    @Override
    protected void addPageElements() {
        addSelector(LOGIN_FORM, "#loginform");
        addSelector(LOGIN_USER_NAME, "#user_login");
        addSelector(LOGIN_PASSWORD, "#user_pass");
        addSelector(LOGIN_REMEMBER_ME_CHECKBOX, "#rememberme");
        addSelector(LOGIN_BUTTON, "#wp-submit");
    }

}
