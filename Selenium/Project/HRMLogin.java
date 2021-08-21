package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRMLogin {
	WebDriver driver;
	public WebDriver login() {
		
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		// select the username and password fields
		driver.findElement(By.id("txtUsername")).sendKeys("orange");

		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");

		// click login btn
		driver.findElement(By.id("btnLogin")).click();
		return driver;
	}
}
