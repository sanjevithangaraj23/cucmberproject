Feature: Login page Scenarios

    Background: user is lauching the webBrowser
    Given user lauches the required webBrowser
    Given user enters the hompage url
    
Scenario: user is entering valid credentials
 Given user should enter the adactin webpage
    Given user should give username
    Given user should give password
    When user clicks on login button
    Then the login should be successful

  
  Scenario: user Should be able to click on the login button unsucessfully
  Given user should enter the adactin webpage
  Given user should give invalid username
  Given user should give invalid password
  When user clicks on login button
  But the login should be 

  
