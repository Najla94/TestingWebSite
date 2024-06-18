package UI;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TypesWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");					
	        WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();	 
		
		driver.get("https://floward.com/en-sa/mecca/?gad_source=1&gclid=CjwKCAjwmrqzBhAoEiwAXVpgorlXtehItkqXTqN1Ok81VmspCemHbo-0r5ut4uBDaqLCowUbOquydBoCrQcQAvD_BwE");
		// i gave some information like put windows is maximize
		driver.manage().window().maximize();
		// implicit wait
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement mouse =driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div/div[1]/div[1]/ul/li[3]/div[1]/a"));
		Actions action =new Actions(driver);
		//mean move to element:  Shifts the mouse pointer to the center of the element
		action.moveToElement(mouse).perform();
		// fluent wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("hello")
				.ignoring(NoSuchElementException.class);
				
		
		//Explicit wait
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div/div[1]/div[1]/ul/li[3]/div[1]/a"))).click();
		
	}

}
