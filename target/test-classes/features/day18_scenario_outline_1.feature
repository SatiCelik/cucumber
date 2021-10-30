@scenario_outline_google_search
Feature: Google_Search_Functionality

  Scenario Outline: TC01_Scenario_Outline_Google_Search


    Given user is on the google page
    And user search for "<item>"
    Then verify the result has "<item>"
    Then close the application

    # ctrl + alt + L in Windows
    Examples:
      | item    |
      | iPhone  |
      | tea pot |
      | flower  |
      | bmw     |
      | seat    |


