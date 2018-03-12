import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Gaana {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);

		cap.setCapability(MobileCapabilityType.APP, "padminiemulator");
		cap.setCapability(AndroidMobileCapabilityType.AVD_READY_TIMEOUT, "25");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.gaana");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.gaana.Login");
	}

}
