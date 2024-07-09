package Data;

import org.testng.annotations.Test;

public class DataOutPut {
	
	@Test(dataProvider= "test", dataProviderClass=DataCreate.class )
	// create parameter about new class
	public void data1(String name, String email, int age) {
		System.out.println(name+"  "+ email+ "  "+age);
	}

}
