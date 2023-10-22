package backGroundstepdefetions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import baseClass.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjectManager.LogPOManager;

public class BackGrounStepdefe extends BaseClass{
	public static WebDriver driver;
	public static LogPOManager pom = new LogPOManager(driver);
	@After
	public void quit() {
		driver.close();
	}
	@Given("user lauches the required webBrowser")
	public void userLauchesTheRequiredWebBrowser() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\macky\\eclipse-workspace\\Cu\\adac\\edgedriver_win64 (1)\\msedgedriver.exe");
		driver = new EdgeDriver();
	   
	}

	@Given("user enters the hompage url")
	public void userEntersTheHompageUrl() {
		driver.get("https://adactinhotelapp.com/");

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




	@Given("user should give invalid username")
	public void userShouldGiveInvalidUsername() {
		sendkey(pom.getInstance().getUsername(), "sanjio");
	
	}

	@Given("user should give invalid password")
	public void userShouldGiveInvalidPassword() {
		sendkey(pom.getInstance().getPassword(), "1234565");
	
	}

	@When("the login should be unsuccessful")
	public void theLoginShouldBeUnsuccessful() {
		clickOnElement(pom.getInstance().getLogin());
		
	  
	}
	

	
	

	@When("the login should be")
	public void theLoginShouldBe() {
	 System.out.println("logion succesful");
	}
	


}
