package Selenium_Maven.Maven_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Proceed_to_Buy_Product_Page 
{
	WebDriver driver;
	@FindBy(xpath="//input[@name='submit.buy-now']")
	WebElement buy_now_without_adding_cart;
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement proceed_to_buy_after_adding_cart;
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement proceed_to_buy_after_view_cart;
	
	public void buy_now_without_adding_cart()
	{
		buy_now_without_adding_cart.click();
	}
	public void proceed_to_buy_after_adding_cart()
	{
		proceed_to_buy_after_adding_cart.click();
	}
	public void proceed_to_buy_after_view_cart()
	{
		proceed_to_buy_after_view_cart.click();
	}
	
	public Amazon_Proceed_to_Buy_Product_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
