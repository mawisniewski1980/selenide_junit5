package com.selenide.tests.utils;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;


public class GlobalUtil {

    private volatile static GlobalUtil instance;

    private GlobalUtil() {
    }

    public static GlobalUtil getInstance() {
        if (instance == null) {
            synchronized (GlobalUtil.class) {
                if (instance == null) {
                    instance = new GlobalUtil();
                }
            }
        }

        return instance;
    }

    public void click(SelenideElement element) {
        element.shouldBe(Condition.visible)
               .shouldBe(Condition.enabled)
               .scrollIntoView(true)
               .click();
    }

    public void shouldHaveExactText(SelenideElement element, String text) {
        element.shouldBe(Condition.visible)
               .shouldHave(Condition.exactText(text));
    }
}