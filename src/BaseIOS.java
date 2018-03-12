import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseIOS {
	
	public static void main(String []args) throws MalformedURLException{
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		cap.setCapability(MobileCapabilityType.APP,"/Users/bhimesh/Desktop/UICatalog.app");
		IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		
		
	}

}
