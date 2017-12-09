package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base {

	static WebDriver driver;
	@BeforeMethod
	public static void launch() {
	 System.setProperty("webdriver.gecko.driver", "I:\\Workspaces\\drivers\\geckodriver.exe");
	 driver = new FirefoxDriver();
		
	}
	@AfterMethod
	public static void close() {
		
		 driver.close();
		
	}
}
