package Selenium_Maven.Maven_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_ratings_Returns_and_Orders_Page 
{
	WebDriver driver;
	@FindBy(xpath="//a[@class='nav-a nav-a-2   nav-progressive-attribute']")
	WebElement returns_and_orders_link;
	
	@FindBy(xpath="(//a[@class='a-button-text'])[4]")
	WebElement Write_a_product_review_link;
	
	@FindBy(xpath="(//button[@class='ryp__star__button'])[5]")
	WebElement rating_button;
	
	@FindBy(xpath="//textarea[@placeholder='What did you like or dislike? What did you use this product for?']")
	WebElement write_review;
	
	@FindBy(xpath="//button[.='Submit']")
	WebElement submit_button;
	
	public void returns_and_orders_link()
	{
		returns_and_orders_link.click();
	}
	public void Write_a_product_review_link()
	{
		Write_a_product_review_link.click();
	}
	public void rating_button()
	{
		rating_button.click();
	}
	public void write_review()
	{
		write_review.sendKeys("Good Product");
	}
	public void submit_button()
	{
		submit_button.click();
	}
	
	public Amazon_ratings_Returns_and_Orders_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
