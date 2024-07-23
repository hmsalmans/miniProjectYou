package autmatingtests;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\d-hafiz.saleem\\OneDrive - afs.com\\Desktop\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.richmondfed.org/");
		System.out.println(driver.getTitle());
		
		WebElement mouse = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[2]/a[1]"));
		
		Actions act = new Actions(driver);
		 act.moveToElement(mouse).perform();
		 
		 driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[2]/div/div[2]/ul[2]/li[4]/a")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"contacts\"]/div/div/div/div/span[1]/a")).click();
		 
		 //Now 2 windows are open and we need windows handling.
		 String parentWind = driver.getWindowHandle();
		 
		 Set<String> hndls = driver.getWindowHandles();
		 
		 //Now iterate using iteration
		 
		 Iterator<String> iT = hndls.iterator();
				 
				 while(iT.hasNext()) {
					 
					 
					 if(!parentWind.equals(childWind)) {
						 driver.switchTo().window(childWind);
						System.out.println(driver.switchTo().window(childWind).getTitle());
						 
						 driver.findElement(By.xpath("//*[@id=\"YN\"]")).sendKeys("begum");
						 Thread.sleep(3000);
						 driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("jajanu@yahoo.com");
						 Thread.sleep(4000);
						 driver.close();
					 }
					//switching to parent window as we closed child window
					 driver.switchTo().window(parentWind);
					 
					
					 
				 }
				 WebElement mouse11 = driver.findElement(By.xpath("//*[@id=\"Layer_1\"]"));
				 Thread.sleep(5000);
				 act.moveToElement(mouse11).perform();
				 Thread.sleep(4000);
				 driver.findElement(By.xpath("//*[@id=\"siteSearchText\"]")).sendKeys("helloSearch");
		 
		
	}

}
