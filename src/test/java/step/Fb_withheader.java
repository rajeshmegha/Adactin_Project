package step;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.adactin.Adactin_Project.Baseclass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fb_withheader extends Baseclass {

	@Given("the user should be on login window")
	public void the_user_should_be_on_login_window() {
		get_Browser("chrome");
    	getURL("https://www.facebook.com/"); 
	}
	@When("the user enters the following  credentiels")
	public void the_user_enters_the_following_credentiels(DataTable dataTable) {
		
		List<Map<String, String>> asMaps = dataTable.asMaps(String.class,String.class);
		
		String un = asMaps.get(0).get("username");
		String pw = asMaps.get(0).get("password");
		
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys(un);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(pw);
	}
	@Then("the user clicks on the login button options")
	public void the_user_clicks_on_the_login_button_options() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
}



}
