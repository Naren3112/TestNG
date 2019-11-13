package testProjectGroup.testArti;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizingTestUsingXml {

	   @Test
	   @Parameters({"firstname","lastname"})
	   public void parameterTest(String firstname,String lastname) {
	      System.out.println("Hi  " + firstname + lastname);
	   }
}
