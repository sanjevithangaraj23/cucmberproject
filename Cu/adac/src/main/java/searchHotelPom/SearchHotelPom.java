package searchHotelPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPom {
	public WebDriver driver;
	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(id = "room_type")
	private WebElement roomType;
	@FindBy(id = "room_nos")
	private WebElement numberOfRooms;
	@FindBy(id = "datepick_in")
	private WebElement chechInDate;
	@FindBy(id = "datepick_in")
	private WebElement checkOutDate;
	@FindBy(id = "adult_room")
	private WebElement adultsPerRoom;
	@FindBy(id = "child_room")
	private WebElement childPerRoom;
	@FindBy(id = "Submit")
	private WebElement seachButton;

	public SearchHotelPom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}

	public WebElement getChechInDate() {
		return chechInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	public WebElement getSeachButton() {
		return seachButton;
	}

}
