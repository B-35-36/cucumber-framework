@room_reservation
Feature: FE1009_Room_Reservation

  Scenario: TC01_user_should_login_with_manager_profile
    Given user is on the application page
    And user enters manager_id and manager_password
    |manager|Manager1!|
    When user clicks on the login button
    Then verify the "manager" is displayed

  Scenario: TC02_user_should_navigate_room_reservation_page
    Given user navigates to the create_room_reservation page
