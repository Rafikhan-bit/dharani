package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BaseClass;

public class SignInPage
{

	@FindBy(linkText="Create an account")
	private WebElement createAccount;
	
	@FindBy(xpath="//input[@id='txtSignInEmail' and @name='txtSignInEmail']")
	private WebElement eneterusername;
	
	@FindBy(xpath="//input[@id='txtSignInPwd' and @name='txtSignInPwd']")
	private WebElement enterPassword;
	
	@FindBy(name="login.form")
	private WebElement loginButton;
	
	
	SignInPage()
	{
		
		PageFactory.initElements(BaseClass.driver,this);
	}

	public void clickOnCreateCustomerLink()
	{
		createAccount.click();
	}
	
	public void eneterEmailId(String mailid)
	{
		eneterusername.sendKeys(mailid);
	}
	public void enterpassword(String password)
	{
		enterPassword.sendKeys(password);
	}
	public void clickonLoginButton()
	{
		loginButton.click();
	}
}
