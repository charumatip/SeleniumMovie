package base;

import org.openqa.selenium.WebDriver;

public class BasePage2 {
	protected WebDriver driver;

	public BasePage2(WebDriver driver) {
		this.driver = driver;
	}
	public void load(String endpoint) {
		driver.get("https://askomdch.com/"+ endpoint);
	}

}
