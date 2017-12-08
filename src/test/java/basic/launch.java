package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class launch {
	static WebDriver driver;
	@BeforeMethod
	public static void launch() {
	 System.setProperty("webdriver.gecko.driver", "I:\\Workspaces\\drivers\\geckodriver.exe");
	 driver = new FirefoxDriver();
		
	}
	@Test
	public static void launchAmazon() {
		driver.get("https://www.amazon.in/");

	}
	
	@AfterMethod
	public static void close() {
		
		 driver.close();
		
	}
}
