package com.selenide.tests.pages;

import com.codeborne.selenide.Selenide;
import com.selenide.tests.abstracts.AbstractTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("profile")
public class ProfilePageTest extends AbstractTest {

    @BeforeEach
    void setUp() {
        LOG.info("before each test method - in a class ................ ");
        Selenide.open("");
        this.pageFactory.newLoginPage().logIn();
        this.pageFactory.newNavbarTopPage().openProfilePage();
    }


    @Test
    public void changeProfile() {

        this.pageFactory.newProfilePage().setColorScheme(ProfilePage.PROFILE.Midnight);
        this.pageFactory.newProfilePage().setProfileLanguage("Polski");
        this.pageFactory.newProfilePage().clickProfileUpdateButton();
        assertThat("Profil został zaktualizowany.").isEqualTo(this.pageFactory.newProfilePage().getProfileUpdateMessage());

        this.pageFactory.newProfilePage().setProfileLanguage("Domyślny dla witryny");
        this.pageFactory.newProfilePage().clickProfileUpdateButton();
        assertThat("Profile updated.").isEqualTo(this.pageFactory.newProfilePage().getProfileUpdateMessage());
    }
    @Test
    public void test1() {
        LOG.info("test1");
    }

    @Test
    public void test2() {
        LOG.info("test2");
    }

    @Test
    public void test3() {
        LOG.info("test3");
    }



}
