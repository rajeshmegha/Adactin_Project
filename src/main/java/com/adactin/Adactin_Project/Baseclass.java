package com.adactin.Adactin_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static WebDriver driver;

	public static  Properties dataProp() throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Adactin_Project\\src\\test\\java\\Adactin1.properties");

		Properties prop = new Properties();
		prop.load(fis);
		return prop;

	 

	}
	
   public static WebDriver get_Browser(String browser_name) {

		// BROWSERLAUNCH

		if (browser_name.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\eclipse-workspace\\Adactin_Project\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browser_name.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Admin\\eclipse-workspace\\SELINIUM_PROJECTS\\DRIVER\\geckodriver.exe");

			driver = new FirefoxDriver();
		} else if (browser_name.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Admin\\eclipse-workspace\\SELINIUM_PROJECTS\\DRIVER\\msedgedriver.exe");

			driver = new EdgeDriver();

		} else {
			System.out.println("INVALID BROWSER NAME");
		}

		driver.manage().window().maximize();

		return driver;

	}

	public static void Select_from_Dropdown(WebElement element, String value) {

		Select s = new Select(element);

		// s.selectByValue(value);
		s.selectByVisibleText(value);
		// s.selectByIndex(index);

	}
	// get url

	public static void getURL(String value) {

		driver.get(value);
	}

	// get sendkeys

	public static void getinput(WebElement element, String value) {
		element.sendKeys(value);
	}

	// thread

	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);

	}
	// getclicks

	public static void click_on_elememt(WebElement clk) {
		clk.click();
	}

	// closing driver

	public static void close() {
		driver.close();
	}
	// close all_windows

	public static void quit(WebElement element) {
		driver.quit();
	}

	public static void dropdown(WebElement element, int index, String value, String value1) {

		Select sel = new Select(element);
		sel.selectByIndex(index);
		sel.selectByValue(value);
		sel.selectByVisibleText(value1);

	}
	// navigate methods

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void back() {
		driver.navigate().back();
	}

	// windowhandling

	public static void windowhandles(String value) {
		driver.switchTo().window(value);
	}

	public static void Enable(WebElement e) {
		e.isEnabled();
	}

	public static void Select(WebElement s) {
		s.isSelected();
	}

	public static void Disable(WebElement d) {
		d.isDisplayed();
	}

	// implementing checkbox click

	public static void chk_box(WebElement chkbox) {
		chkbox.click();
	}

	// getattribute

	public static void get_attribute(WebElement element, String value) {

		element.getAttribute(value);

	}

	// getting currenturl

	public static void get_currenturl() {
		driver.getCurrentUrl();
	}

	// getting title

	public static void get_title() {
		driver.getTitle();
	}

	// implementing screenshot

	public static void screenshot(String path) throws IOException {
		TakesScreenshot shot = (TakesScreenshot) driver;
		File source = shot.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
	}

	// implementing actionclass

	public static void mouse_action(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	// implementing robotclass

	public static void key_Robot() throws AWTException {
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}

	// implementing javascript

	public static void jv_script(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}

	// default content
	public static void parent_window() {

		driver.switchTo().defaultContent();

	}

	// implementing implicity wait

	public static void implicit_wait() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	// implementing frames

	public static void iframes(WebElement element) {
		driver.switchTo().frame(element);

	}

	// implementing alert

	public static void alert(WebElement element) {

		driver.switchTo().alert();

	}

	// implementing explicity wait

	public static void explicit_wait(WebElement element) {
		// WebDriverWait wait = new WebDriverWait(driver,30);
	}

	public static void Dropdown(WebElement element) {

	}

}
