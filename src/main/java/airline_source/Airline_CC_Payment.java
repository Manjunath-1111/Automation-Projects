package airline_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Airline_CC_Payment 
{
	WebDriver driver;
	Select s1;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement click_on_cc_dc_radio_button;
	
	@FindBy(xpath="//input[@name='addCreditCardNumber']")
	WebElement enter_cc_number;
	
	@FindBy(xpath="//select[@name='ppw-expirationDate_month']")
	WebElement select_month;
	
	@FindBy(xpath="//select[@name='ppw-expirationDate_year']")
	WebElement select_year;
	
	@FindBy(xpath="//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
	WebElement enter_card_details_button;
	
	public void click_on_cc_dc_radio_button()
	{
		click_on_cc_dc_radio_button.click();
	}
	public void enter_cc_number()
	{
		enter_cc_number.sendKeys("0123456789012345");
	}
	public void select_month()
	{
		s1=new Select(select_month);
		s1.selectByIndex(4);
	}
	public void select_year()
	{
		s1=new Select(select_year);
		s1.selectByIndex(4);	
	}
	public void enter_card_details_button()
	{
		enter_card_details_button.click();
	}
	
	public Airline_CC_Payment(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
