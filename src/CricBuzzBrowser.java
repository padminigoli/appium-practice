import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CricBuzzBrowser extends BaseChrome{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.get("http://m.cricbuzz.com/");
		driver.findElementByXPath("//a[@href='#menu']").click();
		//driver.findElementByCssSelector("a[title='Cricket Schedule']").click();
		//driver.findElementByXPath("//a[@href='#menu']").click();
		driver.findElementByCssSelector("a[title='Cricbuzz Home']").click();
		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		   jse.executeScript("window.scrollBy(0,680)", "");
		   Assert.assertTrue(driver.findElement(By.xpath("//*[@id='top']/div/div[11]/h4")).getAttribute("class").contains("header"));
		

		//Assert.assertTrue(driver.findElement(By.xpath("//*[@id='top']/div/div[11]/h4")).getAttribute("class").contains("header"));
		

	}

}
