package ch.post.stepDefinition;

import ch.post.driver.Driver;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.selenide.AllureSelenide;

public class Hook {

    @Before(order = 0)
    public void setUp(Scenario scenario) {
        Driver.open();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false)
        );
    }

    @After(order = 2)
    public void tearDown() {
        WebDriverRunner.getWebDriver().quit();
    }
}