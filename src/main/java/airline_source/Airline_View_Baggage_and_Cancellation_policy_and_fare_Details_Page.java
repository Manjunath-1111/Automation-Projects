package airline_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Airline_View_Baggage_and_Cancellation_policy_and_fare_Details_Page 
{
	WebDriver driver;
	@FindBy(xpath="//div[@class='_7c598c35 ']")
	WebElement view_baggage_and_cancellation_policy_button;
	
	@FindBy(xpath="(//div[@class='tabListInner'])[2]")
	WebElement cancellation_policy;
	
	@FindBy(xpath="(//div[@class='tabListInner'])[3]")
	WebElement date_change_policy;
	
	@FindBy(xpath="(//div[@class='tabListInner'])[1]")
	WebElement baggage_details;
	
	@FindBy(xpath="//div[@class='_7c598c35 a69d62e8']")
	WebElement view_fare_details;
	
	public void view_baggage_and_cancellation_policy_button()
	{
		view_baggage_and_cancellation_policy_button.click();
	}
	public void cancellation_policy()
	{
		cancellation_policy.click();
	}
	public void date_change_policy()
	{
		date_change_policy.click();
	}
	public void baggage_details()
	{
		baggage_details.click();
	}
	public void view_fare_details()
	{
		view_fare_details.click();
	}
	
	public Airline_View_Baggage_and_Cancellation_policy_and_fare_Details_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
