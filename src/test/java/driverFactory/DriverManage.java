package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManage{
	public WebDriver  initializeDriver(){			
		WebDriver	driver = new ChromeDriver();		
		driver.manage().window().maximize();
		return driver;
}
}