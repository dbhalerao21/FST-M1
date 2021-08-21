package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity6 {
	@Test
	// Verify that the “Directory” menu item is visible and clickable
	public void directorymenuitem() {
		HRMLogin hrm = new HRMLogin();
		WebDriver driver = (WebDriver) hrm.login();

		WebElement directory = driver.findElement(By.id("menu_directory_viewDirectory"));
		Boolean directory1 = directory.isEnabled();
		System.out.println(directory1);
		if (directory1) {
			System.out.println("directory is present:");
			directory.click();
			String SearchDirectory = driver.findElement(By.xpath("//*[@class='head']")).getText();
			System.out.println(SearchDirectory);
			Assert.assertEquals("Search Directory", SearchDirectory);

		} else {
			System.out.println("Element not displayed");
		}

		driver.close();
	}
}
