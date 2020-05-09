/**
 * 
 */
package pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zomatopck.Appium_zomatoApp.Setup;

import io.appium.java_client.MobileElement;
/**
 * @author prakashpatil
 *
 */
public class Homescreen {

	WebDriverWait wait = new WebDriverWait(Setup.driver, 10);

	public void continue_with_google() throws Throwable {

		MobileElement google_login = (MobileElement) wait.until(ExpectedConditions
				.elementToBeClickable(By.id("com.application.zomato:id/layout_connect_using_google")));
		
		
		
		google_login.click();
	
		MobileElement select_emailID = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout")));
		select_emailID.click();
		
		// Alert
		
		
		MobileElement alertpopup = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.application.zomato:id/cover_image")));
		
		String str_alert=alertpopup.getText();
		System.out.println("ALERT MESSAGE= "  +str_alert);
		alertpopup.click();
		
		
		
		Thread.sleep(10000);
	}

	public void continue_with_email() throws Throwable {

		MobileElement email_login = (MobileElement) wait
				.until(ExpectedConditions.elementToBeClickable(By.id("com.application.zomato:id/layout_signup")));

		email_login.click();
		
		
		// Alert
		
				MobileElement alertpopup = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.application.zomato:id/cover_image")));
				
				String str_alert=alertpopup.getText();
				System.out.println("ALERT MESSAGE= "  +str_alert);
				alertpopup.click();
		
		
		Thread.sleep(4000);
	}

	public void continue_with_facebook() throws Throwable {

		MobileElement facebook_login = (MobileElement) wait.until(ExpectedConditions
				.elementToBeClickable(By.id("com.application.zomato:id/layout_connect_using_facebook")));

		facebook_login.click();
		Thread.sleep(4000);
	}

	public void continue_with_skip() throws Throwable {

		MobileElement skip_btn = (MobileElement) wait
				.until(ExpectedConditions.elementToBeClickable(By.id("com.application.zomato:id/skip_button")));

		skip_btn.click();
		Thread.sleep(4000);
	}

	public void app_name() throws Throwable {

		MobileElement name = (MobileElement) wait
				.until(ExpectedConditions.elementToBeClickable(By.id("com.application.zomato:id/zomato_name")));
		String appname = name.getText();
		System.out.println(appname);
		Thread.sleep(2000);
	}

	public void term_condition_link() throws Throwable {

		MobileElement condition_link = (MobileElement) wait.until(
				ExpectedConditions.elementToBeClickable(By.id("com.application.zomato:id/text_main_terms_container")));
		String tearm_link = condition_link.getText();
		System.out.println(tearm_link);
		Thread.sleep(4000);
	}
}
