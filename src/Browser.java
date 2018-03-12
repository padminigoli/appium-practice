import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Browser extends BaseChrome {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.get("http://facebook.com/");
		driver.findElementByXPath("//*[@id='m_login_email']").sendKeys("padmini525@gmail.com");
		driver.findElementByXPath("//*[@id='m_login_password']").sendKeys("chandramohan");
		driver.findElementByXPath("//*[@id='u_0_5']").click();
		
		
		
		
	}

}
