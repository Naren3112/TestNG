package testProjectGroup.testArti;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParametrizingUsingDataProviders {
	
	
	@Test(dataProvider = "testdata")
	public void test1(String name,String id) {
		
		System.out.println(name +" "+ id);
		
	}
	
	
	@DataProvider(name="testdata")
	public Object[][] getData(){
		
		Object a[][]= {{"naren","1"},{"rahul","2"}};
		return a;
		
	}

}
