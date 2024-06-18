package UI;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.locators.RelativeLocator;

public class BasicMethodWebDriver {

	// If have multiple browser need check, use identified browser in global
	public static String browser = "chrome";
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
		// control of option
		web.manage().window().maximize();
		// get current web
		String current = web.getCurrentUrl();
		System.out.println(current);
		// get information of source
		String source = web.getPageSource();
		System.out.println(source);
		// get tittle link
		String tittle = web.getTitle();
		System.out.println(tittle);

		// web.navigate().to("https://www.selenium.dev/downloads/");

		web.findElement(By.id("user-name")).sendKeys("standard_user");
		web.findElement(By.name("password")).sendKeys("secret_sauce");
		web.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		List<WebElement> element = web.findElements(By.xpath("//div[@class ='inventory_list']/div"));
		System.out.println(element);

		web.navigate().to("https://2024.seleniumconf.in/submit-a-proposal/");
		String window = web.getWindowHandle();
		System.out.println(window);

		web.findElement(By.xpath("//*[@id=\"link_text-209-5749\"]")).click();
		Set<String> handels = web.getWindowHandles();
		System.out.println(handels);
		web.quit();

		// web.close();

	}

}
