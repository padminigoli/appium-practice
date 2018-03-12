import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwipeDemo extends Base{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		TouchAction t=new TouchAction(driver);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();
		t.longPress(driver.findElementByXPath("//*[@content-desc='15']")).waitAction().moveTo(driver.findElementByXPath("//*[@content-desc='45']")).release().perform();
		
		
		


	}

}
