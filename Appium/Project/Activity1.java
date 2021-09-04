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

public class Activity1 {
	 AppiumDriver<MobileElement> driver = null;

	    @BeforeClass
	
	    public void beforeClass() throws MalformedURLException {
	        DesiredCapabilities caps = new DesiredCapabilities();
	        //caps.setCapability("deviceId", "2eed910sa");
	        caps.setCapability("deviceName", "Pixelemulator");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("appPackage", "com.google.android.apps.tasks");
	        caps.setCapability("appActivity", ".ui.TaskListsActivity");//("appActivity", "com.android.calculator2.Calculator");

	        try {
	            // Initialize driver
	            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	            System.out.println("Google task is open");
	        } catch (MalformedURLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	    
	    @Test
	    
	    public void  listOfActivitiesClass() throws Exception {
	       
	    	driver.findElementById("com.google.android.apps.tasks:id/welcome_get_started").click();
	        //Create Task 1
	    	driver.findElementByAccessibilityId("Create new task").click();
	      
	      	driver.findElementById("com.google.android.apps.tasks:id/add_task_title").sendKeys("Complete Activity with Google Tasks");
	   
	      	driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
	      	
	        //Create Task 2
	      	driver.findElementByAccessibilityId("Create new task").click();
	    
	      	driver.findElementById("com.google.android.apps.tasks:id/add_task_title").sendKeys("Complete Activity with Google Keep");	      
	  
	      	driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
	     
	        //Create Task 3
	      	driver.findElementByAccessibilityId("Create new task").click();
	      
	      	driver.findElementById("com.google.android.apps.tasks:id/add_task_title").sendKeys("Complete the second Activity Google Keep");
	    
	      	driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
	     
	      	//Get Text
	      	String Task3=driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Complete the second Activity Google Keep\"]/android.view.ViewGroup/android.widget.TextView").getText();
	      	System.out.println("Taks3:"+Task3);
	      	
	      	String Task2=driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Keep\"]/android.view.ViewGroup/android.widget.TextView").getText();
	      	System.out.println("Task2:"+Task2);
	      	
	      	String Task1=driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Tasks\"]/android.view.ViewGroup/android.widget.TextView").getText();
	      	System.out.println("Task1:"+Task1);
	      	
	      	Assert.assertEquals(Task3, "Complete the second Activity Google Keep");
	      	Assert.assertEquals(Task2, "Complete Activity with Google Keep");
	      	Assert.assertEquals(Task1, "Complete Activity with Google Tasks");
	    }
	    
	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	    }
}
