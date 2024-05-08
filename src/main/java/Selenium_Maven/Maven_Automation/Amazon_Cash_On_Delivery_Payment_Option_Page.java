package Selenium_Maven.Maven_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Cash_On_Delivery_Payment_Option_Page 
{
	WebDriver driver;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[5]")
	WebElement cash_on_delivery_radio_button ;

	@FindBy(xpath="//div[@class='a-row continue-buttons place-order-button']")
	WebElement use_this_payment_method_button;
	
	@FindBy(xpath="//span[@id='submitOrderButtonId']")
	WebElement place_your_order_button;
	
	public void cash_on_delivery_radio_button()
	{
		cash_on_delivery_radio_button.click();
	}
	public void use_this_payment_method_button()
	{
		use_this_payment_method_button.click();
	}
	public void place_your_order_button()
	{
		place_your_order_button.click();
	}
	
	public Amazon_Cash_On_Delivery_Payment_Option_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
