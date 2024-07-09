package Data;

import org.testng.annotations.DataProvider;

public class DataCreate {
	
	@DataProvider(name = "test")
	public Object[][] create()
	{
		return new Object [][]{
				// create value data want use it in firstclass
			{"najla","najla@gmail.com",20},{"saad","saad@gmail.com",40}
				};
	}

}
