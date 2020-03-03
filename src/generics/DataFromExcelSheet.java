package generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.chrome.ChromeDriver;

import excelData.ReadData;

public class DataFromExcelSheet
{
	ChromeDriver driver;
	public void gettingdataFromExcelSheet() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
	String username=ReadData.readData("Sheet1",1,0);
	String password=ReadData.readData("Sheet1", 2,0);
	

System.setProperty("webdriver.chrome.driver","D://Drivers/ChromeDriver.exe");
driver=new ChromeDriver();
driver.get("http://cherry3.dharani.org");
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);


	
	

}
}
