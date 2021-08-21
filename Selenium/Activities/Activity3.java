package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		String pagetitle = driver.getTitle();
		System.out.println("Title of page :" + pagetitle);

		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement lastName = driver.findElement(By.id("lastName"));
		firstName.sendKeys("Automation");
		lastName.sendKeys("Testing");

		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("autom@ti0n00@gmail.com");
		
		WebElement contactnumber=driver.findElement(By.id("number"));
		contactnumber.sendKeys("1234567890");
		
		WebElement submitbtn=driver.findElement(By.cssSelector(".ui.green.button"));
		submitbtn.click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
