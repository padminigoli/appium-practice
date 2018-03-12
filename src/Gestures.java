import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gestures extends Base{

	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//TAP
		TouchAction t= new TouchAction(driver);
		t.tap(driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")")).perform();
		driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		t.longPress(driver.findElementByAndroidUIAutomator("text(\"People Names\")")).waitAction().release().perform();
		System.out.println(driver.findElementByAndroidUIAutomator("text(\"Sample menu\")").getText());
		
		
		
		
	
		

	}

}
