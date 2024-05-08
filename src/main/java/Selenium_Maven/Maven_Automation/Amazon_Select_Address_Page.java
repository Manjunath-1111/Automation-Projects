package Selenium_Maven.Maven_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Select_Address_Page 
{
	WebDriver driver;
	@FindBy(xpath="//a[@class='a-link-normal expand-panel-button expand-collapsed-panel-trigger']")
	WebElement change_address_link ;
	
	@FindBy(xpath="(//input[@name='submissionURL'])[2]")
	WebElement select_address ;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement use_this_address_button ;
	
	public void change_address_link()
	{
		change_address_link.click();
	}
	public void select_address()
	{
		select_address.click();
	}
	public void use_this_address_button()
	{
		use_this_address_button.click();
	}
	
	public Amazon_Select_Address_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
