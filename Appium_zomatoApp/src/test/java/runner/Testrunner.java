/**
 * 
 */
package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import file_reader.FileReaderManager;

/**
 * @author prakashpatil
 *
 */

	
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			plugin = { "com.cucumber.listener.ExtentCucumberFormatter:/Users/prakashpatil/git/appium_zomato/target/report.html"}, 
	features = "/Users/prakashpatil/git/appium_zomato/Features",

	tags="@zomatoapp",
			glue = "stepdefinitions",
			monochrome = true
			)
	//PLZ read "https://docs.cucumber.io/cucumber/api/#running-cucumber" for more details on cucumber options

	public class Testrunner {
		@AfterClass
		public static void writeExtentReport() {
			Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));

			Reporter.setSystemInfo("user name", System.getProperty("user.name"));
			Reporter.setSystemInfo("time zone", System.getProperty("user.timezone"));
			Reporter.setSystemInfo("Mobile", "ANDROID" + "9.0");
			Reporter.setSystemInfo("MAVEN", "3.6");
			Reporter.setSystemInfo("JAVA", "1.8.0_202");
		}
	}


	
	


