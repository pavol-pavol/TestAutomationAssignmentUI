package ch.post.driver;


import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;


public class Driver {

    public static void open() {
        ChromeOptions webDriverConfiguration = setExecutionConfiguration();
        ChromeDriver driver = new ChromeDriver(webDriverConfiguration);
        driver.manage().window().maximize();
        setWebDriver(driver);

        Configuration.timeout = 10000;
        closeWebDriver();
    }

    private static ChromeOptions setExecutionConfiguration() {
        ChromeOptions webDriverConfiguration = new ChromeOptions();

        webDriverConfiguration.setEnableDownloads(true);
        webDriverConfiguration.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        webDriverConfiguration.addArguments("--disable-search-engine-choice-screen");

        List<String> experimentalFlags = new ArrayList<>();
        HashMap<String, Object> chromeStatePreferences = new HashMap<>();
        HashMap<String, Object> chromePreferences = new HashMap<>();

        experimentalFlags.add("same-site-by-default-cookies@2");
        chromeStatePreferences.put("browser.enabled_labs_experiments", experimentalFlags);
        chromePreferences.put("profile.managed_default_content_settings.notifications", 1);
        chromePreferences.put("profile.default_content_setting_values.automatic_downloads", 1);

        webDriverConfiguration.setCapability("unhandledPromptBehavior", "ignore");
        webDriverConfiguration.setExperimentalOption("prefs", chromePreferences);
        webDriverConfiguration.setExperimentalOption("localState", chromeStatePreferences);
        webDriverConfiguration.addArguments(
                "--disable-blink-features=AutomationControlled",
                "--disable-web-security",
                "--remote-allow-origins=*"
        );

        return webDriverConfiguration;
    }
}
