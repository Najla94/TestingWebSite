package Data;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener  {
	
	// should use <listeners> in xml fail then write name of class
	public void onTestStart(ITestResult result) {  
		System.out.println("testing is done");
		Assert.assertTrue(false);
		}  
		  
		@Override  
		public void onTestSuccess(ITestResult result) {  
		// TODO Auto-generated method stub  
		//System.out.println("Success of test cases and its details are : "+result.getName());  
		}  
		  
		@Override  
		public void onTestFailure(ITestResult result) {  
		// TODO Auto-generated method stub  
		//System.out.println("Failure of test cases and its details are : "+result.getName());  
		}  
		  
		@Override  
		public void onTestSkipped(ITestResult result) {  
		
		}  
		  
		@Override  
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
		
		}  
		  
		@Override  
		public void onStart(ITestContext context) {  
		// TODO Auto-generated method stub  
		}  
		  
		@Override  
		public void onFinish(ITestContext context) {  
		// TODO Auto-generated method stub  
		} 

}
