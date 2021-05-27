package learnGridAppium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestCase2 {
	@Test
	public void device2Execution() throws MalformedURLException 
	{
		DesiredCapabilities des =new DesiredCapabilities();
		des.setCapability("platformName", "Android");
		des.setCapability("appPackage", "com.android.calculator2");
		des.setCapability("appActivity", "com.android.calculator2.Calculator");

		des.setCapability("automationName","UiAutomator2");
		URL url=new URL("http://192.168.1.102:4444/wd/hub");
		AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(url,des);
		/*
		 * driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='2']"))
		 * .click(); driver.findElement(By.xpath(
		 * "//android.widget.ImageView[@content-desc='plus']")).click();
		 * driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='5']"))
		 * .click(); driver.findElement(By.xpath(
		 * "//android.widget.ImageView[@content-desc='equal']")).click();
		 */
		driver.closeApp();
	}
}
