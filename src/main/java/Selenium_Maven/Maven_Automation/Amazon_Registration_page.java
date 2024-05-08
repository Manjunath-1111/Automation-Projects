package Selenium_Maven.Maven_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ddt.Excel_sheet_for_Login;

public class Amazon_Registration_page extends Excel_sheet_for_Login
{
	WebDriver driver;
	@FindBy(name="customerName")
	WebElement customer_name ;
	
	@FindBy(name="email")
	WebElement email_id ;
	
	@FindBy(name="password")
	WebElement password ;
	
	@FindBy(name="passwordCheck")
	WebElement password_Check ;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement Create_your_account_button;
	
	public void customer_name()
	{
		customer_name.sendKeys("Manjunath");
	}
	public void emailid()
	{
		email_id.sendKeys(un1);
	}
	public void password()
	{
		password.sendKeys(pwd1);
	}
	public void re_enter_password()
	{
		password_Check.sendKeys(pwd1);
	}
	public void Create_your_account_button()
	{
		Create_your_account_button.click();
	}
	
	public Amazon_Registration_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
