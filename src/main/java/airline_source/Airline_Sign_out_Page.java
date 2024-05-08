package airline_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Airline_Sign_out_Page 
{
	WebDriver driver;
	Actions a1;
	@FindBy(xpath="//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']")
	WebElement accounts_and_lists_button;
	
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement sign_out_button;
	
	public void accounts_and_lists_button()
	{
		a1=new Actions(driver);
		a1.moveToElement(accounts_and_lists_button).build().perform();
	}
	public void sign_out_button()
	{
		sign_out_button.click();
	}
	
	public Airline_Sign_out_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
