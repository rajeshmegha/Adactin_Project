package step;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.Adactin_Project.Baseclass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Facebook_login extends Baseclass {

	//
	WebDriver driver;
	
	
	@Given("enter in to the fb url")
	public void enter_in_to_the_fb_url() {
		get_Browser("chrome");
		getURL("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@When("user must enter the credentiels")
	public void user_must_enter_the_credentiels(DataTable fb_datas) {
		
		List<String> cred = fb_datas.asList(String.class);
		String un = cred.get(0);
		String pw = cred.get(1);
		
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys(un);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(pw);

	}
	
	@Then("user must clicks the login button")
	public void user_must_clicks_the_login_button() throws InterruptedException {

	driver.findElement(By.name("login")).click();
	sleep();
	}

}
