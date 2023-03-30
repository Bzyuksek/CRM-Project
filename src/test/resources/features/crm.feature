
@AGL-405
Feature: Send a message
@AGL-403
  Scenario: Send a message functionality
    Given User is CRM activity stream page
    When User clicks message button
    And User types Text on message menu
    And User click send button
    Then User sees own message

@AGL-404
    Scenario: Upload a file
      Given User is CRM activity stream page
      When User clicks Upload files button
      And User sees Upload files send images and selects files
      Then User clicks send button and uploads own files
