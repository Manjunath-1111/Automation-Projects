package airline_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Airline_offers_and_PromoCode_Page 
{
	WebDriver driver;
	@FindBy(xpath="//div[@class='_7c598c35 a69d62e8']")
	WebElement apply_offer_button;
	
	public void apply_offer_button()
	{
		apply_offer_button.click();
	}
	
	public Airline_offers_and_PromoCode_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
