package airline_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Airline_booking_Adult_traveller_details_page 
{
	WebDriver driver;
	@FindBy(xpath="(//span[@class='e5140519 _221e1ca9'])[1]")
	WebElement add_new_adults_button;
	
	@FindBy(xpath="(//div[@class='edb7cb84'])[1]")
	WebElement gender_button ;
	
	@FindBy(xpath="(//li[.='Male'])[1]")
	WebElement select_gender;
	
	@FindBy(xpath="(//input[@name='first_name'])[1]")
	WebElement enter_first_name;
	
	@FindBy(xpath="(//input[@name='last_name'])[1]")
	WebElement enter_last_name;
	
	@FindBy(xpath="//button[.='Add adult']")
	WebElement add_adult_button;
	
	public void add_new_adults_button()
	{
		add_new_adults_button.click();
	}
	public void gender_button()
	{
		gender_button.click();
	}
	public void select_gender()
	{
		select_gender.click();
	}
	public void enter_first_name()
	{
		enter_first_name.sendKeys("Manjunath");
	}
	public void enter_last_name()
	{
		enter_last_name.sendKeys("M");
	}
	public void add_adult_button()
	{
		add_adult_button.click();
	}
	
	public void add_new_adults_button1()
	{
		add_new_adults_button.click();
	}
	public void gender_button1()
	{
		gender_button.click();
	}
	public void select_gender1()
	{
		select_gender.click();
	}
	public void enter_first_name1()
	{
		enter_first_name.sendKeys("Ayodhya");
	}
	public void enter_last_name1()
	{
		enter_last_name.sendKeys("A");
	}
	public void add_adult_button1()
	{
		add_adult_button.click();
	}
	
	public void add_new_adults_button2()
	{
		add_new_adults_button.click();
	}
	public void gender_button2()
	{
		gender_button.click();
	}
	public void select_gender2()
	{
		select_gender.click();
	}
	public void enter_first_name2()
	{
		enter_first_name.sendKeys("Lanka");
	}
	public void enter_last_name2()
	{
		enter_last_name.sendKeys("B");
	}
	public void add_adult_button2()
	{
		add_adult_button.click();
	}
	
	public void add_new_adults_button3()
	{
		add_new_adults_button.click();
	}
	public void gender_button3()
	{
		gender_button.click();
	}
	public void select_gender3()
	{
		select_gender.click();
	}
	public void enter_first_name3()
	{
		enter_first_name.sendKeys("Priyanka");
	}
	public void enter_last_name3()
	{
		enter_last_name.sendKeys("M");
	}
	public void add_adult_button3()
	{
		add_adult_button.click();
	}
	public void add_new_adults_button4()
	{
		add_new_adults_button.click();
	}
	public void gender_button4()
	{
		gender_button.click();
	}
	public void select_gender4()
	{
		select_gender.click();
	}
	public void enter_first_name4()
	{
		enter_first_name.sendKeys("Ram");
	}
	public void enter_last_name4()
	{
		enter_last_name.sendKeys("C");
	}
	public void add_adult_button4()
	{
		add_adult_button.click();
	}
	public void add_new_adults_button5()
	{
		add_new_adults_button.click();
	}
	public void gender_button5()
	{
		gender_button.click();
	}
	public void select_gender5()
	{
		select_gender.click();
	}
	public void enter_first_name5()
	{
		enter_first_name.sendKeys("Laxman");
	}
	public void enter_last_name5()
	{
		enter_last_name.sendKeys("D");
	}
	public void add_adult_button5()
	{
		add_adult_button.click();
	}
	public void add_new_adults_button6()
	{
		add_new_adults_button.click();
	}
	public void gender_button6()
	{
		gender_button.click();
	}
	public void select_gender6()
	{
		select_gender.click();
	}
	public void enter_first_name6()
	{
		enter_first_name.sendKeys("Sita");
	}
	public void enter_last_name6()
	{
		enter_last_name.sendKeys("R");
	}
	public void add_adult_button6()
	{
		add_adult_button.click();
	}
	public void add_new_adults_button7()
	{
		add_new_adults_button.click();
	}
	public void gender_button7()
	{
		gender_button.click();
	}
	public void select_gender7()
	{
		select_gender.click();
	}
	public void enter_first_name7()
	{
		enter_first_name.sendKeys("Anjaneya");
	}
	public void enter_last_name7()
	{
		enter_last_name.sendKeys("S");
	}
	public void add_adult_button7()
	{
		add_adult_button.click();
	}
	public void add_new_adults_button8()
	{
		add_new_adults_button.click();
	}
	public void gender_button8()
	{
		gender_button.click();
	}
	public void select_gender8()
	{
		select_gender.click();
	}
	public void enter_first_name8()
	{
		enter_first_name.sendKeys("Ravana");
	}
	public void enter_last_name8()
	{
		enter_last_name.sendKeys("R");
	}
	public void add_adult_button8()
	{
		add_adult_button.click();
	}
	
	
	public Airline_booking_Adult_traveller_details_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
