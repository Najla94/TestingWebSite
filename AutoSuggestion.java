package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");					
	        WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();	 
		// open this website i want check
		/*
		 * driver.get("https://www.youtube.com/"); // i gave some information like put
		 * windows is maximize driver.manage().window().maximize();
		 * driver.findElement(By.xpath("//input[@id='search']")).click(); WebElement
		 * form = driver.findElement(By.xpath("//input[@id='search']"));
		 * form.sendKeys("art"); Thread.sleep(1000); form.sendKeys(Keys.ARROW_DOWN);
		 * Thread.sleep(1000); form.sendKeys(Keys.ENTER); Thread.sleep(1000);
		 */
		driver.get("https://www.expedia.sa/Hotels");
		// i gave some information like put windows is maximize
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@aria-label='Going to']")).click();
		WebElement form = driver.findElement(By.xpath("//input[@placeholder='Going to']"));
		form.sendKeys("Jeddah");
		Thread.sleep(1000);
		form.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		form.sendKeys(Keys.ENTER);

	
	}

}
