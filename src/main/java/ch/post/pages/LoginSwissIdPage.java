package ch.post.pages;

import static ch.post.locators.LoginSwissIdPageLocators.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginSwissIdPage {

    public void theUserLogsInWithSwissID(String userName, String password) {
        enterEmail(userName);
        enterPassword(password);
    }

    public void MaybeLaterForLoginWithoutPassword() {
        $x(MAYBE_LATER_BUTTON).click();
    }

    public void enterEmail(String userName) {
        $(EMAIL_INPUT).sendKeys(userName);
        $x(EMAIL_NEXT_BUTTON).click();
    }

    public void enterPassword(String password) {
        $x(PASSWORD_INPUT).sendKeys(password);
//        Selenide.sleep(5000);
        $x(PASSWORD_NEXT_BUTTON).click();
    }

    public void verifyInvalidEmailIcon() {
        $(INVALID_EMAIL_ICON).shouldBe(visible);
    }

    public void verifyErrorMessage(String errorMessage) {
        $(WRONG_PASSWORD_ERROR_MESSAGE).shouldHave(text(errorMessage));
    }
}