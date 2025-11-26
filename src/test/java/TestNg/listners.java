package TestNg;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//r8 click on class click source click override/implement method
//all method implements
//listners is something is use to listne the event
public class listners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");	}

	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");	}


	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeout");	}

	public void onStart(ITestContext context) {
		System.out.println("onStart");
	}

	public void onFinish(ITestContext context) {
		System.out.println("onFinish");	}
	

}
