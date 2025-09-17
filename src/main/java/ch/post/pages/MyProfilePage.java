package ch.post.pages;

import static ch.post.locators.MyProfilePageLocators.*;
import static ch.post.pages.WelcomePage.getLanguageCode;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MyProfilePage {
    public void changeCorrespondenceLanguage(String language) {
        $(EDIT_CORRESPONDENCE_LANGUAGE).click();
        $(CORRESPONDENCE_LANGUAGE_OPTIONS).selectOptionByValue(getLanguageCode(language));
        $(USER_ACCOUNT_SETTINGS_SAVE_BUTTON).click();
    }

    public void verifyCorrespondenceLanguage(String language) {
        $(CORRESPONDENCE_LANGUAGE_VALUE).shouldHave(text(language));
    }
}