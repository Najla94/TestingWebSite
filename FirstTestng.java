package UI;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestng {
	
	@Test
	public void tittle() {
		
		String expected ="Online Flowers & Gifts Delivery in Mecca | Floward | Same-Day Flowers Delivery";
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		  driver.get("https://floward.com/en-sa/mecca/"); 
		  driver.manage().window().maximize(); 
		  String acutle = driver.getTitle();
		  
		  Assert.assertEquals(acutle, expected);
	}

}
