@YourCommunity
Feature: Your community page feature
  As a user I want to navigate to your community page into watford community website


  Scenario: User should navigate to your community page successfully
    Given I am on home page
    When I click on close button
    And I click on your community page link
    Then I should navigate to your community page successfully

    Scenario: User should navigate to our community work page successfully
      Given I am on home page
      When I click on close button
      And I click on your community page link
      And I click on our community work tab
      Then I should navigate to our community work page