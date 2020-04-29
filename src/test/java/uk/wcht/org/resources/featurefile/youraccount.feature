@YourAccount
Feature: Your account page feature
  As a user I want to navigate to your account page into watford community website


  Scenario: User should navigate to your account page successfully
    Given I am on home page
    When I click on close button
    And I click on your account page link
    Then I should navigate to your account page successfully


  Scenario: User should navigate to create new account page successfully
    Given I am on home page
    When I click on close button
    And I click on your account page link
    And I click on create new account link
    Then I should navigate to register account page