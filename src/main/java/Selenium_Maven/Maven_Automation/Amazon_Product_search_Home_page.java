package Selenium_Maven.Maven_Automation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Product_search_Home_page 
{
	Point p1;
	JavascriptExecutor jse;
	WebDriver driver;
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search_field ;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement search_button;
	
	@FindBy(xpath="(//img[@class='s-image'])[2]")
	WebElement select_item;
	
	@FindBy(xpath="(//a[@id='acrCustomerReviewLink'])[2]")
	WebElement product_details;
	
	public void search_field()
	{
		search_field.sendKeys("shoes");
	}
	public void search_button()
	{
		search_button.click();
	}
	public void select_item()
	{
		select_item.click();
	}
	public void product_details()
	{
		p1=product_details.getLocation();
		int x=p1.getX();
		int y=p1.getY();
		System.out.println(y);
		jse=  (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,"+y+")");
		
	}
	
	public Amazon_Product_search_Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
