package ch.post.locators;

public interface WelcomePageLocators {
    String ACCEPT_ALL_COOKIES_BUTTON = "[data-testid='uc-accept-all-button']";
    String LOGIN_BUTTON = "a[title='Login'][data-custom-focus-target='klp-widget'][role='button']";
    String LANGUAGE_DROPDOWN_BUTTON = "button.lang-btn";
    String LANGUAGE_OPTIONS = "nav.language-switch-dropdown.open a[lang='%s']";
}