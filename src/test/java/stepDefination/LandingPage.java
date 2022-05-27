package stepDefination;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PicoContainer.DependencyInjection;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LandingPage {
	public WebDriver driver;
 	public String landingPgProduct;
 	public String offerPgProduct;
 	DependencyInjection dependencyInjection;
	
	public LandingPage(DependencyInjection dependencyInjection) 
	{
		this.dependencyInjection = dependencyInjection;
	}
 	
	@Given("^User is on GreenCart Landing Page$")
	public void user_is_on_greencart_landing_page() throws Throwable {
		WebDriverManager.chromedriver().setup();
		dependencyInjection.driver = new ChromeDriver();
		dependencyInjection.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

	}

	@When("^User Searched with shortName (.+) and Extracted resultes of the product$")
    public void user_searched_with_shortname_and_extracted_resultes_of_the_product(String shortName) throws Throwable{
		dependencyInjection.driver.findElement(By.cssSelector("input[type='search']")).sendKeys(shortName);
		Thread.sleep(2000);
		dependencyInjection.landingPgProduct = dependencyInjection.driver.findElement(By.xpath("//h4[@class='product-name']")).getText().split(" ")[0].trim();
		System.out.println("Found This Product in landing page: " + dependencyInjection.landingPgProduct);
	}

	
}
