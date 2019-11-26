package testProjectGroup.testArti;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class BrokenLinks {
	
	
	@Test
	public void test() {
		
		String uRL="https://www.google.com/";
		ArrayList<String> al=new ArrayList<String>();
		al.add("https://www.google.com/");
		al.add("https://www.facebook.com/");
		al.add("http://ggle.com/");
		
		for(String s:al) {
		
		 getBrokenLinks(s);
		}
	}

	public void getBrokenLinks(String uRL) {
		// TODO Auto-generated method stub
		
		try {
			URL url=new URL(uRL);
			try {
				HttpURLConnection conn=(HttpURLConnection) url.openConnection();
				conn.connect();
				int respCode=conn.getResponseCode();
				System.out.println("resp code"+respCode );
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
