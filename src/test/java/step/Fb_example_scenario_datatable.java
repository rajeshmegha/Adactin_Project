package step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.adactin.Adactin_Project.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Fb_example_scenario_datatable extends  Baseclass{


	@Given("the user is on login form")
	public void the_user_is_on_login_form() {
		 get_Browser("chrome");
	     getURL("https://www.facebook.com/");

	}
	@When("the user enters the below credentiels {string} and {string}")
	public void the_user_enters_the_below_credentiels_and(String username, String password) {

		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys(username);
		WebElement password1 = driver.findElement(By.id("pass"));
		password1.sendKeys(password);

	}
	@When("the user clicks on the login field")
	public void the_user_clicks_on_the_login_field() throws InterruptedException {
		driver.findElement(By.name("login")).click();
		sleep();

	}
}
