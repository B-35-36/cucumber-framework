@login_test
Feature: Login_Functionality_With_Right_Credentials
  @manager_login_test
  Scenario Outline: login_with_manager_credentials
    Given user is on the application page
    And user enters manager id "<manager_id>"
    And user enters manager password "<manager_password>"
    When user clicks on the login button
    Then verify the "<default_page_ID>" is displayed
    Then close the application

    Examples: manager_data
    |manager_id|manager_password|default_page_ID|
    |manager   |Manager1!       |manager        |
    |manager2  |Manager2!       |manager2       |
    |manager3  |Manager3!       |manager3       |


#    TEST USING ADMIN CREDENTIALS
#    admin    |  Techproed123!
#  YOU SHOULD NOT CREATE A NEW JAVA CODE
#  Is it possible to use more than one Scenario: in single feature file?
#  Answer : YES
#  Is it possible to use more than one Scenario Scenario Outline: in single feature file?
#  YES
#  Is it possible to use Scenario: and Scenario Outline: in the same feature file?
#  YES
  @admin_login_test
  Scenario Outline: login_with_admin_credentials

    Given user is on the application page
    And user enters manager id "<admin_id>"
    And user enters manager password "<admin_password>"
    When user clicks on the login button
    Then verify the "<default_page_ID>" is displayed
    Then close the application


    Examples: admin_data
      |admin_id    |admin_password  |default_page_ID|
      |admin       |Techproed123!    |admin          |
#    This is failed to test screenshot. Correct password:Techproed123!
#    When this test case fails, we should see the screenshot is attached to the HTLM report





