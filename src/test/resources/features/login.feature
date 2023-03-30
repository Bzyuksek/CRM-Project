
Feature: CRM application login feature
  User Story:
  As a user, I should be able to login with correct credentials.

  Account is: hr

  Scenario: Login as hr

  @hr
  Scenario: Login as hr
  Given I am on login page
    When user login as hr
    Then user should see the dashboard