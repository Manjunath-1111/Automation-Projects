package airline_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Airline_Different_Classes_Page 
{
	WebDriver driver;
	@FindBy(xpath="(//i[@class='_4b539ab8'])[3]")
	WebElement economy;
	
	@FindBy(xpath="(//i[@class='_4b539ab8'])[4]")
	WebElement premium_economy;
	
	@FindBy(xpath="(//i[@class='_4b539ab8'])[5]")
	WebElement business;
	
	public void economy_class()
	{
		economy.click();
	}
	public void premium_economy_class()
	{
		premium_economy.click();
	}
	public void business_class()
	{
		business.click();
	}
	
	public Airline_Different_Classes_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
