package Selenium_Maven.Maven_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Update_Product_Qty_and_Remove_Product_From_Cart_Page 
{
	WebDriver driver;
	Select s1;
	@FindBy(xpath="//select[@name='quantity']")
	WebElement qty_drop_down_button ;
	
	@FindBy(xpath="//input[@name='quantityBox']")
	WebElement qty_txt_field;
	
	@FindBy(xpath="//a[@class='a-button-text']")
	WebElement update_qty;
	
	@FindBy(xpath="//input[@value='Delete']")
	WebElement delete_button ;
	
	public void update_product_quantity1()
	{
		s1=new Select(qty_drop_down_button);
		s1.selectByVisibleText("1");
	}
	public void update_product_quantity2()
	{
		s1=new Select(qty_drop_down_button);
		s1.selectByVisibleText("2");
	}
	public void update_product_quantity3()
	{
		s1=new Select(qty_drop_down_button);
		s1.selectByVisibleText("3");
	}
	public void update_product_quantity10above()
	{
		s1=new Select(qty_drop_down_button);
		s1.selectByVisibleText("10+");
	}
	public void qty_txt_field()
	{
		qty_txt_field.sendKeys("100");
	}
	public void update_qty()
	{
		update_qty.click();
	}
	public void delete_item()
	{
		delete_button.click();
	}
	
	public Amazon_Update_Product_Qty_and_Remove_Product_From_Cart_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
