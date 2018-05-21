Feature: City input field and 5 day forecast

  As a user, I want to enter a city name so that I can view a 5 day forecast for that location

  Scenario Outline: Enter valid city name and check a 5 day forecast is created
    Given I am on the forecast page
    When I enter the city name "<cityName>"
    Then a 5 day forecast will be displayed

    Examples:
    |cityName|
    |Edinburgh|
    |Dundee|
    |Aberdeen|
    |gLaSgOw|

  Scenario Outline: Enter Invalid city name and check error occurs
    Given I am on the forecast page
    When I enter the city name "<cityName>"
    Then a error message is displayed

    Examples:
      |cityName|
      |Arakis  |
      |12345   |
      |Edin Burgh|


