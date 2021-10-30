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

  Scenario: TC03_user_should_book_a_reservation
    Given user enters all required fields
    |idUser |idHotelRoom|price|dateStart |dateEnd   |adultAmount|childrenAmount|contactNameSurname|contactPhone  |contactEmail  |notes    |
    |manager|Ayse       |500  |11/08/2021|11/12/2021|2          |3             |test              |(999) 999-9999|test@gmail.com|test note|
    And user clicks on the approved_checkbox
    And user clicks on the paid_checkbox
    And user clicks on the save_button
    Then user verifies the success_message
