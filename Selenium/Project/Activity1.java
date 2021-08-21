package orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
	
	// verify the website title
	@Test
	public void verifytitle() {
		
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		String Title = driver.getTitle();
		Assert.assertEquals("OrangeHRM", Title);
		driver.close();

	}

}
