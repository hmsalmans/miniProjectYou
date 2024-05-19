package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.BrowsersDriver;

public class ContactPage extends BrowsersDriver {

	 

	public static String firstName = "//*[@id=\"input-37\"]";

	public static String lastName = "//*[@id=\"input-38\"]";

	public static String email = "//*[@id=\"input-39\"]";

	public static String phone = "//*[@id=\"input-40\"]";

	public static String subject = "//*[@id=\"input-41\"]";

	public static String description = "//*[@id=\"input-36\"]";

	public static String clicking = "//*[@id=\"submitButton\"]/button";// clicking the submit button

	
	public static void nav() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://ask.usda.gov/s/contactsupport");
	};

	public static void firsName() throws InterruptedException {

		Thread.sleep(2000);

		driver.findElement(By.xpath(firstName)).sendKeys("Hafiz");
	}

	public static  void lastName() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath(lastName)).sendKeys("Salman");

	}

	public static void email() throws InterruptedException {

		Thread.sleep(2000);

		driver.findElement(By.xpath(email)).sendKeys("hmsalmans1@gmail.com");
	}

	public static void helloNum() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath(phone)).sendKeys("6576689181");
	}

	public static void subject() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath(subject)).sendKeys("Testing");
	}

	public static void description() throws InterruptedException {

		Thread.sleep(2000);

		driver.findElement(By.xpath(description)).sendKeys("Nothing! just checking the website. plz ignore message");

	}

	public static void clickbutton() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath(clicking)).click();

	}

}
