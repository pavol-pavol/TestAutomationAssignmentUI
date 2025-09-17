package ch.post.pages;

import static ch.post.locators.WelcomePageLocators.*;
import static com.codeborne.selenide.Selectors.shadowDeepCss;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.String.format;

public class WelcomePage {

    public void clickAcceptAllCookies() {
//        Selenide.sleep(5000);
        $(shadowDeepCss(ACCEPT_ALL_COOKIES_BUTTON)).click();
    }

    public void clickOnLoginButton() {
        $(shadowDeepCss(LOGIN_BUTTON)).click();
    }

    public void setLanguage(String language) {
        $(shadowDeepCss(LANGUAGE_DROPDOWN_BUTTON)).click();
        $(shadowDeepCss(format(LANGUAGE_OPTIONS, getLanguageCode(language)))).click();
    }

    public static String getLanguageCode(String language) {
        return switch (language) {
            case "German", "Deutsch", "Allemand", "Tedesco" -> "DE";
            case "English", "Englisch", "Anglais", "Inglese" -> "EN";
            case "French", "Französisch", "Français", "Francese" -> "FR";
            case "Italian", "Italienisch", "Italien", "Italiano" -> "IT";
            default -> "wrong language";
        };
    }
}

