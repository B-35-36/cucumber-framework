Feature: Google Search Functionality

  Scenario: TC01_iPhone search

#    Describe the behaviour
    Given user in on the google page
    And user search for iPhone
    Then verify the result has iPhone
    Then close the application