package stepdefetions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import baseClass.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.Hooks;
import pageObjectManager.LogPOManager;

public class loginSteps extends BaseClass {
	// public static WebDriver driver= BaseClass.launchBrowser("edge");

	public static WebDriver driver = BaseClass.launchBrowser("edge");

	public static LogPOManager pom = new LogPOManager(driver);

	@Given("user should enter the adactin webpage")
	public void userShouldEnterTheAdactinWebpage() {

		driver.get("https://adactinhotelapp.com/");
		System.out.println("Adactinpage opened1111");
	}

	@Given("user should give username")
	public void userShouldGiveUsername() {
		sendkey(pom.getInstance().getUsername(), "sanjevit");
	}

	@Given("user should give password")
	public void userShouldGivePassword() {
		sendkey(pom.getInstance().getPassword(), "123456789");

	}

	@When("user clicks on login button")
	public void userClicksOnLoginButton() {
		clickOnElement(pom.getInstance().getLogin());
	}

//
	@Then("the login should be successful")
	public void theLoginShouldBeSuccessful() throws IOException {
		screenshot("noe");
		System.out.println("LOGIN PAGE OPENED SUCCESSFULLY");

	}
//
//	@Given("user should give  wrong username")
//	public void userShouldGiveWrongUsername() {
//		System.out.println("sdjisajd");
//	}
//
//	@Given("user should give wrong password")
//	public void userShouldGiveWrongPassword() {
//		System.out.println("cdjdcjd");
//
//	}
//
//	@When("user clicks the login button")
//	public void userClicksTheLoginButton() {
//		System.out.println("sdckjdk");
//
//	}
//
//	@Then("the login should be failed")
//	public void theLoginShouldBeFailed() {
//		System.out.println("sadjjd");
//	}

}
