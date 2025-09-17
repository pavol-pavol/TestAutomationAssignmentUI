package ch.post.stepDefinition;

import ch.post.pages.LoginSwissIdPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSwissIdPageSteps {
    private final LoginSwissIdPage loginSwissIdPage = new LoginSwissIdPage();

    @When("the user logs in with SwissID using {string} and {string}")
    public void theUserLogsInWithSwissIDUsingAnd(String userName, String password) {
        loginSwissIdPage.theUserLogsInWithSwissID(userName, password);
    }

    @And("the user chooses Maybe later for login without password")
    public void theUserChoosesMaybeLaterForLoginWithoutPassword() {
        loginSwissIdPage.MaybeLaterForLoginWithoutPassword();
    }

    @Then("the use enters wrong email {string}")
    public void theUseEntersWrongEmail(String wrongEmail) {
        loginSwissIdPage.enterEmail(wrongEmail);
    }

    @Then("invalid email icon is shown")
    public void invalidEmailIconIsShown() {
        loginSwissIdPage.verifyInvalidEmailIcon();
    }


    @Then("{string} is shown")
    public void isShown(String errorMessage) {
        loginSwissIdPage.verifyErrorMessage(errorMessage);
    }
}
