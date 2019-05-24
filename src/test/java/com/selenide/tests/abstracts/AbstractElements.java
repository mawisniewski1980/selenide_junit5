package com.selenide.tests.abstracts;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public abstract class AbstractElements {

    private final Map<Enum, String> pageElements;

    public AbstractElements() {
        this.pageElements = new HashMap<>();
        addPageElements();
    }

    protected abstract void addPageElements();

    public final void addField(Enum name, String field) {
        this.pageElements.put(name, field);
    }

    public final String getField(Enum name) {
        return this.pageElements.get(name);
    }

    public final SelenideElement getElement(Enum name) {
        return $(getField(name));
    }

    public final ElementsCollection getElementsCollection(Enum name) {
        return $$(getField(name));
    }
}
