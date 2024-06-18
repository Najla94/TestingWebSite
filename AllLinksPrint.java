package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLinksPrint {

	// If have multiple browser need check, use identified browser in global
	public static String browser = "edge";
	// If want use all browser without change value i need identified all browser
	// whit webdriver
	public static WebDriver web;

	public static void main(String[] args) {
		if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
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
			web = new EdgeDriver();
		}

		// launch website want testing
		web.get("https://www.browserstack.com/");
		web.manage().window().maximize();
		// create list found tag name with a
		List<WebElement> link = web.findElements(By.tagName("a"));
		// print size link in the page
		System.out.println("totale: " + link.size());
		// create for loop about print all link
		for (int i = 0; i < link.size(); i++) {
			// print link from for loop of all create with href
			System.out.println("Link in the page is: " + link.get(i).getAttribute("href"));
			//print link and text for link
			System.out.println("Link in the page is: "+link.get(i).getText());

		}
	}

}
