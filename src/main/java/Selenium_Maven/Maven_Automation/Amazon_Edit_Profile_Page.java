package Selenium_Maven.Maven_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Edit_Profile_Page 
{
	WebDriver driver;
//	Actions a1;
//	@FindBy(xpath="//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']")
//	WebElement account_and_lists ;
	
	@FindBy(linkText="Your Account")
	WebElement Your_Account ;
	
	@FindBy(xpath="(//a[@class='ya-card__whole-card-link'])[2]")
	WebElement Edit_Profile;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@class='a-input-text cvf-widget-input cvf-widget-input-code single-input-box-otp']")
	WebElement otp;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement submit_otp_button;
	
	@FindBy(id="NAME_BUTTON")
	WebElement edit_name_button;
	
	@FindBy(name="customerName")
	WebElement edit_customer_Name;
	
	@FindBy(id="cnep_1C_submit_button")
	WebElement save_changes_button;
	
//	public void account_and_lists()
//	{
//		a1=new Actions(driver);
//		a1.moveToElement(account_and_lists).perform();
//	}
	public void Your_Account()
	{
		Your_Account.click();
	}
	public void Edit_Profile()
	{
		Edit_Profile.click();
	}
	public void password()
	{
		password.sendKeys("Sairam@143");
	}
	public void otp()
	{
		otp.sendKeys("123456");
	}
	public void submit_otp_button()
	{
	submit_otp_button.click();
	}
	public void edit_name_button()
	{
		edit_name_button.click();
	}
	public void edit_customer_Name()
	{
		edit_customer_Name.sendKeys("Manjunath");
	}
	public void save_changes_button()
	{
		save_changes_button.click();
	}
	
	public Amazon_Edit_Profile_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
