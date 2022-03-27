package base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import driverFactory.DriverManage;

public class BaseTest2 {
protected static WebDriver driver;

@BeforeSuite
public void startDriver() {
	driver = new DriverManage().initializeDriver();
}

@AfterSuite
public void closeDriver() {
	driver.quit();
}

/*
 * @AfterSuite public void endDriver(ITestResult result) throws IOException {
 * if(result.getStatus()== ITestResult.FAILURE) { File destFile = new
 * File("src"+ File.separator +
 * result.getTestClass().getRealClass().getSimpleName()+"-"
 * +result.getMethod().getMethodName()+".png"); takeScreenshot(destFile);
 * driver.quit(); }
 * 
 * }//TakesScreenshot scrShot =((TakesScreenshot)webdriver); private void
 * takeScreenshot(File destFile) throws IOException { TakesScreenshot tc
 * =(TakesScreenshot) driver; File SrcFile=tc.getScreenshotAs(OutputType.FILE);
 * FileUtils.copyFile(SrcFile, destFile); }
 */
}
