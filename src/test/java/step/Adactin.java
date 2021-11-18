package step;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.adactin.Adactin_Project.Adactin_POM;
import com.adactin.Adactin_Project.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Adactin extends Baseclass {
	
	@Given("go in to the loginpage")
	public void go_in_to_the_loginpage() throws IOException {
		get_Browser(dataProp().getProperty("browser"));
		getURL(dataProp().getProperty("url"));
		implicit_wait();
	   PageFactory.initElements(driver, Adactin_POM.class);
	}
	@When("enter the username")
	public void enter_the_username() throws IOException {
		getinput(Adactin_POM.username, dataProp().getProperty("username"));
	}
	@When("enter the password")
	public void enter_the_password() throws IOException {
		getinput(Adactin_POM.passwrd, dataProp().getProperty("password"));
	}
	@Then("click on  login button")
	public void click_on_login_button() {
	    click_on_elememt(Adactin_POM.login);
	}
	
  @Given("select location from dropdown list field")
	public void select_location_from_dropdown_list_field() {
	Select_from_Dropdown(Adactin_POM.location,"London");}
	
	
	@When("select the hotel from dropdown list field")
	public void select_the_hotel_from_dropdown_list_field() {
		Select_from_Dropdown(Adactin_POM.hotel,"Hotel Sunshine");}
	
	@When("select the room type from dropdown list field")
	public void select_the_room_type_from_dropdown_list_field() {
		 Select_from_Dropdown(Adactin_POM.roomtype,"Deluxe");}
	
	@When("select the numberof rooms from dropdown list field")
	public void select_the_numberof_rooms_from_dropdown_list_field() {
		Select_from_Dropdown(Adactin_POM.no_of_rooms,"3 - Three");}
	
	
	@When("select the checkin date in field")
	public void select_the_checkin_date_in_field() {
		getinput(Adactin_POM.checkin_date,"29/12/2021");}
	
	@When("select the checkout date in field")
	public void select_the_checkout_date_in_field() {
		getinput(Adactin_POM.checkout_date,"4.1.2022");}
	
    @When("select nnumber of adult in field")
     public void select_nnumber_of_adult_in_field() {
		Select_from_Dropdown(Adactin_POM.adults, "2 - Two");}
	
	@When("select number of children in field")
	public void select_number_of_children_in_field() {
		Select_from_Dropdown(Adactin_POM.childrens,"2 - Two");}
	
	@Then("user should click the search button")
	public void user_should_click_the_search_button() {
		click_on_elememt(Adactin_POM.search);}
	
     @Given("checking the hotel profile")
	public void checking_the_hotel_profile() {
	
	}
	
	@When("click on the Radio button to select the hotel")
	public void click_on_the_radio_button_to_select_the_hotel() {
		click_on_elememt(Adactin_POM.radiobutton);}
	
	@Then("click the continue button to navigate to payment page")
    public void click_the_continue_button_to_navigate_to_payment_page() {
		click_on_elememt(Adactin_POM.continue1);}
	
	@Given("user should Enter your firstname")
	public void user_should_enter_your_firstname() throws IOException {
		getinput(Adactin_POM.FN,dataProp().getProperty("firstname"));
	}
	
	@When("user should Enter your lastname")
	public void user_should_enter_your_lastname() throws IOException {
		getinput(Adactin_POM.LN,dataProp().getProperty("lastname"));}

     @When("user should Enter your billing address")
	public void user_should_enter_your_billing_address() throws IOException {
		getinput(Adactin_POM.ADRSS,dataProp().getProperty("address"));}
	
	@When("user should Enter your valid credit card number")
	public void user_should_enter_your_valid_credit_card_number() throws IOException {
		getinput(Adactin_POM.CRD_NO,dataProp().getProperty("cardnumber"));}
	
	@When("user should select creditcard typr from dropdown list")
	public void user_should_select_creditcard_typr_from_dropdown_list() throws IOException {
		getinput(Adactin_POM.CC_TYPE,dataProp().getProperty("cardtype"));}
	
    @When("user should select expiry date and year")
	public void user_should_select_expiry_date_and_year() {
		Select_from_Dropdown(Adactin_POM.EXP_MONTH,"May");
	    Select_from_Dropdown(Adactin_POM.EXP_YEAR, "2022");}
	
	@When("user should enter valid cvv number")
	public void user_should_enter_valid_cvv_number() throws IOException {
		getinput(Adactin_POM.CVV1,dataProp().getProperty("cvvnumber"));}
	
	@Then("user should click on the book now button")
	public void user_should_click_on_the_book_now_button() {
		click_on_elememt(Adactin_POM.BOOKIT);}
	
	@Given("user should check the itinerary details")
	public void user_should_check_the_itinerary_details() {

	}
	
	@When("user should check the order id details")
	public void user_should_check_the_order_id_details() {
		click_on_elememt(Adactin_POM.plan);}
	
	
	@When("user should take screenshots of the booking history")
	public void user_should_take_screenshots_of_the_booking_history() throws IOException {
		screenshot("C:\\Users\\Admin\\eclipse-workspace\\Adactin_Project\\SCREENSHOTS\\BOOKING_HISTORY.PNG");}
	
	
	@Then("finally click on the logout button")
	public void finally_click_on_the_logout_button() {
		click_on_elememt(Adactin_POM.signout);
		
	}

}
