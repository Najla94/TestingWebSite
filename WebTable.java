package UI;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();

	      WebDriver driver = new ChromeDriver();
		  driver.get("https://www.nyse.com/data-insights/all"); 
	      // should use list, because have many data
		  // take xpath for row without number, because i want all data 
	      List<WebElement> row= driver.findElements(By.xpath("//*[@id=\"integration-id-ccfec19\"]/div[1]/div[3]/div[3]/div[1]/table/tbody/tr"));
			System.out.println(row.size());
			int rowsize = row.size();
			Thread.sleep(1000);
			// take xpath for column without number, because i want all data 
			List<WebElement> column= driver.findElements(By.xpath("//*[@id=\"integration-id-ccfec19\"]/div[1]/div[3]/div[3]/div[1]/table/tbody/tr[1]/td"));
			// print number of size, then declare that
			System.out.println(column.size());
			int columnsize = column.size();
			// mean i need do all that many time so i need for loop with two var, should first value is 1
			for(int i=1; i<=rowsize; i++) {
				for( int j=1; j<=columnsize; j++) {
					// do all change in xpath about var and increase many time like: (row)tr[" + i +"]/(column)td[" + j + "]
					System.out.println(driver.findElement(By.xpath("//*[@id=\"integration-id-ccfec19\"]/div[1]/div[3]/div[3]/div[1]/table/tbody/tr[" + i +"]/td[" + j + "]")).getText());
				}
			}

			/*
			 * driver.get("https://demo.guru99.com/test/web-table-element.php");
			 * driver.manage().window().maximize(); driver.manage().deleteAllCookies();
			 * 
			 * 
			 * List<WebElement> row=
			 * driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
			 * System.out.println(row.size()); int rowsize = row.size(); Thread.sleep(1000);
			 * List<WebElement> column= driver.findElements(By.xpath(
			 * "//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td"));
			 * System.out.println(column.size()); int columnsize = column.size();
			 * 
			 * for(int i=1; i<=rowsize; i++) { for( int j=1; j<=columnsize; j++) {
			 * System.out.println(driver.findElement(By.xpath(
			 * "//*[@id=\"leftcontainer\"]/table/tbody/tr["+ i + "]/td["+ j
			 * +"]")).getText()); } }
			 */

		
	}

}
