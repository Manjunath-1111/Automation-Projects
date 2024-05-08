package airline_source;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Airline_MultiCity_Flight_Bookibg_Page
{
	WebDriver driver;
	@FindBy(xpath="//ul[@class='c82cde29']/li/div")
	List <WebElement> select_city;
	
	public void select_city() 
	{
		select_city.get(12).click();
	}
	
	public Airline_MultiCity_Flight_Bookibg_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
