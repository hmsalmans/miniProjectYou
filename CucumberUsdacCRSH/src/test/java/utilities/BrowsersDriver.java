package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsersDriver {
	
	public static WebDriver driver;
	
	
	
	public BrowsersDriver() { //constructor
		
		this.driver = driver;
		
		
		System.setProperty("webdriver.chrome.driver", "/src/test/resources/drivers/chromedriver");
		
		this.driver = new ChromeDriver();
		
	
		}
	
	
	public void close() {
		this.driver.close();
	}
	
	
	
}
