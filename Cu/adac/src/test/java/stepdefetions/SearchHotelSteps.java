package stepdefetions;

import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectManager.LogPOManager;

public class SearchHotelSteps extends BaseClass {

	public WebDriver driver = BaseClass.driver;
	LogPOManager pom = new LogPOManager(driver);

	@Given("user selects the location of the hotel")
	public void userSelectsTheLocationOfTheHotel() {
		System.out.println("1stgiven" + driver);
		select(pom.getSearchHotelInstance().getLocation(), 2);
	}

	@Given("user selects the hotel")
	public void userSelectsTheHotel() {

		select(pom.getSearchHotelInstance().getHotels(), 3);
	}

	@Given("user selects the roomtype")
	public void userSelectsTheRoomtype() {
		select(pom.getSearchHotelInstance().getRoomType(), 4);
	}

	@Given("user selects the number of rooms")
	public void userSelectsTheNumberOfRooms() {
		select(pom.getSearchHotelInstance().getNumberOfRooms(), 4);

	}

	@Given("user enters the check in date")
	public void userEntersTheCheckInDate() {
		sendkey(pom.getSearchHotelInstance().getChechInDate(), "23/09/2023");

	}

	@Given("user enters the check out date")
	public void userEntersTheCheckOutDate() {
		sendkey(pom.getSearchHotelInstance().getCheckOutDate(), "28/09/2023");

	}

	@Given("user selects the adults per room")
	public void userSelectsTheAdultsPerRoom() {
		select(pom.getSearchHotelInstance().getAdultsPerRoom(), 2);

	}

	@Given("user selects the child per room")
	public void userSelectsTheChildPerRoom() {
		select(pom.getSearchHotelInstance().getChildPerRoom(), 2);

	}

	@When("user clicks the search button")
	public void userClicksTheSearchButton() {
		clickOnElement(pom.getSearchHotelInstance().getSeachButton());

	}

	@Then("user should navigate to next page")
	public void userShouldNavigateToNextPage() {
		System.out.println("user sucessfully clicked on search button and navigated to next page");

	}

}
