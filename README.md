# Automation Assignment UI

This repository contains a **Cucumber + Selenide** automation framework for testing the login and profile management
features, including SwissID login and correspondence language updates. The framework is designed to be **readable,
maintainable, and scalable**, with proper page objects, locators, and step definitions.

---

## **Technologies Used**

* **Java 17+** – main programming language
* **Cucumber 7** – BDD framework for writing readable feature files
* **Selenide** – Selenium-based UI automation library
* **JUnit 4** – Test runner for executing Cucumber scenarios
* **Allure** – Reporting for detailed test execution results
* **ChromeDriver / ChromeOptions** – Browser automation
* **Maven** – Build and dependency management

---

## **Project Structure**

```
 src/
├─ main/
│  ├─ java/ch/post
│  │  ├─ driver/                      
│  │  │  └─ Driver.java                                 # WebDriver management
│  │  ├─ locators/                                      # Locators
│  │  │  ├─ LoginSwissIdPageLocators.java
│  │  │  ├─ MyPostPageLocators.java
│  │  │  ├─ MyProfilePageLocators.java
│  │  │  └─ WelcomePageLocators.java
│  │  └─ pages/                                         # Pages
│  │     ├─ LoginSwissIdPage.java
│  │     ├─ MyPostPage.java
│  │     ├─ MyProfilePage.java
│  │     └─ WelcomePage.java
│  └─ resources/                      
└─ test/
   ├─ java/ch/post/
   │  ├─ runner/
   │  │  └─ TestRunner.java                             # Test runner class
   │  └─ stepDefinition/                                # Step definitions
   │     ├─ Hook.java
   │     ├─ LoginSwissIdPageSteps.java
   │     ├─ MyPostPageSteps.java
   │     ├─ MyProfilePageSteps.java
   │     └─ WelcomePageSteps.java
   └─ resources/
      └─ features/
         └─ AccountLogin.feature                        # Cucumber feature file

target/                                                 # Build output and test reports
└─ allure-results/                                      # Generated test results after execution

```

* **Driver.java** – Configures ChromeDriver with custom ChromeOptions and Selenide settings.
* **Page Objects** – Encapsulate page actions and element locators (`WelcomePage`, `LoginSwissIdPage`, `MyPostPage`,
  `MyProfilePage`).
* **Step Definitions** – Maps Gherkin steps to Java methods.
* **Hooks** – Sets up and tears down WebDriver before/after scenarios.
* **Feature Files** – Define BDD scenarios for positive and negative login flows and profile settings.

---

## **Prerequisites**

* **Java 17+** installed
* **Maven 3+** installed
* **Chrome browser** installed (latest version recommended)
* **Internet access** to reach the page
* **Git** (for cloning the repository)
* (**Optional, for local report viewing**) **Allure CLI** installed – https://docs.qameta.io/allure/#_installing_a_commandline

---

## **Getting Started**

1. **Clone the repository**

```
git clone https://github.com/pavol-pavol/AutomationTestAssignmentUI.git
cd AutomationTestAssignmentUI
```

2. **Install dependencies using Maven**

```bash
mvn clean install
```


* Note: running mvn clean install will also compile the code, run all tests, and install the package to your local Maven repository.

3. **Run tests**

* Run all tests with Maven:

```bash
mvn clean test
```

* Run specific Cucumber features via IDE or TestRunner class (`TestRunner.java`).

4. **View Allure reports**

There are two options to view reports:

Serve the report using Maven (temporary local server):
```bash
mvn allure:serve
```

* Includes request/response attachments, JWT tokens, and failure screenshots.

Or generate a static HTML report (requires Allure CLI):

```
allure generate target/allure-results -o target/allure-report --clean
```

---

## **Test Scenarios**

### Positive flows

* SwissID login with valid credentials
* Profile page language change
* Verify successful login and language update

### Negative flows

* Login with invalid email
* Login with invalid password

---

## **Notes**

* The framework uses **Selenide Shadow DOM support** for interacting with widgets.
* Page objects follow **clean design patterns** for maintainability.
* Allure screenshots are automatically captured for failed steps.
* The framework is easily extendable for new scenarios.

---
