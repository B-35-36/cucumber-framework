@google_search
Feature: Google_Search_Functionality
#    Describe the behaviour
#    Given should be used as a preconditions.Usually Given is used in the first Step
#    Then should be used for verification.Usually it is used at the end
#    And and When is used in teh middle steps to describe actions
#    Scenario: Test Case = Test Scenario
  Scenario: TC01_iPhone_search

    Given user is on the google page
    And user search for iPhone
    Then verify the result has iPhone
    Then close the application


  Scenario: TC02_teapot_search
    Given user is on the google page
    And user search for tea pot
    Then verify the result has tea pot
    Then close the application

#  Write 2 more test cases in this file
#  TC03_flower search and verify if the result has flower related stuff
#  TC04_tesla search and verify if the result has tesla related stuff
#  make sure to use reusable methods for step 1 and step 4
  Scenario: TC03_flower_search
    Given user is on the google page
    And user search for flower
    Then verify the result has flower
    Then close the application

  Scenario: TC04_tesla_search
    Given user is on the google page
    And user search for tesla
    Then verify the result has tesla
    Then close the application
