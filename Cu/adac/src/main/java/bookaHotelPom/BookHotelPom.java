package bookaHotelPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPom {
	public WebDriver driver;
	@FindBy(id="first_name")
	private WebElement firstName;
	@FindBy(id="last_name")
	private WebElement lastName;
	public WebDriver getDriver() {
		return driver;
	}
	public BookHotelPom(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getBillingAddress() {
		return billingAddress;
	}
	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}
	public WebElement getCreditCardType() {
		return CreditCardType;
	}
	public WebElement getExpiryDate() {
		return ExpiryDate;
	}
	public WebElement getCvvnumber() {
		return cvvnumber;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	@FindBy(id="address")
	private WebElement billingAddress;
	@FindBy(id="cc_num")
	private WebElement CreditCardNo;
	@FindBy(id="cc_type")
	private WebElement CreditCardType;
	@FindBy(id="cc_exp_month")
	private WebElement ExpiryDate;
	@FindBy(id="cc_cvv")
	private WebElement cvvnumber;
@FindBy(id="book_now")
private WebElement bookNow;
@FindBy(id="cc_exp_year")
private WebElement expiryYear;
public WebElement getExpiryYear() {
	return expiryYear;
}
}

