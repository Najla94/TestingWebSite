package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NajlaTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");					
	        WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();	 
		// open this website i want check
		driver.get("https://practicetestautomation.com/ ");
		// i gave some information like put windows is maximize
		driver.manage().window().maximize();
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	        js.executeScript("window.scrollTo(0, 1000)");
	        
	     //   driver.findElement(By.linkText("Core Java")).click();
//		driver.get("https://www.google.com");//open google
//		WebElement p=driver.findElement(By.name("q"));
//		p.sendKeys("javatpoint tutorials");
//	
//	      p.submit();


		 

	}

}
