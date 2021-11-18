package step;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.adactin.Adactin_Project.Baseclass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fb_WITHOUT_HEADER extends Baseclass{

	
	@Given("the user is on login window")
	public void the_user_is_on_login_window() {
        
		get_Browser("chrome");
    	getURL("https://www.facebook.com/"); 
	}
	
	
	@When("the user enters the credentiels")
	public void the_user_enters_the_credentiels(DataTable dataTable) {

	List<String> asList = dataTable.asList(String.class);
	String un = asList.get(0);
	String pw = asList.get(1);
	
	WebElement userName = driver.findElement(By.id("email"));
	userName.sendKeys(un);
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys(pw);
	
	}
	
	@When("the user clicks on the login button field")
	public void the_user_clicks_on_the_login_button_field() {

		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}
	@Then("the user shoukd navigates to the home page")
	public void the_user_shoukd_navigates_to_the_home_page() {

	
	}

}
