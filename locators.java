package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.locators.RelativeLocator;

public class locators {

	// If have multiple browser need check, use identified browser in global
	public static String browser = "edge";
	// If want use all browser without change value i need identified all browser
	// whit webdriver
	public static WebDriver web;

	public static void main(String[] args) {
		if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			// identify variable then take new value for web browser,use chromedriver
			// install webdriver here
			web = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			// launch web browser use with maven
			WebDriverManager.chromedriver().setup();
			// identify variable then take new value for web browser,use chromedriver
			// install webdriver here
			web = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			// launch web browser use with maven
			WebDriverManager.edgedriver().setup();
			// identify variable then take new value for web browser,use chromedriver
			// install webdriver here
			web = new EdgeDriver();
		}

		// launch website want testing
		web.get("https://www.saucedemo.com/");
		//relative locators 
		// use webelement then var = var connection with webdriver findelement use locators
		WebElement name = web.findElement(By.id("user-name"));
		// i need use by then identified var = create relative locators 
		//RELITAVE LOCATORS = above(),below(),ToRightOf(),ToLiftOf(),near()
		By username = RelativeLocator.with(By.tagName("input")).below(name);
		web.findElement(username).sendKeys("standard_user");

	}

}
