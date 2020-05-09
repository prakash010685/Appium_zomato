/**
 * 
 */
package stepDefinations;
import com.zomatopck.Appium_zomatoApp.Setup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.Homescreen;
import pageobjects.ProgileScreen;
import pageobjects.WelcomeScreen;
/**
 * @author prakashpatil
 *
 */
public class ZomatoFunctionality {

	@Given("^I launch zomato app on android mobile$")

	public void launch_app() throws Throwable {

		Setup set = new Setup();
		set.launch_setup();

		Homescreen home = new Homescreen();
		home.app_name();
	}

	@When("^I click on Continue with google$")

	public void I_click_on_Continue_with_google() throws Throwable {

		Homescreen home = new Homescreen();

		home.continue_with_google();
	}

	@Then("^I logged successfully zomato$")

	public void I_logged_successfully_zomato() {

		System.out.println("User successfully logged in zomato app");
	}

	@Given("^I navigate to search field and serach nearby restaurant$")
	public void searchRestaurant() throws Throwable {

		WelcomeScreen welcome = new WelcomeScreen();
		welcome.search_restaurantAndCuisines();

	}

	@Then("^I search nearby restaurant successfully and print restaurant name$")

	public void search_confirmation_message() {
		WelcomeScreen welcome = new WelcomeScreen();
		System.out.println("Confirmation : Nearby restaurant found");

	}

	@And("^I close the search history$")
	public void close_search_history() {

		WelcomeScreen welcome = new WelcomeScreen();
		welcome.clear_search();
	}

	@And("^I navigate to option and click on profile$")

	public void navigate_profile_option() {

		WelcomeScreen welcome = new WelcomeScreen();
		welcome.backpage();
	}

	@When("^I update the profile avatar$")

	public void update_profile() throws Throwable {

		WelcomeScreen welcome = new WelcomeScreen();
		welcome.profile();

		ProgileScreen profile_screen = new ProgileScreen();

		//profile_screen.profile_info();
		profile_screen.edit_profile();
		
		Setup set=new Setup();
		
		set.closeapp();
		
	}

}
