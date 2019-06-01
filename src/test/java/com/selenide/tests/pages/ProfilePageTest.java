package com.selenide.tests.pages;

import com.selenide.tests.abstracts.AbstractTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("profile")
public class ProfilePageTest extends AbstractTest {

    @Test
    public void changeProfile() {

        this.pageFactory.newLoginPage().logIn();
        this.pageFactory.newNavbarTopPage().openProfilePage();

        this.pageFactory.newProfilePage().setColorScheme(ProfilePage.PROFILE.Midnight);
        this.pageFactory.newProfilePage().setProfileLanguage("Polski");
        this.pageFactory.newProfilePage().clickProfileUpdateButton();
        assertThat("Profil został zaktualizowany.").isEqualTo(this.pageFactory.newProfilePage().getProfileUpdateMessage());

        this.pageFactory.newProfilePage().setProfileLanguage("Domyślny dla witryny");
        this.pageFactory.newProfilePage().clickProfileUpdateButton();
        assertThat("Profile updated.").isEqualTo(this.pageFactory.newProfilePage().getProfileUpdateMessage());



    }
}
