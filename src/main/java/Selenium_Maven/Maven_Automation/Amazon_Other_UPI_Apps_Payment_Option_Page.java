package Selenium_Maven.Maven_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Other_UPI_Apps_Payment_Option_Page 
{
	WebDriver driver;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
	WebElement other_upi_apps_radio_button ;
	
	@FindBy(xpath="//input[@name='__sif_encryptedVPA_collect']")
	WebElement enter_upi_id_txt_field ;
	
	@FindBy(xpath="//input[@name='ppw-widgetEvent:ValidateUpiIdEvent']")
	WebElement verify_upi_id_button ;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement use_this_payment_method_button;
	
	@FindBy(xpath="//span[@class='a-prime-button a-button']")
	WebElement popup;
	
	@FindBy(xpath="(//input[@name='placeYourOrder1'])[3]")
	WebElement place_your_order_and_pay_button;
	
	public void other_upi_apps_radio_button()
	{
		other_upi_apps_radio_button.click();
	}
	public void enter_upi_id_txt_field()
	{
		enter_upi_id_txt_field.sendKeys("7829012043@ybl");
	}
	public void verify_upi_id_button()
	{
		verify_upi_id_button.click();
	}
	public void use_this_payment_method_button()
	{
		use_this_payment_method_button.click();
	}
	public void popup()
	{
		popup.click();
		popup.click();
	}
	public void place_your_order_and_pay_button()
	{
		place_your_order_and_pay_button.click();
	}
	
	public Amazon_Other_UPI_Apps_Payment_Option_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
}
