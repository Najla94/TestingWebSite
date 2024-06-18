package UI;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiWindowes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
	
        
        // Alert Message handling
                    		
        driver.get("https://tools.pingdom.com/");			
                            		
     driver.manage().deleteAllCookies();
     
    
     driver.findElement(By.xpath("/html/body/app-root/main/app-home-hero/header/app-cta-bar/section/div/div[1]/div/a")).click();
     Set<String> multi =driver.getWindowHandles();
     System.out.println(multi);
     // use iterator method when i want test multiwindows that mean collection interface
     Iterator<String> ITE = multi.iterator();
     // basic window
     String parent =ITE.next();
     // print address
     System.out.println(parent);
     // child window i want do test, mean next is:Returns the next element in the collection.
     String child =ITE.next();
     System.out.println(child);
     // go to second window
     driver.switchTo().window(child);
     driver.manage().deleteAllCookies();
     // do it all that
     Thread.sleep(2000);
     driver.findElement(By.id("sw19_first_name")).sendKeys("na");
     driver.findElement(By.id("sw19_last_name")).sendKeys("ntygujka");
     Thread.sleep(2000);
     // go back to basic window
     driver.switchTo().window(parent);
     
    
	
	}

}
