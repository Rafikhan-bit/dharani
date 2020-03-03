package pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import excelData.ReadData;
import generics.BaseClass;

public class TestCreateAccount extends BaseClass
{
	@Test
	public void testcreateAccount() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		SignInPage sip=new SignInPage();
		sip.clickOnCreateCustomerLink();
		
		SignUpPage sup=new SignUpPage();
		sup.enterName("RafiKhan");
		sup.enteremailID("RafiKhanpathannn@yahoo.com");
		sup.enterPassword("RafikhanPathan");
		sup.clickOnCreateCustomerButton();
		
		
	}

}
