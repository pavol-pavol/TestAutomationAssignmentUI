package ch.post.stepDefinition;

import ch.post.pages.WelcomePage;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class WelcomePageSteps {

    private final WelcomePage welcomePage = new WelcomePage();

    @Given("the user navigates to Post.ch")
    public void theUserNavigatesToPostCh() {
        Selenide.open("https://www.post.ch");
        Selenide.webdriver().driver().getWebDriver().manage().window().maximize();
    }

    @When("^the user accepts all cookies$")
    public void acceptAllCookies() {
        welcomePage.clickAcceptAllCookies();
    }

    @When("the user clicks on login button")
    public void theUserClicksOnLoginButton() {
        welcomePage.clickOnLoginButton();
    }

    @And("the use set language to {string}")
    public void theUseSetLanguageTo(String language) {
        welcomePage.setLanguage(language);
    }

}
