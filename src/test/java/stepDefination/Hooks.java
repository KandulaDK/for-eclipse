package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@somekTest")
	public void beforeValidation() {
		System.out.println("      Before Validation done");
	}
	
	@After("@somekTest")
	public void afterValidation() {
		System.out.println("      After Validation done");
	}
}
