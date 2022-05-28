package stepDefination;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PicoContainer.DependencyInjection;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class OffersPage {
	public WebDriver driver;
 	public String landingPgProduct;
 	public String offerPgProduct;
 	DependencyInjection dependencyInjection;
 	
 public OffersPage(DependencyInjection dependencyInjection) {
	 this.dependencyInjection = dependencyInjection;
 }

 @Then("^User searched for same shortname (.+) in offers page$")
 public void user_searched_for_same_shortname_in_offers_page(String shortName) throws Throwable {
		dependencyInjection.driver.findElement(By.partialLinkText("Top Deals")).click();
		
		Set<String> activeWindows = dependencyInjection.driver.getWindowHandles();
		Iterator<String> a = activeWindows.iterator();
		String parent = a.next();
		String child = a.next();
		
		dependencyInjection.driver.switchTo().window(child);
		dependencyInjection.driver.findElement(By.id("search-field")).sendKeys(shortName);
		Thread.sleep(2000);
		dependencyInjection.offerPgProduct = dependencyInjection.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
		System.out.println("Offers page product is: " + dependencyInjection.offerPgProduct);
	}

	@And("^check is both products are same or not$")
	public void check_is_both_products_are_same_or_not() throws Throwable {
		Assert.assertEquals(dependencyInjection.landingPgProduct, dependencyInjection.offerPgProduct);
		dependencyInjection.driver.quit();
	}

}
