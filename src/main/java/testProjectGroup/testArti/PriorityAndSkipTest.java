package testProjectGroup.testArti;

import org.testng.annotations.Test;

/*
 * Testng will run based on alphabetical order if no priority mentioned. 
 * If there are 4 tests and priority is assigned to only 2 and for remaining if
 * there is no prority then order of execution is Alphabetical order of non
 * priority test methods ->priority test methods based on priority.
 */

/*If you want to ignore the test case then give 
@Test(enabled=false)*/

public class PriorityAndSkipTest {

	@Test
	public void atest1() {
		System.out.println("1st  test executed");
	}

	@Test(priority = 1)
	public void btest2() {

		System.out.println("2nd test executed");
	}

	@Test
	public void ctest2() {

		System.out.println("3rd test executed");
	}
	
	@Test(enabled = false)
	public void testSkip() {

		System.out.println("skip this test method");
	}
}
