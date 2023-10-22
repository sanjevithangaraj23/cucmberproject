package loginPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogPOM {
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;  //for webelements references ------>>>>"webelements" should be the return type
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement login;
	
	
	public LogPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		

	public WebElement getUsername() {
		return username;//this will be returned to the webelement username which is in private //within that username only locator id is there
	}//so now getusername method will have the username that is xpath or locaror id



	public WebElement getPassword() {
		return password;
	}



	public WebElement getLogin() {
		return login;
	}



	

//	public WebElement getUsername() {
//		
//		return username;
//	}
//	public WebElement getPassword() {
//		return password;
//	}
//	public WebElement getLogin() {
//		return login;
//	}
	
	
//public void getUsername(String username) {
//	this.username=username;
//	
//	PageFactory.initElements(null, username);
//}


}
