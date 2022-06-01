package TestNGTestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
		glue = "stepDefination",monochrome=true,
		plugin = {"pretty",
				"html:target/TestNGcucumber.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
				"rerun:target/failed_scenarios.txt"},
		tags= "@SearchProducts")

public class TestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
