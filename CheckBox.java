package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");					
	        WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();	 
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		// i gave some information like put windows is maximize
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@value= 'red']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@value= 'red']")).click();

	  System.out.println(driver.findElements(By.xpath("//input[@type= 'checkbox']")).size());
	}

}
