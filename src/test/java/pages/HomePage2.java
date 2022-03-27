package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage2;


public class HomePage2 extends BasePage2{
	public HomePage2(WebDriver driver) {
		super(driver);
			}	
	public HomePage2 load() {
		load("/");
		return this;
	}
	
	private By storeMenuLink = By.xpath("//a[contains(text(),'Store')]");
	
	public void clickstoreMenuLink() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(storeMenuLink).click();
		
	}
	
//above concept fluent interface
	

}
