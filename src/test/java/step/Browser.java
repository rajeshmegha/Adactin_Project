package step;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.Adactin_Project.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Browser extends Baseclass {
	
	
	
	@Given("enter in to google browser")
	public void enter_in_to_google_browser() {

		get_Browser("chrome");
		getURL("https://www.google.com/");
		driver.manage().window().maximize();

	}
	@When("type iphone in the google search option")
	public void type_iphone_in_the_google_search_option() {
		WebElement GB = driver.findElement(By.name("q"));
		GB.sendKeys("iphone");

	}
	@Then("click on the google search button")
	public void click_on_the_google_search_button() throws AWTException {
		//WebElement gbs = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]"));
		//gbs.click();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}


	
	/*WebDriver driver;
	
	@Given("enter in to google browser")
	public void enter_in_to_google_browser() throws InterruptedException {
		get_Browser("chrome");
		getURL("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
	@When("type iphone in the google search option")
	public void type_iphone_in_the_google_search_option() {

		WebElement GB = driver.findElement(By.name("q"));
		GB.sendKeys("iphone");
		

	}
	@When("click on the google search button")
	public void click_on_the_google_search_button() {
		
		driver.findElement(By.name("btnK")).click();
    
	}

	

	/*@Given("check internet connection")
	public void check_internet_connection() {

	}
	@When("click on the google chrome icon")
	public void click_on_the_google_chrome_icon() throws InterruptedException {
		
		get_Browser("chrome");
		sleep();
		
		}
	@When("type iphone in the google search field")
	public void type_iphone_in_the_google_search_field() {

    WebElement searchfield = driver.findElement(By.id("input"));
    searchfield.sendKeys("iphone");

	}
	@Then("it should navigate to the iphone page")
	public void it_should_navigate_to_the_iphone_page() {
		
		

	}*/



}
