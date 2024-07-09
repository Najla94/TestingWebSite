package UI;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

    @Test
    public class ScrollBy {

	public void down() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	 	 
		
				
        //Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;		
        		
        //Launching the Site.		
        driver.get("https://www.guru99.com/execute-javascript-selenium-webdriver.html");     
        //Maximize window		
        driver.manage().window().maximize();		
        		
        //Vertical scroll down by 600  pixels		
        js.executeScript("window.scrollBy(0,600)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(600,0)");
	}
	
	@Test
	public void up() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	 	 
		
				
        //Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;		
        		
        //Launching the Site.		
        driver.get("https://www.guru99.com/execute-javascript-selenium-webdriver.html");     
        //Maximize window		
        driver.manage().window().maximize();		
        		
        //Vertical scroll down by 600  pixels		
        js.executeScript("window.scrollBy(600,0)");
	}

}
