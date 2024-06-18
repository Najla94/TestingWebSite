package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");					
	        WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();	 
		// open this website i want check
		driver.get("https://www.signupgenius.com/index.cfm?go=w.Welcome&prior=w.createSignUp&formName=registerForm ");
		// i gave some information like put windows is maximize
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("NAJLA");
		driver.findElement(By.name("firstname")).clear();
		System.out.println(driver.findElement(By.name("firstname")).getAttribute("id"));
		System.out.println(driver.findElement(By.xpath("//input[@value='Register Now']")).getCssValue(" background-color"));
		System.out.println(driver.findElement(By.xpath("//input[@value='Register Now']")).getSize());
		System.out.println(driver.findElement(By.xpath("//input[@value='Register Now']")).getLocation());
		System.out.println(driver.findElement(By.xpath("//input[@value='Register Now']")).getText());
		System.out.println(driver.findElement(By.xpath("//input[@value='Register Now']")).getTagName());
		System.out.println(driver.findElement(By.xpath("//input[@value='Register Now']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@value='Register Now']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[@value='Register Now']")).isSelected());

	}

}
