package listeners;

import java.io.IOException;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Testlisteners implements ITestListener {
	
	

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("ITestContext: " +result.getEndDate());
		
	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println("Onstart :" +result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Testfailed :" + result.getMethod().getPriority());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testskipped: " + result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Teststarted: " + result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testsuccess :" +result.getName());
		
	}

}
