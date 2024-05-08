package Selenium_Maven.Maven_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Coupon_Code_Payment_option_Page 
{
	WebDriver driver;
	@FindBy(xpath="//input[@name='ppw-claimCode']")
	WebElement enter_code_txt_field;
	
	@FindBy(xpath="//input[@name='ppw-claimCodeApplyPressed']")
	WebElement apply_button;
	
	public void enter_code_txt_field()
	{
		enter_code_txt_field.sendKeys("AY46YUJD98UJKD349KMD");
	}
	public void apply_button()
	{
		apply_button.click();
	}
	
	public Amazon_Coupon_Code_Payment_option_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
