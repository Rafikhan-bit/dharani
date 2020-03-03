package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BaseClass;

public class SignUpPage 
{
	@FindBy(xpath="//input[@id='txtSignUpUserName' and @name='txtSignUpUserName']")
	private WebElement nameTextField;
	
	@FindBy(xpath="//input[@id='txtSignUpEmail' and @name='txtSignUpEmail']")
	private WebElement emailAddressField;
	
	@FindBy(xpath="//input[@id='txtSignUpPwd' and @name='txtSignUpPwd']")
	private WebElement passWord;
	
	@FindBy(id="btnSignUp")
	private WebElement createAccountButton;
	
	
	
	SignUpPage()
	{
		PageFactory.initElements(BaseClass.driver,this);
	}
	
	public void enterName(String name)
	{
		nameTextField.sendKeys(name);
	}
	
	public  void enteremailID(String emailid)
	{
		emailAddressField.sendKeys(emailid);
	}

	public void enterPassword(String PassWord)
	{
		passWord.sendKeys(PassWord);
	}
	
	public void clickOnCreateCustomerButton()
	{
		createAccountButton.click();
	}
	
	
	
}
