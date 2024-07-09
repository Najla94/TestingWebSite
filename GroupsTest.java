package UI;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsTest {
	
	// If want do test with groups click right then configuration then choose group

	@BeforeGroups(value="text")
	public void beforegroup() {
		System.out.println("before group");
	}
	@AfterGroups(value="text")
	public void aftergroup() {
		System.out.println("after group");
	}
	
	
	@Test(priority=1,groups="text")
	public void Atest() {
		System.out.println("testing1");
	}


	@Test(priority=2,groups="text")
	public void Btest() {
		System.out.println("testing2");
	}


	@Test(groups={"text","title","num"})
	public void Ctest() {
		System.out.println("testing3");
	}


	@Test(groups={"text","num"})
	public void Dtest() {
		System.out.println("testing4");
	}


	@Test(groups={"num"})
	public void Etest() {
		System.out.println("testing5");
	}


}
