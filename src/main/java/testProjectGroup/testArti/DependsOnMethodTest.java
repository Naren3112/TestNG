package testProjectGroup.testArti;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodTest {
	
	@Test
	public void atest1() {
		
		Assert.assertFalse(true);
		
	}

	@Test(dependsOnMethods = "atest1")
	public void btest2() {
		System.out.println("test 2 executed");
		
	}

	@Test
	public void ctest3() {

		System.out.println("test 3 executed");
	}
	
	@Test
	public void test4() {

		System.out.println("test 4 executed");
	}

}
