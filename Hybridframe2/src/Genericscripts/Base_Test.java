package Genericscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_constants   {

	public WebDriver driver;
	@BeforeMethod
	public void openapplication()
	{
		System.setProperty(gecko_key,gecko_value);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
	}
	@AfterMethod
	public void closeapplication(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Generic_screenshot.getphoto(driver);
		}
	
		driver.close();
	}


	}

	
	
	

