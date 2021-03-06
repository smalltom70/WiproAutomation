Original Feature description

Enter city name, get 5 day weather forecast
Select day, get 3 hourly forecast
Select day again, hide 3 hourly forecast
Daily forecast should summarise the 3 hour data:
Most dominant (or current) condition
Most dominant (or current) wind speed and direction
Aggregate rainfall
Minimum and maximum temperatures
All values should be rounded down
-------------------------------------------------------------------------------------
Derived user stories

Epic
As a website user, I want to get a 5 day localised weather forecast by entering a city name so that I can plan time around the weather

Story
As a user, I want to enter a city name so that I can view a 5 day forecast for that location

As a user, I want to be able to click on a day so that I can toggle the 3 hour forecast view which would display summerised data Most dominant condition
most dominant wind velocity, Aggregate rainfall and  min/max temperatures with all values rounded down
-------------------------------------------------------------------------------------
Epic file
As a website user, I want to get a 5 day localised weather forecast by entering a city name so that I can plan time around the weather

Description:
This epic's purpose is to be able to display a 5 day weather forecast for various cities.  The city should be enterable by an input box which eventually
will be used to retrieve forecast data from an API.  However for the scope of this functionality test data has been provided so that page functionality
can be assessed.

Within the 5 day forecast there will be exapandable tabs that will further display data for forecasts in 3 hourly sets.  These tabs can be toggled to be
opened and closed.

Each 3 hourly forecast will display most dominant condition most dominant wind velocity, Aggregate rainfall and  min/max temperatures with all values rounded down

-------------------------------------------------------------------------------------
Story file
-------------------------------------------------------------------------------------
Story 1
As a user, I want to enter a city name so that I can view a 5 day forecast for that location

Description:

An input text box should be placed somewhere on the page - However no indication or mock-ups have been provided for design.

The user will then be able to enter a city name exactly to retrieve forecast data for the city.  There has been no indication of any search facility so the
city search string needs to be exact.

An API will be used to retreive the data however for the scope of this functionality we are using test-data

In terms of error messaging no design indication has been made.

This should be clarified with the product owner.

Acceptence Tests:

Given I am on the Forecast page
When I enter a valid city name
Then a 5 day forecast will be displayed for that city

Given I am on the Forecast page
When I enter an invalid city name
Then a error message is displayed

-------------------------------------------------------------------------------------
Story 2
As a user, I want to be able to click on a day so that I can toggle the 3 hour forecast view which would display summerised data Most dominant condition
most dominant wind velocity, Aggregate rainfall and  min/max temperatures with all values rounded down

Description:

The forecast page will display the city forecast data for the next five days.  Each day tab displays the overal weather forecast for the day.
Also if a day is clicked data for 3 hour periods will be displayed for the rest of the day.

Data displayed should be the following:
Most dominant (or current) condition
Most dominant (or current) wind speed and direction
Aggregate rainfall
Minimum and maximum temperatures
All values should be rounded down

We will not be using live data, which would normally be from http://openweathermap.org/forecast5.  For testing this functionality test data provided will
be used.



Clarifications needed from stake holder:

If a day tab is clicked then a different day tab is clicked then what would be the expected result.


Acceptence tests

Given I am on the forecasts page
When I click on a specific day tab
Then 3 hourly forecast data is displayed

Given I am on the forecasts page
And the day tab for a specific day is displayed
When I click on the specific day tab
Then 3 hourly forecast data is displayed

Given I am on the forecasts page
When I click on a specific day tab
The 3 hourly forecast displays the correct fields

Given I am on the forecasts page
When I click on a specific day tab
Then the forecast data is correctly rounded down

--------------------------------------------------------------------------------------------------------------------------
What else I would like to acheive

Comment:
Since Java was expected as the program language I found that at the start of the exercise it was quite slow for me.
I have used Java based automation previously however I haven't setup a framework from the ground up.  At the end of the
excercise I was making much quicker progress and would have completed all the within couple hours.

Saying that I was only able to implement two tests.

- Implement other tests
- Implement Logger class
- Log better errors upon failures indicating issues


- Provide support for multiple browsers
- Be more OS agnostic
- Better organise files.

------------------------------------------------------------------------------------------------------------------------
How to build

- Download chrome
- Clone repo
- install jdk
- install maven
- open cmdd in root of folder
- run "maven test"
- Will not work on OS