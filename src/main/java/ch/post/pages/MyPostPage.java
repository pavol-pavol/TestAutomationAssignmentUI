package ch.post.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ex.ElementNotFound;
import com.codeborne.selenide.ex.ElementShould;

import java.time.Duration;

import static ch.post.locators.MyPostPageLocators.*;
import static com.codeborne.selenide.Selectors.shadowDeepCss;
import static com.codeborne.selenide.Selenide.$;

public class MyPostPage {

    public void verifySuccessfulLogin(String user) {

        $(WELCOME_USER_NAME).shouldHave(Condition.text(user));

        // Verify that widget have class authenticated
        try {
            $(shadowDeepCss(AUTHENTICATED_WIDGET_ICON)).should(Condition.exist, Duration.ofSeconds(3));
        } catch (ElementNotFound e) {
            $(shadowDeepCss(LOGIN_BUTTON)).click();
            $(shadowDeepCss(AUTHENTICATED_WIDGET_ICON)).should(Condition.exist, Duration.ofSeconds(3));
        }
    }

    public void clickProfileIcon() {
        $(shadowDeepCss(PROFILE_ICON)).click();
    }

    public void clickMyProfileAnchor() {
        try {
            $(shadowDeepCss(MY_PROFILE_ANCHOR)).click();
        }catch (ElementShould e){
            $(shadowDeepCss(PROFILE_ICON)).click();
            $(shadowDeepCss(MY_PROFILE_ANCHOR)).click();
            System.out.println("++++");
        }
    }
}
