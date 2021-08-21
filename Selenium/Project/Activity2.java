package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;
	// Get the url of the header image
	@Test
	public void getTheUrlOfTheHeaderImage() {
		
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		String URL=driver.findElement(By.id("divLogo")).getAttribute("src");
		System.out.println("The url of the header image :"+URL);		
		driver.close();
	}
	
	
	
}
