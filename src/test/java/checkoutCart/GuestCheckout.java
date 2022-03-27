package checkoutCart;



import org.testng.annotations.Test;

import base.BaseTest2;
import pages.HomePage2;
import pages.StorePage2;

public class GuestCheckout extends BaseTest2 {
	
	
		@Test(priority=1)
		private static void homepageActions() throws InterruptedException {	
			
			HomePage2 homepage = new HomePage2(driver).load();
			homepage.clickstoreMenuLink();
		}
			@Test(priority=2)
			private static void storePageAction() throws InterruptedException {
			
			StorePage2 sp = new StorePage2(driver);
			sp.enterTextInsearchFld().clickSearchBtn().getTitletext();							
		    sp.clickAddToCartBtn();
		    sp.textView();
				
			/*
			 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 * driver.findElement(By.xpath("//input[@placeholder='Search products…']")).
			 * sendKeys("Blue");
			 * driver.findElement(By.cssSelector("button[value='Search']")).click(); String
			 * s =
			 * driver.findElement(By.cssSelector("#main > div > header > h1")).getText();
			 * System.out.println(s); Assert.assertEquals(
			 * driver.findElement(By.cssSelector("#main > div > header > h1")).getText()
			 * ,"Search results: “Blue”");
			 * 
			 * Actions a = new Actions(driver);
			 * a.sendKeys(Keys.PAGE_DOWN).build().perform(); driver.findElement(By.
			 * cssSelector("a[aria-label='Add “Blue Shoes” to your cart']")).click();
			 */				
			/*
			 * WebElement ele1 = driver.findElement(By.
			 * cssSelector("a[aria-label='Add “Blue Shoes” to your cart']")); new
			 * WebDriverWait(driver,
			 * Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ele1)).
			 * click();
			 */
			
					/*
					 * or Assert.assertEquals(storepage.getTitle(), "Store"); Thread.sleep(5000);
					 * 
					 * driver.findElement(By.cssSelector("a[title='View cart']")).click();
					 * 
					 * String s2 = driver.findElement(By.xpath(
					 * "//*[@id=\"post-1220\"]/div/div/div/div/form/table/tbody/tr[1]/td[3]/a"))
					 * .getText(); System.out.println(s2);
					 * 
					 * Actions a2 = new Actions(driver);
					 * a.sendKeys(Keys.PAGE_DOWN).build().perform(); driver.findElement(By.
					 * cssSelector("a[class='checkout-button button alt wc-forward']")).click();
					 * 
					 * 
					 * WebElement ele=
					 * driver.findElement(By.xpath("//a[@class='added_to_cart wc-forward']")); new
					 * WebDriverWait(driver,
					 * Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ele)).
					 * click();
					 * 
					 * Thread.sleep(5000);
					 * driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Aena");
					 * driver.findElement(By.xpath("//input[@id='billing_last_name']")).sendKeys(
					 * "Modi");
					 * driver.findElement(By.xpath("//input[@id='billing_company']")).sendKeys(
					 * "Gujarat");
					 * 
					 * 
					 * Select sel = new Select(driver.findElement(By.
					 * xpath("//span[@class='select2-selection__arrow' or role='presentation']")));
					 * sel.deselectByVisibleText("Uruguay");
					 * 
					 */
		}

}
 
 
