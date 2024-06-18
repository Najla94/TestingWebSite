package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");					
	        WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();	 
		
		//driver.get("https://formstone.it/components/checkbox/");
		driver.get("https://demo.guru99.com/test/radio.html");
		
	//	driver.get("https://demos.jquerymobile.com/1.4.5/checkboxradio-radio/");
		// i gave some information like put windows is maximize
		driver.manage().window().maximize();
		 WebElement radio1 =  driver.findElement(By.id("vfb-7-1"));
	  WebElement radio =  driver.findElement(By.id("vfb-7-2"));
	  radio1.click();
	  System.out.println(radio.isSelected());
	  System.out.println(radio1.isSelected());
	    Thread.sleep(1000);
	   // driver.findElement(By.xpath("//input[text()= ' Internet Explorer']]")).click();

	  //System.out.println(driver.findElements(By.xpath("//input[@type= 'checkbox']")).size());
	}

}
