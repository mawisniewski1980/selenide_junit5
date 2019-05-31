package com.selenide.tests.abstracts;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.selenide.tests.enums.Elements.H1_PAGE_HEADER;
import static com.selenide.tests.enums.Elements.WELCOME_PANEL;

public abstract class AbstractElements {

    private final Map<Enum, String> pageElements;

    public AbstractElements() {
        this.pageElements = new HashMap<>();
        addPageElements();
        addCommonElements();
    }

    protected abstract void addPageElements();

    protected final void addElement(Enum name, String selector) {
        this.pageElements.put(name, selector);
    }

    public final String getElementSelector(Enum name) {
        return this.pageElements.get(name);
    }

    public final SelenideElement getElement(Enum name) {
        return $(getElementSelector(name));
    }

    public final ElementsCollection getElementsCollection(Enum name) {
        return $$(getElementSelector(name));
    }

    private void addCommonElements() {
        addElement(WELCOME_PANEL, "#welcome-panel");
        addElement(H1_PAGE_HEADER, ".wp-heading-inline");
    }
}
