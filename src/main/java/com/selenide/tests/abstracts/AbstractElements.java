package com.selenide.tests.abstracts;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.*;
import static com.selenide.tests.enums.Elements.*;

public abstract class AbstractElements {

    private final Map<Enum, String> pageElements;
    private final String XPATHs[] = {"//", "/", "..", "@"};

    public AbstractElements() {
        this.pageElements = new HashMap<>();
        addPageElements();
        addCommonElements();
    }

    protected abstract void addPageElements();

    protected final void addSelector(Enum name, String selector) {
        this.pageElements.put(name, selector);
    }

    public final String getSelector(Enum name) {
        return this.pageElements.get(name);
    }

    public final SelenideElement getElement(Enum name) {
        return StringUtils.startsWithAny(getSelector(name), XPATHs) ? $x(getSelector(name)) : $(getSelector(name));
    }

    public final ElementsCollection getElementsCollection(Enum name) {
        return StringUtils.startsWithAny(getSelector(name), XPATHs) ? $$x(getSelector(name)) : $$(getSelector(name));
    }

    public final SelenideElement getElementBy(By by) {
        return $(by);
    }

    public final ElementsCollection getElementsCollectionBy(By by) {
        return $$(by);
    }

    public final String getChangedSelectorXpath(Enum name, List<String> elementValues) {
        StringBuilder selectorBuilder = new StringBuilder(getSelector(name));
        elementValues.forEach(str -> selectorBuilder.append(String.format("[contains(.,'%s')]", str)));
        return selectorBuilder.toString();
    }

    public final SelenideElement getChangedElementXpath(Enum name, List<String> elementValues) {
        return $x(getChangedSelectorXpath(name, elementValues));
    }

    private void addCommonElements() {
        addSelector(WELCOME_PANEL, "#welcome-panel");
        addSelector(H1_PAGE_HEADER, ".wp-heading-inline");
    }
}
