package listener;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter{
	
	public void onTestFailure(ITestResult tr) {
		String testcase = tr.getName();
		System.out.println(">>>"+testcase+" --> Failed");
	}
	
	public void onTestSuccess(ITestResult tr) {
		String testcase = tr.getName();
		System.out.println(">>>"+testcase+" --> Passed");
	}
	
	public void onTestSkipped(ITestResult tr) {
		String testcase = tr.getName();
		System.out.println(">>>"+testcase+" --> Skipped");
	}

}
