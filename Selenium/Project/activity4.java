package orangeHRM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class activity4 {
	WebDriver driver;

	@Test

	public void addNewEmploye() {
		
		HRMLogin hrm = new HRMLogin();
		WebDriver driver = (WebDriver) hrm.login();

		//fing pim
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		//add new emp
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("firstName")).sendKeys("ABC");
		driver.findElement(By.id("lastName")).sendKeys("XYZ");
		
		
		//verify added emp
		String empid=driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println(empid);	
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		 List<WebElement> eid=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr/td[2]"));
		 eid.size();
		 System.out.println( eid.size());
		 System.out.println("All contact :");		  
		  for(WebElement Allconatct : eid) { 
			  System.out.println(Allconatct.getText());
		  }
		  
		 // if() {}
		//  else {
			  
			  
			  
		//  }
		
	}

}



















