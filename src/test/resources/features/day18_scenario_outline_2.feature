#When user search for the following capitals: London, Paris, Vienna, Berlin, Madrid
#Then verify the the result includes the searched values FF:

@scenario_outline_google_search_world_capital
Feature: Google_Search_Functionality

  Scenario Outline: TC01_Scenario_Outline_Google_Search_World_Capital


    Given user is on the google page
    And user search for "<world capitals>"
    Then verify the result has "<world capitals>"
    Then close the application

    Examples:
      | world capitals |
      | London         |
      | Paris          |
      | Vienna         |
      | Berlin         |
      | Madrid         |