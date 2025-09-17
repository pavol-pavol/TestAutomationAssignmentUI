package ch.post.locators;

public interface LoginSwissIdPageLocators {
    String MAYBE_LATER_BUTTON = "//button[@id='register-passkey-left-button']";
    String EMAIL_INPUT = "#email";
    String EMAIL_NEXT_BUTTON = "//button[@id='login-email']";
    String PASSWORD_INPUT = "//input[@id='password']";
    String PASSWORD_NEXT_BUTTON = "//button[@id='login-password']";
    String INVALID_EMAIL_ICON = "#login-email .input_filled.invalidFeedbackActive";
    String WRONG_PASSWORD_ERROR_MESSAGE = "#form-error-authenticationError > p";
}
