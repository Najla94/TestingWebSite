package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	// If have multiple browser need check, use identified browser in global
	public static String browser = "edge";
	// If want use all browser without change value i need identified all browser whit webdriver
	public static WebDriver web;
	public static void main(String[] args) throws InterruptedException {
		if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 web = new FirefoxDriver();
		} 
		else if(browser.equalsIgnoreCase("chrome"))
		{
			// launch web browser use with maven
			WebDriverManager.chromedriver().setup();
			// identify variable then take new value for web browser,use chromedriver install webdriver here
			 web = new ChromeDriver();
		} 
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			 web = new EdgeDriver();
		} 
		//web.get("https://www.similarweb.com/top-websites/");//launch website want testing
		web.get("https://demo.guru99.com/test/newtours/register.php");
		// locators use css selector ,	// test with element by 3 ways id,name and xpath in the website and enter
		web.manage().window().maximize();
		// Declare webelemnt 
		WebElement dropdown= web.findElement(By.name("country"));
		// Identifier select var take var from webelement
		Select sel = new Select(dropdown);
		// Defiant value choose
		sel.selectByValue("ALBANIA");
		Thread.sleep(2000);
		// Defiant value want visible choose
		sel.selectByVisibleText("AMERICAN SAMOA");
		Thread.sleep(2000);
		// Defiant value index clear
		sel.selectByIndex(4);
		
	}

}
