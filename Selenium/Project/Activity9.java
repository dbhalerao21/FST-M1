package orangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Activity9 {
	//Retrieve emergency contacts

	@Test
	public void retrieveemergencycontacts() {
		HRMLogin hrm = new HRMLogin();
		WebDriver driver = (WebDriver) hrm.login();
		//
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		driver.findElement(By.xpath("//a[contains(@href,'/orangehrm/symfony/web/index.php/pim/viewEmergencyContacts/empNumber/1')]")).click();
		
		
		  List<WebElement> phno=driver.findElements(By.xpath("//table[@id='emgcontact_list']/tbody/tr/td[4]"));
		  phno.size();
		 
		 System.out.println("All contact :");		  
		  for(WebElement Allconatct : phno) { 
			  System.out.println(Allconatct.getText());
		  }
		 
	
		driver.close();
	}
}
