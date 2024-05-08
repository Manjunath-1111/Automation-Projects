package airline_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Airline_booking_page 
{
	WebDriver driver;
	@FindBy(xpath="(//button[@class='_7e41f983 bba41d3c  _50baedd0  '])[2]")
	WebElement click_on_book_button;

	@FindBy(xpath="//a[.='Proceed to traveller details']")
	WebElement proceed_to_travellers_details_button;
	
	public void click_on_book_button()
	{
		click_on_book_button.click();
	}
	public void proceed_to_travellers_details_button()
	{
		proceed_to_travellers_details_button.click();
	}
	
	public Airline_booking_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
