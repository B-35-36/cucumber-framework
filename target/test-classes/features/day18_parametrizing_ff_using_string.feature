@parameterized_google_search
Feature: Google_Search_Functionality
  Scenario: TC01_iPhone_search

    Given user is on the google page
    And user search for "iPhone"
    Then verify the result has "iPhone"
    Then close the application

  Scenario: TC02_teapot_search
    Given user is on the google page
    And user search for "tea pot"
    Then verify the result has "tea pot"
    Then close the application

  Scenario: TC03_flower_search
    Given user is on the google page
    And user search for "flower"
    Then verify the result has "flower"
    Then close the application

  Scenario: TC04_tesla_search
    Given user is on the google page
    And user search for "tesla"
    Then verify the result has "tesla"
    Then close the application

  Scenario: TC05_bmw_search
    Given user is on the google page
    And user search for "bmw"
    Then verify the result has "bmw"
    Then close the application

  Scenario: TC06_buick_search
    Given user is on the google page
    And user search for "buick"
    Then verify the result has "buick"
    Then close the application