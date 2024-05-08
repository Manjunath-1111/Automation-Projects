package airline_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Airline_Payment_Page 
{
	WebDriver driver;
	@FindBy(xpath="//i[@class='d726bd8f _4d2636f0']")
	WebElement click_on_checkbox ;
 
	@FindBy(xpath="//button[.='Proceed to Payment']")
	WebElement proceed_to_payment_button;
	
	public void click_on_checkbox()
	{
		click_on_checkbox.click();
	}
	public void proceed_to_payment_button()
	{
		proceed_to_payment_button.click();
	}
	
	public Airline_Payment_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
