package airline_source;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Airline_OneWay_Flight_Booking_Page
{
	WebDriver driver;
	@FindBy(xpath="//span[.='One Way']")
	WebElement one_way_booking;
	
	@FindBy(xpath="(//span[@class='colorBase sizeMedium _8d2f006b _79bb5d49'])[1]")
	WebElement click_on_source_place_button ;
	
	@FindBy(xpath="//input[@name='searchText']")
	WebElement enter_source_place_name;
	
	@FindBy(xpath="//div[@class='_1a6c1b03']/div/div")
	List<WebElement> select_source_place;
	
	@FindBy(xpath="(//span[@class='colorBase sizeMedium _8d2f006b _79bb5d49'])[2]")
	WebElement click_on_destination_place ;
	
	@FindBy(xpath="//input[@name='searchText']")
	WebElement enter_destination_place_name;
	
	@FindBy(xpath="//div[@class='_1a6c1b03']/div/div")
	List<WebElement> select_destination_place;
	
	@FindBy(xpath="(//div[@class='_79bb5d49'])[1]")
	WebElement  click_on_date_of_travel;
	
	@FindBy(xpath="//div[@class='_8bd51405']/ul/li")
	List<WebElement> select_date ;
	
	@FindBy(xpath="//div[@class='sizeMedium a8cdd5cb']")
	WebElement click_on_travellers_and_economy  ;
	
	@FindBy(xpath="//div[@class='_4e0ac60f _75ad9cd5 ad23ce76']/div/button")
	List<WebElement> select_adults;
	
	@FindBy(xpath="//button[@class='_7e41f983 bba41d3c  _50baedd0  ']")
	WebElement search_button ;

	public void one_way_booking()
	{
		one_way_booking.click();
	}
	public void click_on_source_place_button()
	{
		click_on_source_place_button.click();
	}
	public void enter_source_place_name()
	{
		enter_source_place_name.sendKeys("BLR");
	}
	public void select_source_place()
	{
		select_source_place.get(1).click();
	}
	
	public void click_on_destination_place()
	{
		click_on_destination_place.click();
	}
	public void enter_destination_place_name()
	{
		enter_destination_place_name.sendKeys("DEL");
	}
	public void select_destination_place()
	{
		select_destination_place.get(1).click();
	}
	public void click_on_date_of_travel()
	{
		click_on_date_of_travel.click();
	}
	public void select_date() throws InterruptedException
	{
		
		select_date.get(25).click();
//		Thread.sleep(1000);
//		select_date.get(31).click();
		
	}
	public void click_on_travellers_and_economy()
	{
		click_on_travellers_and_economy.click();
	}
	public void select_adults() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(5).click();
		Thread.sleep(1000);
		select_adults.get(12).click();
		Thread.sleep(1000);
		select_adults.get(20).click();
	}

	public void search_button()
	{
		search_button.click();
	}
	
	public Airline_OneWay_Flight_Booking_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
