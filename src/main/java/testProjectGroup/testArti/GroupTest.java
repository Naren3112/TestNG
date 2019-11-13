package testProjectGroup.testArti;

import org.testng.annotations.Test;

public class GroupTest {
	
	//groups run with the help of testng.xml file, if we give group2 then all the test 
	//methods containing group2 will get executed.
	
	@Test(groups = {"group1","group2"})
	public void atest1() {
		System.out.println("group 1 and 2 executed");
	}

	@Test
	public void btest2() {

		System.out.println("2nd test executed");
	}

	@Test(groups = {"group2","group3"})
	public void ctest2() {

		System.out.println("group 2 and 3 executed");
	}
	
	@Test(groups= {"group4"})
	public void testSkip() {

		System.out.println("group 4 executed");
	}

}
