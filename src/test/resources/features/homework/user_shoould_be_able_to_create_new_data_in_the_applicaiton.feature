@data_tables_hw
Feature: scenario_outline
  @scenario_outline_data_tables
  Scenario Outline: TC01_Testing_the_data_tables_web_page
    Given user is on the datatables page
    And user clicks on the new button
    When user enters the firstname "<firstname>"
    And user enters the lastname "<lastname>"
    And user enters the position "<position>"
    When user enters the office "<office>"
    When user enters the extension "<extension>"
    When user enters the startdate "<start_date>"
    When user enters the salary "<salary>"
    And user clicks on the create button
    And search for the first name "<firstname>"
    Then verify the name fields contains first name "<firstname>"
    Then close the application

    Examples: test data for the data table test
      | firstname | lastname | position | office        | extension | start_date  | salary     |
      | john      | walker   | doctor   | LA            | 456       | 2022-10-10 | 78900       |
      | ihsan     | kim      | nurse    | TX            | 899       | 2022-10-11 | 789000009  |
      | Jim       | cam      | qa       | AR            | 23462     | 2022-10-12 | 789000006  |
      | Betty     | york     | lawyer   | NY            | 5613      | 2022-10-13 | 6100000    |
      | Sue       | Lui      | dev      | CA            | 400       | 2022-10-14 | 10000000   |

  @datatables_data_table
  Scenario: Creating a table using Data Table
    Given user is on the datatables page
    And user enters all table required fields and verifies the data creation
      |firstname  |lastname  |position  |office         |extension  |start_date   |salary      |
      | Tim       | walker   | doctor   | LA            | 456       | 2022-10-10 | 78900      |
      | ihsan     | kim      | nurse    | TX            | 899       | 2022-10-11 | 7890009    |
      | Jim       | cam      | qa       | AR            | 23462     | 2022-10-12 | 7890000    |
      | Betty     | york     | lawyer   | NY            | 5613      | 2022-10-13 | 6100000    |
      | Sue       | Lui      | dev      | CA            | 400       | 2022-10-14 | 10000000   |
    And close the application

  @excel_data_tables
  Scenario: Creating a table using excel
    Given user is on the datatables page
    And user enters all table required fields and verifies the data creation with "data_tables_sheet"
    And close the application


