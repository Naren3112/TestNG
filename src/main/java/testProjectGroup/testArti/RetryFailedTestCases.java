package testProjectGroup.testArti;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases implements IRetryAnalyzer{
	
	int counter=0;
	int retryLimit=3;

	@Override
	public boolean retry(ITestResult arg0) {
		if(counter<retryLimit) {
			counter++;
			return true;
		}
		
		// TODO Auto-generated method stub
		return false;
	}

}
