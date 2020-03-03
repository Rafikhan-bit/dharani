package pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import excelData.ReadData;
import generics.BaseClass;

public class SecondScript extends BaseClass
{
	@Test
	public void login() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		SignInPage sip=new SignInPage();
		
		String username=ReadData.readData("Sheet1",1,0);
		sip.eneterEmailId(username);
		
		String password=ReadData.readData("Sheet1", 2,0);
		sip.enterpassword(password);
		
		sip.clickonLoginButton();
	}

}
