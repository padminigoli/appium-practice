import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class MiscelleanousDemo extends Base {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		System.out.println(driver.currentActivity());
		System.out.println(driver.getContext());
		System.out.println(driver.getOrientation());
		System.out.println(driver.isDeviceLocked());
		System.out.println(driver.isKeyboardShown());
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.pressKeyCode(AndroidKeyCode.BACK);
		
		

	}

}
