package com.adactin.Adactin_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

public class Adactin_Basepom extends Baseclass{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream fs = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Adactin_Project\\src\\main\\java\\Adactin.properties");
		
		Properties p = new Properties();
		
		p.load(fs);
		
		String un = p.getProperty("username");
		String pw = p.getProperty("password");
		String bw = p.getProperty("browser");
		String url = p.getProperty("url");
		String cn = p.getProperty("cardnumber");
		String cvv = p.getProperty("cvvnumber");
		String ct = p.getProperty("cardtype");
		String fsn = p.getProperty("firstname");
		String lsn = p.getProperty("lastname");
		String addrs = p.getProperty("address");
				
		
		get_Browser(bw);
		getURL(url);
		implicit_wait();
		
		 PageFactory.initElements(driver, Adactin_POM.class);
		 getinput(Adactin_POM.username,un);
		 getinput(Adactin_POM.passwrd,pw);
		 click_on_elememt(Adactin_POM.login);
		 sleep();
		 
		 Select_from_Dropdown(Adactin_POM.location,"London");
		 Select_from_Dropdown(Adactin_POM.hotel,"Hotel Sunshine");
		 Select_from_Dropdown(Adactin_POM.roomtype,"Deluxe");
		 Select_from_Dropdown(Adactin_POM.no_of_rooms,"3 - Three");
		 getinput(Adactin_POM.checkin_date,"29/12/2021");
		 getinput(Adactin_POM.checkout_date,"4.1.2022");
		 Select_from_Dropdown(Adactin_POM.adults, "2 - Two");
		 Select_from_Dropdown(Adactin_POM.childrens,"2 - Two");
		 click_on_elememt(Adactin_POM.search);
		 sleep();
		 
		click_on_elememt(Adactin_POM.radiobutton);
		click_on_elememt(Adactin_POM.continue1);
		sleep();
		
		getinput(Adactin_POM.FN,fsn);
		getinput(Adactin_POM.LN,lsn);
		getinput(Adactin_POM.ADRSS,addrs);
		getinput(Adactin_POM.CRD_NO,cn);
		getinput(Adactin_POM.CC_TYPE,ct);
		Select_from_Dropdown(Adactin_POM.EXP_MONTH,"May");
		Select_from_Dropdown(Adactin_POM.EXP_YEAR, "2022");
		getinput(Adactin_POM.CVV1,cvv);
		click_on_elememt(Adactin_POM.BOOKIT);
		sleep();
		
		click_on_elememt(Adactin_POM.plan);
		sleep();
		
		screenshot("C:\\Users\\Admin\\eclipse-workspace\\Adactin_Project\\SCREENSHOTS\\BOOKING_HISTORY.PNG");
		click_on_elememt(Adactin_POM.signout);
		close();
		
		
		
			
		
		 
		 
		 
		 
		
		
		
	
		
		
		
		
		
		
		

	}

}
