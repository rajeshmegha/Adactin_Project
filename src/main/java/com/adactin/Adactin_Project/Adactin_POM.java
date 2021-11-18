package com.adactin.Adactin_Project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adactin_POM {
	
	
	@FindBy(id ="username")
	public static WebElement username;
	
	@FindBy (id="password")
	public static WebElement passwrd;
	
	@FindBy(xpath = "//input[@id='login']")
	public static WebElement login;
	
	@FindBy(id="location")
	public static WebElement location;
	
	@FindBy(id="hotels")
	public static WebElement hotel;
	
	@FindBy(id="room_type")
	public static WebElement  roomtype;
	
	@FindBy(id="room_nos")
	public static WebElement no_of_rooms;
	
	@FindBy(id="datepick_in")
	public static WebElement checkin_date;
	
	@FindBy(id="datepick_out")
	public static WebElement checkout_date;
	
	@FindBy(id="adult_room")
	public static WebElement adults;
	
	@FindBy(id="child_room")
	public static WebElement childrens;
	
	@FindBy(id="Submit")
	public static WebElement search;
	
	@FindBy(id="radiobutton_0")
	public static WebElement radiobutton;
	
	@FindBy (id="continue")
	public static WebElement continue1;
	
	@FindBy (id="first_name")
	public static WebElement FN;
	
	@FindBy(id = "last_name")
	public static WebElement LN;
    
	@FindBy (id="address")
	public static WebElement ADRSS;
	
	@FindBy(id="cc_num")
	public static WebElement  CRD_NO;
	
	@FindBy (id="cc_type")
	public static WebElement CC_TYPE;
	
	@FindBy(id = "cc_exp_month")
	public static WebElement EXP_MONTH;
	
	@FindBy(id="cc_exp_year")
	public static WebElement EXP_YEAR;
	
	@FindBy(id = "cc_cvv")
	public static WebElement CVV1;
	
	@FindBy(id="book_now")
	public static WebElement BOOKIT;
	
	@FindBy(id="my_itinerary")
	public static WebElement plan;
	
	@FindBy(id="logout")
	public static WebElement signout;


}
