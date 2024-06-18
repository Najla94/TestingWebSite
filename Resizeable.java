package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizeable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");					
	        WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();	 
		
		driver.get("https://jqueryui.com/resizable/");
		// i gave some information like put windows is maximize
		driver.manage().window().maximize();
		// this website have iframe so should i found that then use switch to 
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		WebElement resizable =driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		Actions action =new Actions(driver);
		//mean move to element:  Shifts the mouse pointer to the center of the element
		action.dragAndDropBy(resizable, 100, 50).perform();
		
	}

}
