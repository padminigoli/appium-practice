import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Activity {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);

		cap.setCapability(MobileCapabilityType.APP, "padminiemulator");
		cap.setCapability(AndroidMobileCapabilityType.AVD_READY_TIMEOUT, "25");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.googl.android.calendar");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.google.android.calendar.AllInOneCalendarActivity");
		
		//cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.timezonepicker.fullscreen.TimeZonePickerActivity");
		//cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.google.android.apps.calendar.meetings.activity.ConferencePhoneNumbersActivity");
		
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			
		

	}

}
