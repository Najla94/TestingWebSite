package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");					
	        WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();	 
		
		driver.get("https://extendsclass.com/xpath-tester.html");
		// i gave some information like put windows is maximize
		driver.manage().window().maximize();
		
		// this website have iframe so should i found that then use switch to 
		Thread.sleep(2000);

		WebElement Key = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[5]/pre"));
		Actions source = new Actions(driver);
		// is mean click all sentence then take copy
		source.keyDown(Key, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(2000);
		WebElement second = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[6]/div[2]/div/div[6]/div[1]/div/div"));
		// // is mean click all sentence then do paste 
		source.keyDown(second, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	}

}
