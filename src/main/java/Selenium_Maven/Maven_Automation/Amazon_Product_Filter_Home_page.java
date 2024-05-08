package Selenium_Maven.Maven_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Product_Filter_Home_page 
{
	WebDriver driver;
	@FindBy(xpath="//li[@id='p_72/1318476031']")
	WebElement ratings ;
	
	@FindBy(xpath="//span[.='₹2,500 - ₹5,000']")
	WebElement price_range  ;
	
	@FindBy(xpath="//span[.='50% Off or more']")
	WebElement discount ;
	
	@FindBy(xpath="//span[.='Get It in 2 Days']")
	WebElement delivery_day_options  ;
	
	@FindBy(xpath="//span[.='Eligible for Pay On Delivery']")
	WebElement pay_on_delivery  ;
	
	@FindBy(xpath="//span[.='Last 30 days']")
	WebElement new_arraivals ;
	
	public void ratings()
	{
		ratings.click();
	}
	public void price_range()
	{
		price_range.click();
	}
	public void discount()
	{
		discount.click();
	}
	public void delivery_day_options()
	{
		delivery_day_options.click();
	}
	public void pay_on_delivery()
	{
		pay_on_delivery.click();
	}
	public void new_arraivals()
	{
		new_arraivals.click();
	}
	
	public Amazon_Product_Filter_Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

