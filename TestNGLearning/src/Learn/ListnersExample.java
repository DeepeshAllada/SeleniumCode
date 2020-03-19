package Learn;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersExample implements ITestListener {
	
	//ITestListner interface which implements TestNG Listners.
	
	//It is mandatory to tell in testng.xml file where this ListnersExample java file is located
	//check in testng.xml file how it is mentioned
	
	@Override
	public void onTestStart(ITestResult result) {
		//this code will be executed before every test. It is like @BeforeTest
		System.out.println("onTestStart Listner");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSuccess Listner" + result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
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
