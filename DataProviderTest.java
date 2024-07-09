package Data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataProviderTest{
	
	@Test(dataProvider= "dataSet")
	public void testing(String username, String password) {
		System.out.println(username+ "======="+ password);
	}
	
	@Test(dataProvider= "dataSet1")
	public void testing1(String username, String password , String test) {
		System.out.println(username+ "======="+ password+  "======="+ test);
	}

	@DataProvider
	public Object[][] dataSet1() {
	return new Object[][]{
			{"username","password","test"},
			{"username1","password1","test1"},
			{"username2","password2","test2"},
			{"username3","password3","test3"}
	};
	}
	
	@DataProvider
	public Object[][] dataSet() {
		Object[][] data= new Object[4][2];
		
		data[0][0]="user1";
		data[0][0]="pass1";
		
		data[1][0]="user2";
		data[1][0]="pass2";
		
		data[2][0]="user3";
		data[2][0]="pass3";
		
		data[3][0]="user4";
		data[3][0]="pass4";
		
		return data;
	}

}
