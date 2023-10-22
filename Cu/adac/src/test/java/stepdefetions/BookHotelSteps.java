package stepdefetions;

import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectManager.LogPOManager;

public class BookHotelSteps extends BaseClass {
	public static WebDriver driver = BaseClass.driver;
	LogPOManager pom = new LogPOManager(driver);

	@Given("user enters the first name")
	public void userEntersTheFirstName() {
		sendkey(pom.getBookHotelInstance().getFirstName(), "sanj");
	}

	@Given("user enters the last name")
	public void userEntersTheLastName() {

		sendkey(pom.getBookHotelInstance().getLastName(), "sanj");
	}

	@Given("user enters the billing address")
	public void userEntersTheBillingAddress() {
		sendkey(pom.getBookHotelInstance().getBillingAddress(), "sanj");
		javascriptexecutor();
	}

	@Given("user enters creditcardnumber")
	public void userEntersCreditcardnumber() {
		sendkey(pom.getBookHotelInstance().getCreditCardNo(), "1234567891234567");

	}

	@Given("user selects creditcardtype")
	public void userSelectsCreditcardtype() {
		select(pom.getBookHotelInstance().getCreditCardType(), 2);

	}

	@Given("user selects expirydate")
	public void userSelectsExpirydate() {
		select(pom.getBookHotelInstance().getExpiryDate(), 2);

	}

	@Given("user selects expiry year")
	public void userSelectsExpiryYear() {
		select(pom.getBookHotelInstance().getExpiryYear(), 2);
	}

	@Given("user enters cvv number")
	public void userEntersCvvNumber() {
		sendkey(pom.getBookHotelInstance().getCvvnumber(), "123");

	}

	@When("user clicks in the booknow button")
	public void userClicksInTheBooknowButton() {
		clickOnElement(pom.getBookHotelInstance().getBookNow());

	}

	@Then("user clicked the Booknow button successfully")
	public void userClickedTheBooknowButtonSuccessfully() {

	}

}
