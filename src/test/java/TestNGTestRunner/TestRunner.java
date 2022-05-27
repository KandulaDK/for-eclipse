package TestNGTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
		glue = "stepDefination",monochrome=true)
public class TestRunner extends AbstractTestNGCucumberTests{

}
