package baseClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\macky\\eclipse-workspace\\Cu\\adac\\edgedriver_win64 (1)\\msedgedriver.exe");
			driver = new EdgeDriver();
			System.out.println("nandan");

		}

		return driver;

	}

	public static void sendkey(WebElement element, String name) {
		element.sendKeys(name);

	}

	public static void clickOnElement(WebElement element) {
		element.click();

	}

	public static void screenshot(String name) throws IOException {
		TakesScreenshot s = (TakesScreenshot) driver;

		SimpleDateFormat sd = new SimpleDateFormat("ddMMYY_HHMMSS");

		File screenshotAs = s.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\macky\\eclipse-workspace\\Cu\\adac\\screnshot" + name + ".png");
		FileHandler.copy(screenshotAs, destination);

	}

	public static void select(WebElement locator, int index) {
		Select s = new Select(locator);
		s.selectByIndex(index);
		// s.selectByVisibleText(visibleText);

	}

	public static void javascriptexecutor() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Vertical scroll down by 600 pixels
		js.executeScript("window.scrollBy(0,600)");

	}

}
