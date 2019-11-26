package testProjectGroup.testArti;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumExceptions {
	
	
	WebDriver driver=null;
	
	private void waitForSometime() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(description = "IllegalStateException",enabled = false)
	public void test1(){
		
		//System.setProperty("webdriver.chrome.driver", "D:/driver//chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("www.google.com");
	}

	@Test(description = "no such element exception",enabled = false)
	public void test2(){
		System.setProperty("webdriver.chrome.driver", "D:/driver//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		waitForSometime();
		driver.findElement(By.xpath("(//input[@value='google Search'])[2]")).click();
	}

	@Test(description = "no such window exception",enabled = false)
	public void test3(){
		System.setProperty("webdriver.chrome.driver", "D:/driver//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.switchTo().window("xyz");
	}
	

	@Test(description = "no such frame exception",enabled = false)
	public void test4(){
		System.setProperty("webdriver.chrome.driver", "D:/driver//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.switchTo().frame(21);
	}

	@Test(description = "no such alert exception",enabled = false)
	public void test5(){
		System.setProperty("webdriver.chrome.driver", "D:/driver//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
	}

	@Test(description = "no such attribute exception",enabled = false)
	public void test6(){
		System.setProperty("webdriver.chrome.driver", "D:/driver//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement att=driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		String attribute=att.getAttribute("xyz");
		
	}

	@Test(description = "Invalid selector exception",enabled = false)
	public void test7(){
		System.setProperty("webdriver.chrome.driver", "D:/driver//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		//gave extra brackets which resulted in invalid selector
		WebElement att=driver.findElement(By.xpath("(//input[@value='Google Search'])[2]))"));

	}
	
	@Test(description = "Element not visible exception/element not interactable exception",enabled = false)
	public void test8(){
		System.setProperty("webdriver.chrome.driver", "D:/driver//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://platform.drawbrid.ge");
		driver.manage().window().maximize();
		waitForSometime();
		driver.findElement(By.xpath(".//*[@id='_loginButton']")).click();
		
	
	}
	
	@Test(description = "No such session exception",enabled= false)
	public void test9(){
		System.setProperty("webdriver.chrome.driver", "D:/driver//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("C:/Users/ntalakokkula.PROKARMA/Desktop/hello.html");
		driver.close();
		driver.manage().window().maximize();

	}
	@Test(description = "No such session exception")
	public void test10(){
		System.setProperty("webdriver.chrome.driver", "D:/driver//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("C:/Users/ntalakokkula.PROKARMA/Desktop/hello.html");
		driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();

	}
}
