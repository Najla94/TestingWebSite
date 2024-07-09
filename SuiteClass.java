package suite;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteClass {

	// if i need use suite create new package then class then do extends this class inside another package
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("aftersuite");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite");
	}
}
