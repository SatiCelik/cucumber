#Acceptance Criteria:
#Test Data:
#Url: https://qa-environment.resortsline.com/Account/Logon
@manager_login

Feature: US100450: User_Should_Login_Using_Manager_Credentials
  Scenario Outline: Login_With_Manager_Credentials
    Given user is on the application page
    And user enters manager id "<manager_id>"
    And user enters manager password "<manager_password>"
    When user clicks on the login button
    Then verify the "<default_page_id>" is displayed
    Then close the application
    Examples: manager_data
      | manager_id | manager_password | default_page_id |
      | manager    | Manager1!        | manager         |
      | manager2   | Manager2!        | manager2        |
      | manager3   | Manager3!        | manager3        |
  Scenario Outline: Login_With_Admin_Credentials
    Given user is on the application page
    And user enters manager id "<admin_id>"
    And user enters manager password "<admin_password>"
    When user clicks on the login button
    Then verify the "<default_page_id>" is displayed
    Then close the application
    Examples:  admin_data
      | admin_id       |admin_password         |default_page_id |
      | admin          | Techproed123!         | admin          |









