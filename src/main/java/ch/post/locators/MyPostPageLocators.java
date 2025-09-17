package ch.post.locators;

public interface MyPostPageLocators {
    String WELCOME_USER_NAME = "h2.cockpit--welcome > span.fw-light";
    String AUTHENTICATED_WIDGET_ICON = "#post-klp-login-widget div.klp-widget-authenticated";
    String LOGIN_BUTTON = "a[title='Login'][data-custom-focus-target='klp-widget'][role='button']";
    String PROFILE_ICON = "a.klp-widget-authenticated-session-link.klp-widget__user";
    String MY_PROFILE_ANCHOR = "a.notification-link[href*='/selfadmin/?']";
}