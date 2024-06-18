package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");					
	        WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();	 
		
		driver.get("https://jqueryui.com/slider/#colorpicker");
		// i gave some information like put windows is maximize
		driver.manage().window().maximize();
		// this website have iframe so should i found that then use switch to 
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		Actions action =new Actions(driver);
		WebElement blue = driver.findElement(By.xpath("//*[@id=\"blue\"]/span"));
		//action.contextClick(blue).perform();
		//action.doubleClick(blue).perform();
	   action.clickAndHold(blue).perform();
		
		
	}

}
