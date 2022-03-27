package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import base.BasePage2;

public class StorePage2 extends BasePage2{

	public StorePage2(WebDriver driver) {
		super(driver);
		
	}
	
	private By searchFld = By.xpath("//input[@class='search-field']");
	private By searchBtn= By.cssSelector("button[value='Search']");
	private By title= By.cssSelector("#main > div > header > h1");
	private By addToCartBtn = By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']");
	private  By viewText= By.cssSelector("a[title='View cart']");
	
public StorePage2  enterTextInsearchFld() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(searchFld).sendKeys("Blue");
	
	return this;
    }
	public StorePage2 clickSearchBtn() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(searchBtn).click();
		return this;
	}
	public StorePage2 getTitletext() throws InterruptedException {
		Thread.sleep(3000);		
	String ss= driver.findElement(title).getText();
	System.out.println("Right result........." + ss);
	return this;
	}
	public  void clickAddToCartBtn() throws InterruptedException {
		
		 Actions a = new Actions(driver);
		  a.sendKeys(Keys.PAGE_DOWN).build().perform();
		  Thread.sleep(2000);
		driver.findElement(addToCartBtn).click();
	
	}
	public  void textView() throws InterruptedException{
		 Thread.sleep(5000);
	driver.findElement(viewText).click();
}
}

