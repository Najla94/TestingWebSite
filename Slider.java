package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");					
	        WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();	 
		
		driver.get("https://jqueryui.com/slider/");
		// i gave some information like put windows is maximize
		driver.manage().window().maximize();
		// this website have iframe so should i found that then use switch to 
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		WebElement slider =driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		Actions action =new Actions(driver);
		//mean dragAndDropBy: performed using a mouse when a user moves (drags) a web element from one location and then places (drops) it at another point
		action.dragAndDropBy(slider, 100, 50).perform();
		
	}

}
