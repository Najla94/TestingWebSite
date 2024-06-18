package UI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		
		
		  driver.get("https://demo.guru99.com/test/guru99home/"); 
		  driver.manage().window().maximize(); 
		  driver.switchTo().frame("a077aa5e");
		  driver.findElement(By.xpath("/html/body/a/img")).click( );
		 

		
	}

}
