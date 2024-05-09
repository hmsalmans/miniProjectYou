package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.BrowsersDriver;

public class ContactPage extends BrowsersDriver {
	
	
	public static String firstName = "//*[@id=\"input-51\"]";
	
	public static String lastName = "//*[@id=\"input-52\"]";
	
	
	public static String email = "//*[@id=\"input-53\"]";
	
	public static String phone = "//*[@id=\"input-54\"]";
	
	
	public static String subject = "//*[@id=\"input-55\"]";
	
	public static String description = "//*[@id=\"input-50\"]";
	
	public static String clicking = "//*[@id=\"submitButton\"]/button";//clicking the submit button
	
	
	public static void nav() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	
	public static void fillForm() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(firstName)).sendKeys("Hafiz");
		
		driver.findElement(By.xpath(lastName)).sendKeys("Salman");
		
		driver.findElement(By.xpath(email)).sendKeys("hmsalmans1@gmail.com");
		
		driver.findElement(By.xpath(phone)).sendKeys("6576689181");
		
		driver.findElement(By.xpath(subject)).sendKeys("Testing");
		
		driver.findElement(By.xpath(description)).sendKeys("Nothing! just checking the website. plz ignore message");
		
		
		
	}
	
	public static void clickbutton () throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(clicking)).click();
		
	}
	
	
	
	

}
