package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertTesting {
	
	@Test
	public void tittle() {
		//are the asserts which continue the execution even after the Assert condition fails.
		SoftAssert soft = new SoftAssert();
		String expected ="Online Flowers & Gifts Delivery in Mecca | Floward | Same-Day Flowers Delivery";
		String extext = "search";
		 WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();	
		  driver.get("https://floward.com/en-sa/mecca/"); 
		  String acutle = driver.getTitle();
		  String actext = driver.findElement(By.xpath("//*[@id=\"autocomplete-0-input\"]")).getAttribute("type") ;
		  System.out.println("tittle done");
		  soft.assertEquals(acutle, expected);
		  System.out.println("text done");
		  soft.assertEquals(acutle, expected, "texttype");
		  soft.assertAll();
		  
	}

}
