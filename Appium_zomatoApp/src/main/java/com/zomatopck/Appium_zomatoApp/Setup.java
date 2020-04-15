/**
 * 
 */
package com.zomatopck.Appium_zomatoApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
/**
 * @author prakashpatil
 *
 */
public class Setup {

	public static AppiumDriver<MobileElement> driver;

	public void launch_setup() throws Throwable {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "SAMSUNG");
		capabilities.setCapability(MobileCapabilityType.UDID, "RZ8M40AX18E");
		// capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		capabilities.setCapability("appPackage", "com.application.zomato");
		capabilities.setCapability("appActivity", "com.application.zomato.activities.Splash");
		// capabilities.setCapability("appWaitActivity", "SplashActivity");
		capabilities.setCapability("autoGrantPermissions", "true");
		capabilities.setCapability("autoAcceptAlerts", true);
		//capabilities.setCapability("unicodeKeyboard", true);
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(10000);
			System.out.println("ZOMATO Mobile application launch on Android device ");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void closeapp() {
		driver.quit();
	}
}

	
