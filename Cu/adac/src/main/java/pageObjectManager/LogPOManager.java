package pageObjectManager;

import org.openqa.selenium.WebDriver;

import bookaHotelPom.BookHotelPom;
import confirmHotelPom.ConfirmHotelPom;
import loginPageObject.LogPOM;
import searchHotelPom.SearchHotelPom;

public class LogPOManager {
	public   WebDriver driver;
	private LogPOM loginpageinstance; //for class references------> "class" should be the return type(important)
	private SearchHotelPom searchHotelInstance;
	private ConfirmHotelPom confirmSelectedHotelInstance;
	private BookHotelPom bookHotelInstance;
	
	
	public LogPOManager(WebDriver driver) {
		this.driver=driver;
		
	}
	public LogPOM getInstance() {
		//System.out.println("2nd driver"+driver);
		loginpageinstance=new LogPOM(driver);
		return loginpageinstance; // this will be returned to the logpom loginpageinstance which is in private 
	}
	public SearchHotelPom getSearchHotelInstance() {
		//System.out.println("2ns driver"+driver);
		searchHotelInstance=new SearchHotelPom(driver);
		return searchHotelInstance;
	}
	
	
	public  ConfirmHotelPom getConfirmHotelInstance() {
		confirmSelectedHotelInstance=new ConfirmHotelPom(driver);
		return confirmSelectedHotelInstance;
	}

	public BookHotelPom getBookHotelInstance() {
		bookHotelInstance=new BookHotelPom(driver);
		return bookHotelInstance;
		 
	}





}
