$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/featurefiles/log.feature");
formatter.feature({
  "name": "Adactin hotel app booking system",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user Should be able to click on the login button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@searchhotel"
    }
  ]
});
formatter.step({
  "name": "user should enter the adactin webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "loginSteps.userShouldEnterTheAdactinWebpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should give username",
  "keyword": "Given "
});
formatter.match({
  "location": "loginSteps.userShouldGiveUsername()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should give password",
  "keyword": "Given "
});
formatter.match({
  "location": "loginSteps.userShouldGivePassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "loginSteps.userClicksOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the login should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "loginSteps.theLoginShouldBeSuccessful()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user searches for hotel and fills all the mandotory details and clicks on search button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@searchhotel"
    }
  ]
});
formatter.step({
  "name": "user selects the location of the hotel",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchHotelSteps.userSelectsTheLocationOfTheHotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the hotel",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchHotelSteps.userSelectsTheHotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the roomtype",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchHotelSteps.userSelectsTheRoomtype()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the number of rooms",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchHotelSteps.userSelectsTheNumberOfRooms()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the check in date",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchHotelSteps.userEntersTheCheckInDate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the check out date",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchHotelSteps.userEntersTheCheckOutDate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the adults per room",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchHotelSteps.userSelectsTheAdultsPerRoom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the child per room",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchHotelSteps.userSelectsTheChildPerRoom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the search button",
  "keyword": "When "
});
formatter.match({
  "location": "SearchHotelSteps.userClicksTheSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should navigate to next page",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchHotelSteps.userShouldNavigateToNextPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user confims the selected hotel and details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@searchhotel"
    }
  ]
});
formatter.step({
  "name": "user clicks on the select radio button",
  "keyword": "Given "
});
formatter.match({
  "location": "ConfirmSelectedHotelSteps.userClicksOnTheSelectRadioButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the continue button",
  "keyword": "When "
});
formatter.match({
  "location": "ConfirmSelectedHotelSteps.userClicksTheContinueButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the hotel is selected successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "ConfirmSelectedHotelSteps.theHotelIsSelectedSuccessfully()"
});
formatter.result({
  "status": "passed"
});
});