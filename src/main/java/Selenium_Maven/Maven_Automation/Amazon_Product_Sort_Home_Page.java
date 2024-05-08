package Selenium_Maven.Maven_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Product_Sort_Home_Page 
{
	WebDriver driver;
	Select s1;
	@FindBy(xpath="//select[@class='a-native-dropdown a-declarative']")
	WebElement sort_option_dd_button ;

	
	
	public void sort_by_featured()
	{
		s1=new Select(sort_option_dd_button);
		s1.selectByVisibleText("Featured");
	}
	public void sort_by_Price_Low_to_High()
	{
		s1=new Select(sort_option_dd_button);
		s1.selectByVisibleText("Price: Low to High");
	}
	public void sort_by_Price_High_to_Low()
	{
		s1=new Select(sort_option_dd_button);
		s1.selectByVisibleText("Price: High to Low");
	}
	public void sort_by_Avg_Customer_Review()
	{
		s1=new Select(sort_option_dd_button);
		s1.selectByVisibleText("Avg. Customer Review");
	}
	public void sort_by_Newest_Arrivals()
	{
		s1=new Select(sort_option_dd_button);
		s1.selectByVisibleText("Newest Arrivals");
	}
	
	public Amazon_Product_Sort_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
