package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GoogleSearch {

 WebDriver driver = null;
 
 @Given("browser is open")
	public void browser_is_open() {
		// Initiate the Chrome-driver and open the browser.
		System.setProperty("webdriver.chrome.driver", "/Users/amitbarua/Downloads/chromedriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}


 @And("User is on google search page")
 public void user_is_on_google_search_page() {
  // Navigate to google.com
  driver.navigate().to("https://google.com");
 }


 @When("User enters a text in a search box")
 public void user_enters_a_text_in_a_search_box() {
  // In the google search box, enter any text - Say "Cucumber Test"
  driver.findElement(By.name("q")).sendKeys("Cucumber Test");
 }


 @And("hits Enter")
 public void hits_enter() {
 // Simulate the clicking of enter key
 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
 }


 @Then("User is navigated to search feature")
 public void user_is_navigated_to_search_feature() {
 // The test case should pass if the resulting page 
 // contains an expected text - Say ""What is Cucumber Test"
 driver.getPageSource().contains("Test automation Software"); 
 
 // Finally, closing driver after test is complete
   driver.close(); 
 
 }
}
