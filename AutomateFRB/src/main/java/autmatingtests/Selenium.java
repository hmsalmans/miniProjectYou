package autmatingtests;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\d-hafiz.saleem\\OneDrive - afs.com\\Desktop\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.richmondfed.org/");
		
		
		WebElement mouse = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[2]/a[1]"));
		
		Actions act = new Actions(driver);
		 act.moveToElement(mouse).perform();
		 
		 driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[2]/div/div[2]/ul[2]/li[4]/a")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"contacts\"]/div/div/div/div/span[1]/a")).click();
		
	}

}
