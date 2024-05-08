package Selenium_Maven.Maven_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ddt.Excel_sheet_for_Login;

public class Amazon_SignIn_Page2 extends Excel_sheet_for_Login
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
	
	@FindBy(xpath="//input[@name='field-keywords']")
	WebElement enter_captcha;
	
	@FindBy(xpath="//button[@class='a-button-text']")
	WebElement continue_shopping_button;
	
	@FindBy(xpath="//input[@name='otpCode']")
	WebElement enter_otp;
	
	@FindBy(xpath="//input[@name='mfaSubmit']")
	WebElement sign_in_button;


	public void email_id()
	{
		email_id.sendKeys(un3);
	}

	public void continue_button()
	{
		continue_button.click();
	}
	
	public void pass()
	{
		password.sendKeys(pwd3);
	}

	public void submit()
	{
		submit_button.click();
	}
	public void enter_captcha()
	{
		enter_captcha.sendKeys("ma");
	}
	public void continue_shopping_button()
	{
		continue_shopping_button.click();
	}
	public void enter_otp()
	{
		enter_otp.sendKeys("11");
	}
	public void sign_in_button()
	{
		sign_in_button.click();
	}

	public Amazon_SignIn_Page2 (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
}


