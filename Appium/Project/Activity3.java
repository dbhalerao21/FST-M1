package appiumProjectActivities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity3 {
	AppiumDriver<MobileElement> driver = null;

	@BeforeClass

	public void beforeClass() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		// caps.setCapability("deviceId", "2eed910sa");
		caps.setCapability("deviceName", "Pixelemulator");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.google.android.keep");
		caps.setCapability("appActivity", ".activities.BrowseActivity");// ("appActivity",
																		// "com.android.calculator2.Calculator");

		try {
			// Initialize driver
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			System.out.println("Google Keep is open");
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void GoogleKeepapptoaddnote() {

		// create note
		driver.findElementById("com.google.android.keep:id/new_note_button").click();
		driver.findElementById("com.google.android.keep:id/edit_note_text").sendKeys("This is test note");
		driver.findElementById("com.google.android.keep:id/editable_title").sendKeys("Test");
		//set reminder
		driver.findElementById("com.google.android.keep:id/menu_switch_to_list_vi").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Later today']").click();
		driver.findElementById("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]").click();
		//go to reminders
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]").click();
		driver.findElementById("com.google.android.keep:id/reminder_chip_text").click();
		//verification
		String noteTitle=driver.findElementById("com.google.android.keep:id/index_note_title").getText();
		System.out.println("Note title:"+noteTitle);
		String reminder=driver.findElementById("com.google.android.keep:id/reminder_chip_text").getText();
		System.out.println("Reminder:"+reminder);
		Assert.assertEquals(noteTitle, "Test");
		Assert.assertEquals(reminder, "Today, 6:00 PM");
		
	}
	@AfterTest
    public void tearDown() {
        driver.quit();
    }

}
