package demov1;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.time.Duration;


public class BaseTestv {
	 protected static WebDriver driver = null;
		@BeforeTest
		private static void invokeBrowser() {			
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().window().maximize();
				driver.get("http://www.google.com");
				
				
		}
		
	@Test
	private static void verifyTitlepage(){
	String strPageTitle = driver.getTitle();
	System.out.println("Page Title: " + strPageTitle);
	Assert.assertEquals(strPageTitle, "Google");
	}
	
@AfterTest
	private static void tearDown()
	{		
			driver.quit();
	}

}
