Feature: Adactin hotel app booking system

  @login @searchhotel
  Scenario: user Should be able to click on the login button
    Given user should enter the adactin webpage
    Given user should give username
    Given user should give password
    When user clicks on login button
    Then the login should be successful

  #
  #Scenario: user Should be able to click on the login button unsucessfully
  #Given user should enter the adactin webpage
  #Given user should give invalid username
  #Given user should give invalid password
  #When user clicks on login button
  #But the login should be unsuccessful
  #@login @searchhotel
  Scenario: user searches for hotel and fills all the mandotory details and clicks on search button
    Given user selects the location of the hotel
    Given user selects the hotel
    Given user selects the roomtype
    Given user selects the number of rooms
    Given user enters the check in date
    Given user enters the check out date
    Given user selects the adults per room
    Given user selects the child per room
    When user clicks the search button
    Then user should navigate to next page

  @login @searchhotel
  Scenario: user confims the selected hotel and details
    Given user clicks on the select radio button
    When user clicks the continue button
    Then the hotel is selected successfully

  Scenario: user Successfully clicks the booknow button
    Given user enters the first name
    Given user enters the last name
    Given user enters the billing address
    Given user enters creditcardnumber
    Given user selects creditcardtype
    Given user selects expirydate
    Given user selects expiry year
    Given user enters cvv number
    When user clicks in the booknow button
    Then user clicked the Booknow button successfully
