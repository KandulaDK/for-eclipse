package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
		glue = "stepDefination",monochrome=true,stepNotifications=true,
		plugin = {"pretty",
				"html:target/TestNGcucumber.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
				"rerun:target/failed_scenarios.txt"},
		tags= "@SearchProducts or @checkOut")

public class JunitTestRunnerTest {
	
	
}
