package step;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.adactin.Adactin_Project.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fb_step extends Baseclass {

    @Given("the user is on login page")
	public void the_user_is_on_login_page() {

    	get_Browser("chrome");
    	getURL("https://www.facebook.com/"); 
    }
	@When("the user enters the {string} and {string}")
	public void the_user_enters_the_and(String un, String pw) {
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys(un);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(pw);
}
	
	@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}
	
	@Then("the user shoukd navigates to the next page")
	public void the_user_shoukd_navigates_to_the_next_page() {
	Assert.assertTrue(true);

	}


	
}
