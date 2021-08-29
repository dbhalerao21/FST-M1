package appiumProjectActivities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity6 {
	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;

	 @BeforeClass
	    public void beforeClass() throws MalformedURLException {
	        // Set the Desired Capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "Pixelemulator");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("appPackage", "com.android.chrome");
	        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
	        caps.setCapability("noReset", true);

	        // Instantiate Appium Driver
	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	        //wait = new WebDriverWait(driver, 5);
	        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	        //driver.get("https://www.training-support.net/selenium");
	        driver.get("https://www.training-support.net/selenium/popups");
	    }
	 @Test
	    public void correctloginpage() {
		 driver.findElement(
					MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).scrollIntoView(contains(@text,'selenium/popups'))"))
					.click();
	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[1]/android.view.View[4]/android.widget.Button").click();
	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]").sendKeys("admin");
	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]").sendKeys("password");
	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.widget.Button").click();
	String correctCredential=driver.findElementByXPath("//android.view.View[contains(@text,'Welcome Back, admin')]").getText();
	Assert.assertEquals(correctCredential, "Welcome Back, admin"); 
	
	 }
	 @Test
	    public void incorrectloginpage() {
		 driver.findElement(
					MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).scrollIntoView(contains(@text,'selenium/popups'))"))
					.click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[1]/android.view.View[4]/android.widget.Button").click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]").sendKeys("admin123");
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]").sendKeys("password123");
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.widget.Button").click();
			String incorrectCredential=driver.findElementByXPath("//android.view.View[contains(@text,'Invalid Credentials')]").getText();
			Assert.assertEquals(incorrectCredential, "Invalid Credentials");
	 }
	 @AfterTest
	    public void tearDown() {
	        driver.close();
	    }

}
