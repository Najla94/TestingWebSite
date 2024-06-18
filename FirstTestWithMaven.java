package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestWithMaven {

	// If have multiple browser need check, use identified browser in global
	public static String browser = "edge";
	// If want use all browser without change value i need identified all browser whit webdriver
	public static WebDriver web;
	public static void main(String[] args) {
		if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			// identify variable then take new value for web browser,use chromedriver install webdriver here
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
			// launch web browser use with maven
			WebDriverManager.edgedriver().setup();
			// identify variable then take new value for web browser,use chromedriver install webdriver here
			 web = new EdgeDriver();
		} 
		
		//launch website want testing
		web.get("https://www.saucedemo.com/");
		// locators use css selector
		// web.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		// test with element by 3 ways id,name and xpath in the website and enter
		web.findElement(By.id("user-name")).sendKeys("standard_user");
		web.findElement(By.name("password")).sendKeys("secret_sauce");
		web.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		//web.close();
		
		
		
	}

}
