/**
 * 
 */
package com.zomatopck.Appium_zomatoApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author prakashpatil
 *
 */
public class ChromeDriverSetup {
	
	
public void chrome() throws Throwable {
	
	
	System.setProperty("webdriver.gecko.driver", "/Users/prakashpatil/Downloads/geckodriver");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://github.com/login");
	
	Thread.sleep(10000);	
}
}
