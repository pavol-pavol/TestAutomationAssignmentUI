package ch.post.stepDefinition;

import ch.post.pages.MyProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MyProfilePageSteps {
    private final MyProfilePage myProfilePage = new MyProfilePage();

    @And("the user changes the correspondence language to {string}")
    public void theUserChangesTheCorrespondenceLanguageTo(String language) {
        myProfilePage.changeCorrespondenceLanguage(language);
    }

    @Then("the correspondence language should be updated to {string}")
    public void theCorrespondenceLanguageShouldBeUpdatedTo(String language) {
        myProfilePage.verifyCorrespondenceLanguage(language);
    }
}
