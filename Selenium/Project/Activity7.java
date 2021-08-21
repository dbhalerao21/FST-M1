package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Activity7 {
	// Adding qualifications
	@Test
	// Verify that the “Directory” menu item is visible and clickable
	public void addingQualifications() {
		HRMLogin hrm = new HRMLogin();
		WebDriver driver = (WebDriver) hrm.login();
		//my info
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		driver.findElement(By.xpath("//a[contains(@href,'/orangehrm/symfony/web/index.php/pim/viewQualifications/empNumber/1')]")).click();
		driver.findElement(By.id("addWorkExperience")).click();
		driver.findElement(By.id("experience_employer")).sendKeys("menhfw");
		driver.findElement(By.id("experience_jobtitle")).sendKeys("werwe");
		driver.findElement(By.id("btnWorkExpSave")).click();
		
		driver.close();
	}
}
