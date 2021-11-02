@scenario_outline_capital_search
Feature: capital_search_feature

  Scenario Outline: capital_search_scenario

    Given user is on the google page
    And user search for "<world_capitals>"
    Then verify the result has "<world_capitals>"
    Then close the application

    Examples: Test Data
      | world_capitals |
      | London         |
      | Paris          |
      | Vienna         |
      | Berlin         |
      | Madrid         |

#When user search for the following capitals: London, Paris, Vienna, Berlin, Madrid
#Then verify the the result includes the the searched values
