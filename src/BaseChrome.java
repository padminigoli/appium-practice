import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseChrome {
	
public static AndroidDriver<AndroidElement>Capabilities() throws MalformedURLException {
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		AndroidDriver<AndroidElement> driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		
}

}
