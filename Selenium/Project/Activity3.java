package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity3 {

	WebDriver driver;

	@Test
	public void loggingintothesite() {
		
		HRMLogin hrm = new HRMLogin();
		WebDriver driver = (WebDriver) hrm.login();
		// verify home page
		String welcomeMsg = driver.findElement(By.id("welcome")).getText();
		//System.out.println("Welcome message on home page :" + welcomeMsg);
		
		Assert.assertEquals("Welcome John", welcomeMsg);
		driver.close();
	}

}
