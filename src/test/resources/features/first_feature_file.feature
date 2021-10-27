@google_search
Feature: Google_Search_Functionality

  Background: Navigating_to_the_page
    Given user is on the google page

  @smoke @regression
  Scenario: TC01_iPhone_search
    And user search for iPhone
    Then verify the result has iPhone
    Then close the application

  @teapot @smoke @regression
  Scenario: TC02_teapot_search
    And user search for tea pot
    Then verify the result has tea pot
    Then close the application

#  Write 2 more test cases in this file
#  TC03_flower search and verify if the result has flower related stuff
#  TC04_tesla search and verify if the result has tesla related stuff
#  make sure to use reusable methods for step 1 and step 4
  Scenario: TC03_flower_search
    And user search for flower
    Then verify the result has flower
    Then close the application
  @smoke @tesla
  Scenario: TC04_tesla_search
    And user search for tesla
    Then verify the result has tesla
    Then close the application
