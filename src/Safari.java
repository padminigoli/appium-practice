import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Safari
{
	IOSDriver<IOSElement> driver;
	@Test

	public void brows() throws MalformedURLException

	{

	DesiredCapabilities dc = new DesiredCapabilities();

	dc.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");

	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.2");

	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6s");

	driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	driver.get("http://gmail.com");

	driver.findElementByName("Email").sendKeys("padmini");

	driver.findElementByName("Passwd").sendKeys("padmini");

	driver.findElementByName("signIn").click();
	
	}
}


