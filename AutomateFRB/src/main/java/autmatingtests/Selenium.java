package autmatingtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/apple/Desktop/QA/driver-1/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.richmondfed.org/");

	}

}
