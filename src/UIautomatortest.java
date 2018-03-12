import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIautomatortest extends Base{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver <AndroidElement>driver=Capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(false)").size());
		

	}

}
