package confirmHotelPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmHotelPom {
	public WebDriver driver;
	@FindBy(id = "radiobutton_0")
	private WebElement selectButton;

	@FindBy(id = "continue")
	private WebElement continueButton;

	public ConfirmHotelPom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement getSelectButton() {
		return selectButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}
}
