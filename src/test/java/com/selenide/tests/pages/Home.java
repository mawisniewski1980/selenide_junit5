package com.selenide.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.selenide.tests.abstracts.AbstractPage;

import static com.codeborne.selenide.Selenide.*;

public class Home extends AbstractPage {

    private SelenideElement applicationTestDrive = $(".container .text h2");
    private SelenideElement homepageFrontEnd = $(".container .text h2");
    private SelenideElement administratorBackEnd = $(".container .text h2");


    public String getApplicationTestDriveText() {
        return applicationTestDrive.waitUntil(Condition.appear, 5000).getText();
    }

    public void openHomePage() {
        homepageFrontEnd.click();
    }

    public void openAdministratorBackEndPage() {
        administratorBackEnd.click();
    }


}
