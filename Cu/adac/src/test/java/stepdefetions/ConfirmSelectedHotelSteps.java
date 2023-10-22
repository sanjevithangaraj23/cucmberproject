package stepdefetions;

import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectManager.LogPOManager;

public class ConfirmSelectedHotelSteps extends BaseClass {
	public static WebDriver driver = BaseClass.driver;
	LogPOManager pom = new LogPOManager(driver);

	@Given("user clicks on the select radio button")
	public void userClicksOnTheSelectRadioButton() {
		System.out.println("driver");
		clickOnElement(pom.getConfirmHotelInstance().getSelectButton());
	}

	@When("user clicks the continue button")
	public void userClicksTheContinueButton() {
		clickOnElement(pom.getConfirmHotelInstance().getContinueButton());

	}

	@Then("the hotel is selected successfully")
	public void theHotelIsSelectedSuccessfully() {
		System.out.println("THE USER SUCCEFULLY CLICKED THE CONTINUE BUTTON");

	}

}
