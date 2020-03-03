package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BaseClass;

public class DashBoard 
{
	@FindBy(className="text-capitalize pull-left")
	private WebElement clicOnProfile;
	
	@FindBy(linkText="logout();")
	private WebElement clickOnLogOut;
	
	DashBoard()
	{
		PageFactory.initElements(BaseClass.driver,this);
	}
	
	public void clickOnMyProfile()
	{
		clicOnProfile.click();
	}
	
	public void clickOnLogout()
	{
		clickOnLogOut.click();
	}

}
