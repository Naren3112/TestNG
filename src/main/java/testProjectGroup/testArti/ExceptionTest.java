package testProjectGroup.testArti;

import org.testng.annotations.Test;

public class ExceptionTest {

	@Test
	public void atest1() {
		System.out.println("1st  test executed");
	}

	@Test(expectedExceptions =ArithmeticException.class)
	public void btest2() {

		int a=0;
		int b=2;
		int c=b/a;
	}
}

