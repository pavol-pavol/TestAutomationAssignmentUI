Feature: Manage account settings with SwissID

  Background:
    Given the user navigates to Post.ch
    And the user accepts all cookies

  Scenario Outline: Login with SwissID and update profile settings
    Given the use set language to "<page_language>"
    When the user clicks on login button
    Then the user logs in with SwissID using "<email>" and "<password>"
    And the user chooses Maybe later for login without password
    #And the user dismisses the first-time tutorial
    Then the "<user>" should be successfully logged in
    When the user opens the profile page
    And the user changes the correspondence language to "<correspondence_language>"
    Then the correspondence language should be updated to "<correspondence_language>"

    Examples:
      | page_language | email                  | password             | user          | correspondence_language |
      | English       | jozz.horvath@gmail.com | mynryg-rosXor-1sitpa | jozef horvath | German                  |
      | English       | jozz.horvath@gmail.com | mynryg-rosXor-1sitpa | jozef horvath | Italian                 |
      | Italian       | jozz.horvath@gmail.com | mynryg-rosXor-1sitpa | jozef horvath | Inglese                 |


  @negative
  Scenario Outline: Login attempt with invalid email
    Given the use set language to "<page_language>"
    When the user clicks on login button
    Then the use enters wrong email "<email>"
    Then invalid email icon is shown

    Examples:
      | page_language | email       |
      | English       | wrong@wrong |


  @negative
  Scenario Outline: Login attempt with invalid password
    Given the use set language to "<page_language>"
    When the user clicks on login button
    Then the user logs in with SwissID using "<email>" and "<password>"
    Then "<error_message>" is shown

    Examples:
      | page_language | email                   | password       | error_message                                                 |
      | English       | jozzz.horvath@gmail.com | wrong-password | The details you have entered are incorrect. Please try again. |
      | Italian       | jozzz.horvath@gmail.com | wrong-password | The details you have entered are incorrect. Please try again. |
