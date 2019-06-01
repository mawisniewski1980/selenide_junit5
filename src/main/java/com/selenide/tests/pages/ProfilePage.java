package com.selenide.tests.pages;

import com.codeborne.selenide.Condition;
import com.selenide.tests.abstracts.AbstractPage;
import com.selenide.tests.elements.ProfileElements;
import com.selenide.tests.factories.PageFactory;

import static com.selenide.tests.enums.Elements.*;


public class ProfilePage extends AbstractPage<ProfileElements> {

    enum PROFILE {
        Default,Light,Blue,Coffee,Ectoplasm,Midnight,Ocean,Sunrise
    }

    public ProfilePage(PageFactory pageFactory, ProfileElements pageElements) {
        super(pageFactory, pageElements);
    }

    public void setProfileLanguage(String lang) {
        selectValueBasedOnText(this.pageElements.getElement(PROFILE_LOCALE_SELECT), lang);
    }

    public void setColorScheme(PROFILE profile) {
        switch (profile) {
            case Default:
                selectRadioBattonBasedOnTextValue(this.pageElements.getElement(PROFILE_ADMIN_COLOR_SCHEME_FRESH), "fresh");
                break;
            case Light:
                selectRadioBattonBasedOnTextValue(this.pageElements.getElement(PROFILE_ADMIN_COLOR_SCHEME_LIGHT), "light");
                break;
            case Blue:
                selectRadioBattonBasedOnTextValue(this.pageElements.getElement(PROFILE_ADMIN_COLOR_SCHEME_BLUE), "blue");
                break;
            case Ocean:
                selectRadioBattonBasedOnTextValue(this.pageElements.getElement(PROFILE_ADMIN_COLOR_SCHEME_OCEAN), "ocean");
                break;
            case Coffee:
                selectRadioBattonBasedOnTextValue(this.pageElements.getElement(PROFILE_ADMIN_COLOR_SCHEME_COFFEE), "coffee");
                break;
            case Sunrise:
                selectRadioBattonBasedOnTextValue(this.pageElements.getElement(PROFILE_ADMIN_COLOR_SCHEME_SUNRISE), "sunrise");
                break;
            case Midnight:
                selectRadioBattonBasedOnTextValue(this.pageElements.getElement(PROFILE_ADMIN_COLOR_SCHEME_MIDNIGHT), "midnight");
                break;
            case Ectoplasm:
                selectRadioBattonBasedOnTextValue(this.pageElements.getElement(PROFILE_ADMIN_COLOR_SCHEME_ECTOPLASM), "ectoplasm");
                break;
                default:
                    LOG.info("NO color!");
        }
    }

    public void clickProfileUpdateButton() {
        this.pageElements.getElement(PROFILE_UPDATE_BUTTON).shouldBe(Condition.visible).scrollIntoView(true).click();
    }

    public String getProfileUpdateMessage() {
        return this.pageElements.getElement(PROFILE_UPDATE_MESSAGE).shouldBe(Condition.visible).getText();
    }



}
