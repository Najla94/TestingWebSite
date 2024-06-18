package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");					
	        WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();	 
		
		driver.get("https://floward.com/en-sa/mecca/?gad_source=1&gclid=CjwKCAjwmrqzBhAoEiwAXVpgorlXtehItkqXTqN1Ok81VmspCemHbo-0r5ut4uBDaqLCowUbOquydBoCrQcQAvD_BwE");
		// i gave some information like put windows is maximize
		driver.manage().window().maximize();
		WebElement mouse =driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div/div[1]/div[1]/ul/li[3]/div[1]/a"));
		Actions action =new Actions(driver);
		//mean move to element:  Shifts the mouse pointer to the center of the element
		action.moveToElement(mouse).perform();
		
	}

}
