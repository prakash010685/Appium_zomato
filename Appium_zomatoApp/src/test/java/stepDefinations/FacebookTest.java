/**
 * 
 */
package stepDefinations;

import com.zomatopck.Appium_zomatoApp.ChromeDriverSetup;

import cucumber.api.java.en.Given;

/**
 * @author prakashpatil
 *
 */
public class FacebookTest {
	
	
	@Given("^I launch chrome browser$")
	public void launch_browser() throws Throwable {
		
		ChromeDriverSetup chromedriver=new ChromeDriverSetup();
		
		chromedriver.chrome();
		
	}
	

}
