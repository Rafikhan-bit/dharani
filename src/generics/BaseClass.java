package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass 
{
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D://Drivers/ChromeDriver.exe");
		driver=new ChromeDriver();
		driver.get("http://cherry3.dharani.org");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@AfterTest
	public  void closeBrowser()
	{
	driver.close();	
	}
	

	
	
}

