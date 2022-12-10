package TestNG_Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("Test"+result.getName()+" Starts");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test"+result.getName()+" Pass");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("Test"+result.getName()+" Failed");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test"+context.getName()+" Starts");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test"+context.getName()+" Ends");
	}
	
	

}
