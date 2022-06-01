package TestNGTestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target/failed_scenarios.txt",
				glue = "stepDefination",
				monochrome=true,
				plugin = {"pretty",
						"html:target/TestNGcucumber.html",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
						})

public class FailedTestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
