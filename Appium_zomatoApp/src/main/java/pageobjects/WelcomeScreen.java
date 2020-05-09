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
public class WelcomeScreen {

	WebDriverWait wait = new WebDriverWait(Setup.driver, 10);

	public void search_restaurantAndCuisines() throws Throwable {

		MobileElement search_restaurant = (MobileElement) wait
				.until(ExpectedConditions.elementToBeClickable(By.id("com.application.zomato:id/edittext")));
		search_restaurant.sendKeys("Nearby restaurant for me");
		// Search nearby restaurant
		MobileElement restaurant_name = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout[1]")));
		String restaurant = restaurant_name.getText();
		System.out.println(restaurant);
		// Restaurant time
		MobileElement restaurant_time = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout")));
		String restaturant_timeing = restaurant_time.getText();
		System.out.println(restaturant_timeing);

		Thread.sleep(10000);
	}

	public void cancel_search() {
		MobileElement cancel_search = (MobileElement) wait
				.until(ExpectedConditions.elementToBeClickable(By.id("com.application.zomato:id/iconCross")));
		cancel_search.click();
	}

	public void clear_search() {
		MobileElement clear_search = (MobileElement) wait
				.until(ExpectedConditions.elementToBeClickable(By.id("com.application.zomato:id/edittext")));
		clear_search.clear();
	}

	public void backpage() {

		MobileElement back_page = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//android.widget.TextView[@content-desc=\"Go back to previous page\"]")));
		back_page.click();
	}

	public void profile() throws Throwable {

		// Profile image
		MobileElement profile_image = (MobileElement) wait
				.until(ExpectedConditions.elementToBeClickable(By.id("com.application.zomato:id/profile_image")));
		profile_image.click();
		
		Alert alert=Setup.driver.switchTo().alert();
		alert.dismiss();

		// click on account 
		MobileElement account_maillid = (MobileElement) wait
				.until(ExpectedConditions.elementToBeClickable(By.id("com.application.zomato:id/edittext")));
		String mailID = account_maillid.getText();
		System.out.println(mailID);

		
		//MobileElement clcik_on_profileID = (MobileElement) wait
		//		.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/com.application.zomato.tabbed.widget.HomeViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.EditText")));
		
	//	clcik_on_profileID.click();
		
		account_maillid.click();
		Alert alert1=Setup.driver.switchTo().alert();
		alert1.dismiss();
		Thread.sleep(5000);
		
	}
}
