package Selenium_Maven.Maven_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Add_to_cart_Product_Page 
{
	WebDriver driver;
	@FindBy(xpath="//input[@title='Add to Shopping Cart']")
	WebElement add_to_cart_button  ;

	@FindBy(xpath="//a[@class='nav-a nav-a-2 nav-progressive-attribute']")
	WebElement view_cart_link;
	
	public void add_to_cart()
	{
		add_to_cart_button.click();
	}
	public void view_cart()
	{
		view_cart_link.click();
	}
	
	public Amazon_Add_to_cart_Product_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
