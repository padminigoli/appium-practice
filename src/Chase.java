import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Chase extends ParentChase {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		System.out.println(driver.getPageSource());
		

	}

}
