package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsersDriver {
	
	public static WebDriver driver;
	
	
	
	public BrowsersDriver() { //constructor
		
		driver = driver;
		
		
		System.setProperty("webdriver.chrome.driver", "/src/test/resources/drivers/chromedriver");
		
		
	
		}
	
	
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		this.driver.close();
	}
	
	
	
}
