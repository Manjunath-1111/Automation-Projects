package Selenium_Maven.Maven_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ddt.Excel_sheet_for_Login;

public class Amazon_SignIn_Page extends Excel_sheet_for_Login
{
	WebDriver driver;
	@FindBy(name="email")
	WebElement email_id;
	
	@FindBy(id="continue")
	WebElement continue_button;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement submit_button;


	public void email_id()
	{
		email_id.sendKeys(un1);
	}
	public void wrong_email_id()
	{
		email_id.sendKeys(un2);
	}
	
	public void continue_button()
	{
		continue_button.click();
	}
	
	public void pass()
	{
		password.sendKeys(pwd1);
	}
	public void wrong_pass()
	{
		password.sendKeys(pwd2);
	}
	
	public void submit()
	{
		submit_button.click();
	}
	
	public Amazon_SignIn_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
}


