package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import baseClass.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {

	@Before(order=2)
	public static void launchBrowser() {
	
		
			System.out.println("BeforeScenario");

		

	

	}
	@Before(order=1)
	public static void launchBrowser2() {
	
		
			System.out.println("BeforeScenario2");

		

	

	}
	@Before(order=0)
	public static void launchBrowser3() {
	
		
			System.out.println("BeforeScenario3");

		

	

	}
	
	
	@After(order=0)
	public static void tearDow1() {
		System.out.println("afterScenario1");
		
	}
	@After(order=3)
	public static void tear2() {
		System.out.println("afterScenario2");
		
	}
	@After(order=2)
	public static void tea3() {
		System.out.println("afterScenario3");
		
	}
	
}
