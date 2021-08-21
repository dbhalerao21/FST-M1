package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Activity8 {
	// Applying for a leave
	@Test
	public void Applyingforaleave() throws InterruptedException {
		HRMLogin hrm = new HRMLogin();
		WebDriver driver = (WebDriver) hrm.login();
		//
		driver.findElement(By.id("menu_dashboard_index")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Apply Leave')]")).click();
		
		//apply leave
		//Type of leave
		driver.findElement(By.id("applyleave_txtLeaveType"));
		WebElement element = driver.findElement(By.id("applyleave_txtLeaveType"));
		Select select = new Select(element);
		select.selectByVisibleText("privilege leaves");
		
		//Select From date
		driver.findElement(By.id("applyleave_txtFromDate")).click();
		WebElement month1 = driver.findElement(By.className("ui-datepicker-month"));
		Select select1 = new Select(month1);
		select1.selectByVisibleText("Aug");
				
		WebElement year = driver.findElement(By.className("ui-datepicker-year"));
		Select select2 = new Select(year);
		select2.selectByVisibleText("2021");		
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[2]")).click();

		//Select to date
		Thread.sleep(2000);
		driver.findElement(By.id("applyleave_txtToDate")).click();
	
		WebElement month2 = driver.findElement(By.className("ui-datepicker-month"));
		Select select3 = new Select(month2);
		select3.selectByVisibleText("Aug");
		
		WebElement year2 = driver.findElement(By.className("ui-datepicker-year"));
		Select select4 = new Select(year2);
		select4.selectByVisibleText("2021");
		
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[5]")).click();
		driver.findElement(By.id("applyBtn")).click();
		
	
	   //Status of leave	
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		String leavestatus=driver.findElement(By.xpath("//*[@id='frmList_ohrmListComponent']/div[3]/table/tbody/tr[1]/td[3]")).getText();
		System.out.println("Leave status is  :"+leavestatus);
		
		//close
		driver.close();
	}

}
