package UI;


import org.testng.annotations.Test;

import suite.SuiteClass;

public class GroupsTest2Suite extends SuiteClass{
		
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
