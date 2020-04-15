/**
 * 
 */
package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zomatopck.Appium_zomatoApp.Setup;

import io.appium.java_client.MobileElement;
/**
 * @author prakashpatil
 *
 */
public class ProgileScreen {

	WebDriverWait wait = new WebDriverWait(Setup.driver, 10);

	public void profile_info() {
		// Zomato account profile name
		MobileElement zomato_profile_name = (MobileElement) wait
				.until(ExpectedConditions.elementToBeClickable(By.id("com.application.zomato:id/user_name")));
		String account_name = zomato_profile_name.getText();
		System.out.println(account_name);
	}

	public void edit_profile() throws Throwable {
		// Edit profile button
		MobileElement profile_edit_btn = (MobileElement) wait
				.until(ExpectedConditions.elementToBeClickable(By.id("com.application.zomato:id/edit_details")));
		profile_edit_btn.click();
		// Edit screen
		MobileElement edit_profile_screen_title = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout")));
		String editscreen_title = edit_profile_screen_title.getText();
		System.out.println(editscreen_title);
		// Add Photo
		MobileElement add_Photo_btn = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.Button")));
		add_Photo_btn.click();

		// Allow permission popup
//
//		MobileElement allow_popup = (MobileElement) wait.until(ExpectedConditions
//				.elementToBeClickable(By.id("com.android.packageinstaller:id/permission_allow_button")));
//		allow_popup.click();

		Thread.sleep(40000);

		// Select mobile Camera option
//		MobileElement mobile_camera = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
//				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout")));
//		mobile_camera.click();
		// Allow camera permission
//		MobileElement camera_permission_popup = (MobileElement) wait.until(ExpectedConditions
//				.elementToBeClickable(By.id("com.android.packageinstaller:id/permission_allow_button")));
//		camera_permission_popup.click();
//
//		Thread.sleep(4000);

		// select avatar pic

		MobileElement select_avatar_from_mobile = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")));

		select_avatar_from_mobile.click();

		// pre-view button

		MobileElement preview_avatar = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[16]/android.widget.ImageView")));
		preview_avatar.click();

		// Done button

		MobileElement done_avatar_btn = (MobileElement) wait
				.until(ExpectedConditions.elementToBeClickable(By.id("com.application.zomato:id/title_textview")));
		done_avatar_btn.click();

	}
}
