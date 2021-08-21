package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Activity5 {
	//WebDriver driver;

	@Test

	public void edituserinformation() {
		
		HRMLogin hrm =new HRMLogin();
		WebDriver driver=(WebDriver) hrm.login();
		// my info
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		driver.findElement(By.id("btnSave")).click();
		// enter details
		driver.findElement(By.id("personal_txtEmpFirstName")).clear();
		driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("DEE123");
		driver.findElement(By.id("personal_txtEmpLastName")).clear();
		driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Bh123");
		driver.findElement(By.id("personal_optGender_2")).click();


		WebElement element = driver.findElement(By.id("personal_cmbNation"));
		Select select = new Select(element);
		select.selectByIndex(2);

		driver.findElement(By.id("btnSave")).click();
		driver.close();

	}
}
