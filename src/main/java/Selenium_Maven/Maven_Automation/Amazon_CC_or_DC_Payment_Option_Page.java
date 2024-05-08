package Selenium_Maven.Maven_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_CC_or_DC_Payment_Option_Page 
{
	WebDriver driver;
	Select s1;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement credit_or_debit_card_radio_button ;
	
	@FindBy(xpath="(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]")
	WebElement enter_card_details_link;
	
	@FindBy(name="addCreditCardNumber")
	WebElement enter_card_number ;
	
	@FindBy(name="ppw-expirationDate_month")
	WebElement enter_expiry_month ;
	
	@FindBy(name="ppw-expirationDate_year")
	WebElement enter_expiry_year ;
	
	@FindBy(name="ppw-widgetEvent:AddCreditCardEvent")
	WebElement Pay_with_this_card_button ;
	
	public void credit_or_debit_card_radio_button()
	{
		credit_or_debit_card_radio_button.click();
	}
	public void enter_card_details_link()
	{
		enter_card_details_link.click();
	}
	public void enter_card_number()
	{
		enter_card_number.sendKeys("1234567890123456");
	}
	public void enter_expiry_month()
	{
		s1=new Select(enter_expiry_month);
		s1.selectByIndex(5);
	}
	public void enter_expiry_year()
	{
		s1=new Select(enter_expiry_year);
		s1.selectByIndex(5);
	}
	public void Pay_with_this_card_button()
	{
		Pay_with_this_card_button.click();
	}
	
	public Amazon_CC_or_DC_Payment_Option_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
