import java.net.MalformedURLException;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Base{

	public static void main(String[] args) throws MalformedURLException {
			
		AndroidDriver<AndroidElement> driver=Capabilities();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@index='2']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("Hello Aakash");
		driver.findElements(By.className("android.widget.Button")).get(1).click();
		
		

	}

}
