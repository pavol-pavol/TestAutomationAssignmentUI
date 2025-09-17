package ch.post.stepDefinition;

import ch.post.pages.MyPostPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyPostPageSteps {
    private final MyPostPage myPostPage = new MyPostPage();

    @Then("the {string} should be successfully logged in")
    public void theShouldBeSuccessfullyLoggedIn(String user) {
        myPostPage.verifySuccessfulLogin(user);
    }

    @When("the user opens the profile page")
    public void theUserOpensTheProfilePage() {
        myPostPage.clickProfileIcon();
        myPostPage.clickMyProfileAnchor();
    }
}
