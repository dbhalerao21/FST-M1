package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		
		String pageTitle = driver.getTitle();
		System.out.println("Page Title is: " + pageTitle);
		
		String LinkTxtid = driver.findElement(By.id("about-link")).getText();
		System.out.println("Text using id is: " + LinkTxtid);
		
		String LinkTxtclasaname = driver.findElement(By.className("green")).getText();
		System.out.println("Text using calss name is: " + LinkTxtclasaname);

		
		String LinkTxtcss = driver.findElement(By.cssSelector(".green")).getText();
		System.out.println("Text using css is: " + LinkTxtcss);

		// Find the About Us link using linkText()
		String LinkTxtlinkText = driver.findElement(By.linkText("About Us")).getText();
		System.out.println("Text usinglinkText  is: " + LinkTxtlinkText);
		
		Thread.sleep(1000);
		driver.close();

	}

}
