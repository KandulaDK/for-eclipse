package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@tag1")
	public void beforeValidation() {
		System.out.println("      Before Validation done");
	}
	
	@After("@tag1")
	public void afterValidation() {
		System.out.println("      After Validation done");
	}
}
