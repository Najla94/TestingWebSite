package UI;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skip {
	
	Boolean data = false;
	@Test (enabled =false)
	public void skiptest() {
		System.out.println("this function don't found");
	}
	@Test 
	public void skiptest2() {
		System.out.println("this function i found");
	}

	@Test
	public void skiptest3() {
		System.out.println("this function do it skip ");
		throw new SkipException("skip there");
	}
	
	@Test
	public void skiptest4() {
		if(data == true) {
			System.out.println("this function do it skip ");
		}
		else {
			System.out.println("this function don't there ");
			throw new SkipException("skip function in this way");
		}
		
	}


}
