package testProjectGroup.testArti;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCase {
	
	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void test1() {
		
		Assert.assertEquals(false, false);
	}

	
	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void test2() {
	
		Assert.assertEquals(false, true);
	}
	
	
	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void test3() {
		Assert.assertEquals(false, false);
	}
}
